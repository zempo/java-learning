# My Overview of JAVA

<img src="https://www.neobytesolutions.com/wp-content/gallery/geek-jokes/java-problem-joke.jpg" alt="Java Joke: I had a problem in Java. Now I have a problem factory.">

## JAVA Links

---

- [Beginner's Checklist](https://dev.to/smartyansh/code-review-checklist-for-java-beginners-181f)
- [Documentation (Java 15 Standard edition)](https://docs.oracle.com/en/java/javase/15/)
- [How to use Randoms in Java](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
- [Streams (foreach, map, etc)](https://stackify.com/streams-guide-java-8/)
- [Typecasting in Java](https://www.edureka.co/blog/type-casting-in-java/)

## Compiling Your Code

```console

you@You:~/java/project/src$ javac dir/*.java
you@You:~/java/project/src$ jar cvfe dir.jar dir.Main dir/*.class
you@You:~/java/project/src$ java -jar dir.jar

```

**Or, You can add a bash function**

```bash

function grind_java() {
javac $1/*java
}

function pour_java() {
jar cvfe $1.jar $1.Main $1/*.class
}

function sip_java() {
java -jar $1.jar
}

```

```console

you@You:~/java/project/src$ grind_java mydir
you@You:~/java/project/src$ pour_java mydir
you@You:~/java/project/src$ sip_java mydir

```
