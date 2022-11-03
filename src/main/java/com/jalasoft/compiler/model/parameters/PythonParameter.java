package com.jalasoft.compiler.model.parameters;

import com.jalasoft.compiler.common.exceptions.CommandException;

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

    public void validate() throws CommandException {
        if (!this.file.isFile()) {
            throw new CommandException("error");
        }
    }
}
