# httpstatusresponses
A java library containing both official and unofficial http status codes
This java library contains all official http status codes as per <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status">MDN web docs</a>.<br>
It also contains some unofficial http status codes, used with certain services such as cloudfare and shopify.
# status codes
The Hypertext transfer protocol (HTTP) normally contains 5 different types of codes:<br>
<ul>
  <li>1xx (informational)</li>
  <li>2xx (successful)</li>
  <li>3xx (redirects)</li>
  <li>4xx (client error)</li>
  <li>5xx (server error)</li>
</ul><br>
# instaling
To add this library to your project, do one of the following:<br>
-Add it using maven:<br>
<code> </code><br>
-Add it using gradle:<br>
<code>
  sourceControl {
    gitRepository("https://github.com/Irishmun/httpstatusresponses.git") {
        producesModule("org.steef.httpstatus")
    }
}
</code><br>
-Add it manualy:
To add this library manually, download the jar from the <a href="https://github.com/Irishmun/httpstatusresponses/releases">releases</a> page and add it to the library folder of your project