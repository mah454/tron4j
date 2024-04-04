## Java SDK Crypto Currency Tron Network

This sdk copied from https://github.com/tronprotocol/trident .

**Changes :**

* Refactor to maven
* Compatible with Java 21
* Removed wrong dependencies
* CleanUp and improvements

**Note :** Protobuf compiled classes ignored on `.gitignore` file .
Run this command :   
Compile and installed library on `$HOME/.m2` .

```shell
mvn clean compile package install
```

Now use libraries on your project :

```xml

<dependencies>
    <dependency>
        <groupId>org.tron.trident</groupId>
        <artifactId>abi</artifactId>
        <version>0.1</version>
    </dependency>
    <dependency>
        <groupId>org.tron.trident</groupId>
        <artifactId>utils</artifactId>
        <version>0.1</version>
    </dependency>
    <dependency>
        <groupId>org.tron.trident</groupId>
        <artifactId>core</artifactId>
        <version>0.1</version>
    </dependency>
</dependencies>
```
