# Challenges

Some challenges.

## Solutions

- To solve the fortuner teller's challenge I followed this [tutorial](https://medium.com/@kellylougheed/fortune-teller-with-java-classes-75069ac39591).
- To solve the journal's challenge, I follow this [lesson](https://www.ict.social/java/oop/diary-with-a-database-in-java-curse). In which, we learn to use `ArrayList` to save data in memory. It's not like in other challenges where we use files to store data, but it's 
  useful in multiply problems.
- To solve the Post It Notes' challenge I have to thank to [WikiTechie](https://github.com/wikitechie/StickyNotes).
- To solve the Vigenère Cipher's Challenge I followed this [tutorial](https://www.geeksforgeeks.org/vigenere-cipher/).

---
### How the HTTP Web Server works in Java?

Each client connection is managed in a dedicated thread. So, our `HTTPWebServer` class implements the Runnable interface. 
In the constants, we define the Web Root, the default file, the file used when a file will be not found,  the file called for an unsupported `HTTP` method and also the port to listen connections.

The client connections will be managed via the `Socket` object available in standard in the JDK. In the main method, 
we start by creating a `ServerSocket` object also available in standard in the JDK.

We listen on the port `8080` until user halts server execution. We call the accept method of the 
`ServerSocket` instance to wait for a connection. When a connection is created,  we pass the Socket object in parameter of our `HTTPWebServer` class and then we start a dedicated Thread object.

For each Thread instance created, we read characters from the client via the `getInputStream` method of the  `Socket` instance got. Then, we get one character output stream to client for headers.  And we get a binary output stream to client for requested data.
We support only `GET` and `HEAD HTTP` methods. Otherwise, we return the file pointed by the unsupported variable.  If it’s a `GET` or `HEAD HTTP` method, we try to find the requested data. 
If it exists, we return the requested data to the user.  When we return the requested data, we send also the `HTTP` Headers.  Don’t forget to return blank line between headers and content. It’s very important !

**Source:** https://medium.com/@ssaurel/create-a-simple-http-web-server-in-java-3fc12b29d5fd

### RSS Feed Creator

###### I wrote this text in 2019, in that time I don't have any idea how great is Spring Boot.

To solve this challenge first I used a [Spring Initializr project](https://start.spring.io/), in other words Spring Boot, Spring REST and Rome, based on [this tutorial,](https://www.novatec-gmbh.de/en/blog/create-rss-feed-spring-rome-5-minutes/) but something goes wrong. 

Then, I [used this tutorial](https://www.vogella.com/tutorials/RSSFeed/article.html) and despite not having much detail and find what I was doing wrong:)

**P.S.: I was using a blocked RSS.** *[1]*

However, in case you want to program using **Spring Initializr**, I need to have two lines in mind:

1. To build my code you use `gradlew clean build`
2. If success, you go to `build/libs` and use `java -jar [filename].jar`.

**Spring Initializr** has its advantages, because you can use an editor instead of an **IDE**. And it is an framework, so it saves much time:)

*[1]:* I was using the new york time rss, then I tried Yahoo rss, but none worked :(

