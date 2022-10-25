package com.jalasoft.compiler.model.parameters;

import java.io.File;

public class Parameter {
    protected File file;

    public Parameter(File file) {
        this.file = file;
    }

    public  File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
