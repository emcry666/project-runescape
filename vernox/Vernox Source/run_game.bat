@echo off
@title RUN MATRIX(GAME)
java -XX:-OmitStackTraceInFastThrow -server -Xms2048m -Xmx4096m -cp bin;data/libs/*; com.rs.GameLauncher 1 false false false false
pause