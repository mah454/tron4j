## Java SDK Crypto Currency Tron Network

This sdk copied from https://github.com/tronprotocol/trident .

**Changes :**

* Refactor to maven
* Compatible with Java 21
* Removed wrong dependencies
* CleanUp and improvements

**Note :** Ignored protobuf classes on `.gitignore` file .
Run this command :   
Compile and installed library on `$HOME/.m2` .

```shell
mvn clean compile package install
```

Now use libraries on your project :

```xml

<dependencies>
    <dependency>
        <groupId>ir.moke.tron4j</groupId>
        <artifactId>abi</artifactId>
        <version>0.1</version>
    </dependency>
    <dependency>
        <groupId>ir.moke.tron4j</groupId>
        <artifactId>utils</artifactId>
        <version>0.1</version>
    </dependency>
    <dependency>
        <groupId>ir.moke.tron4j</groupId>
        <artifactId>core</artifactId>
        <version>0.1</version>
    </dependency>
</dependencies>
```
