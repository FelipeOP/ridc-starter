# Getting Started

## Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.14/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.14/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsingle/#io.validation)

## Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

## Including a local package as a Maven dependency

Create your local Maven repository

```shell
cd C:\lib
mkdr ridc-11.1.1
```

## Deploy in requird format

```shell
url         # the location of your repo
file        # the location of your jar file
groupId     # your group id (com.sookocheff)
artifactId  # your artifact id (devlib)
packaging   # jar | war
version     # version number
```

```shell
mvn deploy:deploy-file -Durl=file://C:\lib\ridc-11.1.1\ -Dfile=oracle.ucm.ridc-11.1.1.jar -DgroupId=oracle.ucm.ridc -DartifactId=oracle.ucm.ridc -Dpackaging=jar -Dversion=11.1.1
```

## Install in .m2 folder

```shell
file       # the location of your jar file
groupId    # your group id (oracle.ucm.ridc)
artifactId # your artifact id (oracle.ucm.ridc)
packaging  # jar | war
version    # version number
```

```shell
mvn install:install-file -Dfile=C:\lib\oracle.ucm.ridc-11.1.1\oracle\ucm\ridc\oracle.ucm.ridc\11.1.1\oracle.ucm.ridc-11.1.1.jar -DgroupId=oracle.ucm.ridc -DartifactId=oracle.ucm.ridc -Dversion=11.1.1 -Dpackaging=jar
```

View also:

* [Apache]([https://](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html))
* [Deply](https://sookocheff.com/post/java/local-maven-repository/)
* [Ridc 3rd-party-repo](http://nexus.goldgov.com/nexus/content/repositories/3rd-party-repo/oracle/ucm/ridc/oracle.ucm.ridc/11.1.1/)
