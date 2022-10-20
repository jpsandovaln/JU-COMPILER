package com.jalasoft.compiler.model;

import java.io.File;

public class CompileFacade {
    public static String compileCode(String lang, String folder, File file){
        try {
            ICompiler comp = null;
            if (lang.equals("java")) {
                comp = new JavaCompiler();
            }
            if (lang.equals("python")) {
                comp = new PythonCompiler();
            }
            if ("nodejs".equals(lang)) {
                comp = new NodeJsCompiler();
            }
            return comp.compiler(folder, file);
        }catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
