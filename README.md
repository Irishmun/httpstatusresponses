# httpstatusresponses
A java library containing both official and unofficial http status codes.
This java library contains all official http status codes as per <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status">MDN web docs</a>.
It also contains some unofficial http status codes, used with certain services such as cloudfare and shopify.

# status codes
The Hypertext transfer protocol (HTTP) normally contains 5 different types of codes:
<ul>
  <li>1xx (informational)</li>
  <li>2xx (successful)</li>
  <li>3xx (redirects)</li>
  <li>4xx (client error)</li>
  <li>5xx (server error)</li>
</ul>

# instaling

To install this library, download the latest <a href="https://github.com/Irishmun/httpstatusresponses/releases">release</a> and add it to your library folder.
Then either add the dependency manually or:

-add the dependency using gradle:

`build.gradle`

```groovy
 dependencies {
       implementation fileTree(dir: '[library folder]',include: 'httpresponses.jar')
    }
```

-add the dependency using maven:

`pom.xml`
  
  ```xml
 <dependency>
            <groupId>org.steef</groupId>
            <artifactId>httpstatus</artifactId>
            <scope>system</scope>
            <version>[Downloaded version release]</version>
            <systemPath>${basedir}[library directory]\httpresponses.jar</systemPath>
        </dependency>
    </dependencies>
```


<!---

To add this library to your project, do one of the following:

<b>-Add</b> maven:

`pom.xml`

  add <a href="https://jitpack.io/">jitpack</a>
  then add
  
  ```xml
 <dependency>
    <groupId>com.github.Irishmun</groupId>
    <artifactId>httpstatusresponses</artifactId>
    <version>1.0</version>
</dependency>
```

<b>-Add</b> gradle:

`settings.gradle`

```groovy
 sourceControl {
    gitRepository("https://github.com/Irishmun/httpstatusresponses.git") {
        producesModule("org.steef.httpstatus:1.0")
    }
}
```

`build.gradle`

```groovy
 dependencies {
    implementation 'org.steef.httpstatus:X'
    }
```
where X is the version you wish to download. (refer to <a href="https://github.com/Irishmun/httpstatusresponses/releases">releases</a> for version numbers)

<b>-Add</b> it manualy:

To add this library manually, download the jar from the <a href="https://github.com/Irishmun/httpstatusresponses/releases">releases</a> page and add it to the library folder of your project

-->
