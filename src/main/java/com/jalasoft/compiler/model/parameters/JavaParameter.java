package com.jalasoft.compiler.model.parameters;

import java.io.File;

public class JavaParameter extends Parameter {
    private String javaFolder;
    public  JavaParameter(String javaFolder, File javaFile) {
        super(javaFile);
        this.javaFolder = javaFolder;
    }

    public String getJavaFolder() {
        return javaFolder;
    }
}
