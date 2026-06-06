## Collatz conjecture in scala

### Usage

Just run with sbt and select the main method to run. I.e.:

```sh
❯ sbt run
[info] welcome to sbt 1.12.11 (Eclipse Adoptium Java 23.0.2)
[info] loading global plugins from /Users/marco/.sbt/1.0/plugins
[info] loading settings for project collatz-conjecture-scala-build from plugins.sbt...
[info] loading project definition from /Users/marco/code/nmcb/Collatz-conjecture-scala/project
[info] loading settings for project root from build.sbt...
[info] set current project to collatz (in build file:/Users/marco/code/nmcb/Collatz-conjecture-scala/)
[info] compiling 3 Scala sources to /Users/marco/code/nmcb/Collatz-conjecture-scala/target/scala-3.8.3/classes ...

Multiple main classes detected. Select one to run:
 [1] collatz
 [2] memoization.run
 [3] recursion.run

Enter number: 2
[info] running memoization.run 
Choose range end number: 666
[success] Total time: 13 s, completed 6 Jun 2026, 10:49:39
```
