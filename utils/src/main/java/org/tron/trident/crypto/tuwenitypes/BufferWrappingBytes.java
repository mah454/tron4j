/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.tron.trident.crypto.tuwenitypes;

import java.nio.ByteBuffer;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkElementIndex;

class BufferWrappingBytes extends AbstractBytes {

    protected final ByteBuffer buffer;

    BufferWrappingBytes(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    BufferWrappingBytes(ByteBuffer buffer, int offset, int length) {
        checkArgument(length >= 0, "Invalid negative length");
        int bufferLength = buffer.capacity();
        checkElementIndex(offset, bufferLength + 1);
        checkArgument(
                offset + length <= bufferLength,
                "Provided length %s is too big: the buffer has size %s and has only %s bytes from %s",
                length,
                bufferLength,
                bufferLength - offset,
                offset);

        if (offset == 0 && length == bufferLength) {
            this.buffer = buffer;
        } else {
            this.buffer = buffer.slice(offset, offset + length);
        }
    }

    @Override
    public int size() {
        return buffer.capacity();
    }

    @Override
    public byte get(int i) {
        return buffer.get(i);
    }

    @Override
    public int getInt(int i) {
        return buffer.getInt(i);
    }

    @Override
    public long getLong(int i) {
        return buffer.getLong(i);
    }

    @Override
    public Bytes slice(int i, int length) {
        int size = buffer.capacity();
        if (i == 0 && length == size) {
            return this;
        }
        if (length == 0) {
            return Bytes.EMPTY;
        }

        checkElementIndex(i, size);
        checkArgument(
                i + length <= size,
                "Provided length %s is too big: the value has size %s and has only %s bytes from %s",
                length,
                size,
                size - i,
                i);

        return new BufferWrappingBytes(buffer.slice(i, i + length));
    }

    // MUST be overridden by mutable implementations
    @Override
    public Bytes copy() {
        return Bytes.wrap(toArray());
    }

    @Override
    public MutableBytes mutableCopy() {
        return MutableBytes.wrap(toArray());
    }

    @Override
    public void appendTo(ByteBuffer buffer) {
        buffer.put(this.buffer);
    }

    @Override
    public byte[] toArray() {
        buffer.flip();
        return buffer.array();
    }
}