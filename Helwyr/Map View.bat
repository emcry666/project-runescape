@echo off
@title RUN MATRIX(LOGIN)
java -XX:-OmitStackTraceInFastThrow -Xms2048m -Xmx2048m -cp bin;data/libs/*; com.rs.tools.MapGenerator false true
pause