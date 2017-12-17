@echo off
@title World 1 - Economy
java -server -Xms2048m -Xmx4096m -cp bin;data/libs/*; com.rs.Launcher true false true 1 false
pause
