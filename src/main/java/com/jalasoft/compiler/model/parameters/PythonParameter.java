package com.jalasoft.compiler.model.parameters;

import java.io.File;

public class PythonParameter extends Parameter {

    private String pythonFolder;

    public PythonParameter(String pythonFolder, File pythonFile) {
        super(pythonFile);
        this.pythonFolder = pythonFolder;
    }

    public String getPythonFolder() {
        return pythonFolder;
    }

    public void setPythonFolder(String pythonFolder) {
        this.pythonFolder = pythonFolder;
    }
}
