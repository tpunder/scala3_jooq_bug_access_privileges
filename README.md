

```
[info] welcome to sbt 1.9.6 (Eclipse Adoptium Java 17.0.3)
[info] loading global plugins from /Users/tim/.sbt/1.0/plugins
[info] loading project definition from /Users/tim/code/personal/scala3_jooq_bug_access_privileges/project
[info] loading settings for project scala3_jooq_bug_access_privileges from build.sbt ...
[info] set current project to scala3_jooq_bug_access_privileges (in build file:/Users/tim/code/personal/scala3_jooq_bug_access_privileges/)
[info] sbt server started at local:///Users/tim/.sbt/1.0/server/25875834e91da510c8e6/sock
[info] started sbt server
sbt:scala3_jooq_bug_access_privileges> + compile
[info] Setting Scala version to 2.12.18 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3_jooq_bug_access_privileges (in build file:/Users/tim/code/personal/scala3_jooq_bug_access_privileges/)
[info] compiling 1 Scala source to /Users/tim/code/personal/scala3_jooq_bug_access_privileges/target/scala-2.12/classes ...
[success] Total time: 1 s, completed Oct 5, 2023, 2:11:55 PM
[info] Setting Scala version to 2.13.10 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3_jooq_bug_access_privileges (in build file:/Users/tim/code/personal/scala3_jooq_bug_access_privileges/)
[info] compiling 1 Scala source to /Users/tim/code/personal/scala3_jooq_bug_access_privileges/target/scala-2.13/classes ...
[success] Total time: 1 s, completed Oct 5, 2023, 2:11:56 PM
[info] Setting Scala version to 3.3.1 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3_jooq_bug_access_privileges (in build file:/Users/tim/code/personal/scala3_jooq_bug_access_privileges/)
[info] compiling 1 Scala source and 6 Java sources to /Users/tim/code/personal/scala3_jooq_bug_access_privileges/target/scala-3.3.1/classes ...
[error] -- [E164] Declaration Error: /Users/tim/code/personal/scala3_jooq_bug_access_privileges/src/main/scala/com/example/MyRoutineScala.scala:6:6
[error] 6 |class MyRoutineScala extends AbstractRoutine[String] {
[error]   |      ^
[error]   |error overriding method configuration in trait Attachable of type (): org.jooq.Configuration;
[error]   |  method configuration in class AbstractQueryPart of type (): org.jooq.Configuration has weaker access privileges; it should be public
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 2 s, completed Oct 5, 2023, 2:11:58 PM
```