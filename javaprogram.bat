@echo off

title Java Batch
Rem echo Welcome to Java through Batch!

cd /d %~dp0
Rem cd
javac SeatingArrangement.java
javac Student.java
javac Professional.java

Rem echo Java SeatingArrangement
Rem echo.
java SeatingArrangement

:loop
timeout /t 30 >nul
goto loop
