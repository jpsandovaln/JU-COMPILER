package com.jalasoft.compiler.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileCode {
    public String run() {
        System.out.println("hello...");
        String command = "D:\\JUProgra102\\java\\jdk1.8.0_251\\bin\\javac D:\\JUProgra102\\HelloWorld.java && D:\\JUProgra102\\java\\jdk1.8.0_251\\bin\\java -cp D:\\JUProgra102\\ HelloWorld";

        ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "\"" + command + "\"");
        builder.redirectErrorStream(true);

        try {
            Process process = builder.start();
            process.waitFor();

            InputStreamReader streamReader = new InputStreamReader(process.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            StringBuilder result = new StringBuilder();
            while(reader.ready()) {
                result.append((char) reader.read());
            }
            return result.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        } catch (InterruptedException ex) {
            return ex.getMessage();
        }
    }
}
