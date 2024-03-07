@echo off

title Java Batch
Rem echo Welcome to Java through Batch!

cd C:\Users\capta\OneDrive\Documents\Night With Industry Seating
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