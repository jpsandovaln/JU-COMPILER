package com.jalasoft.compiler.model.parameters;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;

import java.io.File;

public abstract class Parameter {
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

    public abstract void validate() throws InvalidDataException;
}
