package com.jalasoft.compiler.model;

import java.io.File;

public class CompileFacade {
    public static String compileCode(String lang, String folder, File file){
        String cmd  = "";
        if (lang.equals("java")) {
            JavaCommand command = new JavaCommand();
            cmd = command.buildJavaCommand(folder, file);
        }
        if (lang.equals("python")) {
            PythonCommand command = new PythonCommand();
            cmd = command.buildPythonCommand(folder, file);
        }
        Execute execute = new Execute();
        String result = execute.run(cmd);
        return result;
    }
}
