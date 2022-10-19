package com.jalasoft.compiler.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Execute {
    public String run(String command){
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
