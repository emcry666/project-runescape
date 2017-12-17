@echo off
@title World 2 - Developer World
java -server -Xms2048m -Xmx2048m -cp bin;data/libs/*; com.rs.Launcher true true true 2 false
pause
