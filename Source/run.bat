@echo off
title Run VDTT Server
echo Starting VDTT Server...
cd /d "C:\Users\gravi\Downloads\VDTT2M"

"C:\Program Files\Java\jdk-21\bin\java.exe" ^
 -Xmx10604m ^
 -XX:+HeapDumpOnOutOfMemoryError ^
 -XX:ParallelGCThreads=28 ^
 -Dfile.encoding=UTF-8 ^
 -Dsun.stdout.encoding=UTF-8 ^
 -Dsun.stderr.encoding=UTF-8 ^
 -classpath "C:\Users\ADMIN\Desktop\VDTT\target\classes;C:\Users\ADMIN\.m2\repository\com\zaxxer\HikariCP\5.0.1\HikariCP-5.0.1.jar;C:\Users\ADMIN\.m2\repository\org\slf4j\slf4j-api\2.0.0-alpha1\slf4j-api-2.0.0-alpha1.jar;C:\Users\ADMIN\.m2\repository\mysql\mysql-connector-java\8.0.30\mysql-connector-java-8.0.30.jar;C:\Users\ADMIN\.m2\repository\com\google\protobuf\protobuf-java\3.19.4\protobuf-java-3.19.4.jar;C:\Users\ADMIN\.m2\repository\com\googlecode\json-simple\json-simple\1.1.1\json-simple-1.1.1.jar;C:\Users\ADMIN\.m2\repository\junit\junit\4.10\junit-4.10.jar;C:\Users\ADMIN\.m2\repository\org\hamcrest\hamcrest-core\1.1\hamcrest-core-1.1.jar;C:\Users\ADMIN\.m2\repository\com\google\code\gson\gson\2.10.1\gson-2.10.1.jar;C:\Users\ADMIN\.m2\repository\org\json\json\20220924\json-20220924.jar;C:\Users\ADMIN\.m2\repository\log4j\log4j\1.2.17\log4j-1.2.17.jar;C:\Users\ADMIN\.m2\repository\org\apache\commons\commons-lang3\3.12.0\commons-lang3-3.12.0.jar;C:\Users\ADMIN\.m2\repository\io\github\classgraph\classgraph\4.8.161\classgraph-4.8.161.jar;C:\Users\ADMIN\.m2\repository\org\openjfx\javafx-controls\19.0.2.1\javafx-controls-19.0.2.1.jar;C:\Users\ADMIN\.m2\repository\org\openjfx\javafx-controls\19.0.2.1\javafx-controls-19.0.2.1-win.jar;C:\Users\ADMIN\.m2\repository\org\openjfx\javafx-graphics\19.0.2.1\javafx-graphics-19.0.2.1.jar;C:\Users\ADMIN\.m2\repository\org\openjfx\javafx-graphics\19.0.2.1\javafx-graphics-19.0.2.1-win.jar;C:\Users\ADMIN\.m2\repository\org\openjfx\javafx-base\19.0.2.1\javafx-base-19.0.2.1.jar;C:\Users\ADMIN\.m2\repository\org\openjfx\javafx-base\19.0.2.1\javafx-base-19.0.2.1-win.jar;C:\Users\ADMIN\.m2\repository\org\quartz-scheduler\quartz\2.3.2\quartz-2.3.2.jar;C:\Users\ADMIN\.m2\repository\com\mchange\c3p0\0.9.5.4\c3p0-0.9.5.4.jar;C:\Users\ADMIN\.m2\repository\com\mchange\mchange-commons-java\0.2.15\mchange-commons-java-0.2.15.jar;C:\Users\ADMIN\.m2\repository\com\zaxxer\HikariCP-java7\2.4.13\HikariCP-java7-2.4.13.jar;C:\Users\ADMIN\.m2\repository\org\jetbrains\annotations\23.0.0\annotations-23.0.0.jar;C:\Users\ADMIN\.m2\repository\redis\clients\jedis\4.0.1\jedis-4.0.1.jar;C:\Users\ADMIN\.m2\repository\org\apache\commons\commons-pool2\2.11.1\commons-pool2-2.11.1.jar" ^
 com.vdtt.server.VDTT

echo.
echo Server has stopped.
pause