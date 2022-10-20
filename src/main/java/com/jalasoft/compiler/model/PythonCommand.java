package com.jalasoft.compiler.model;

import javax.print.DocFlavor;
import java.io.File;

class PythonCommand implements ICommandBuilder {
    private static final String PYTHON_COMPILER = "python ";

    public String buildCommand(String pythonFolder, File pythonFile) {
        StringBuilder command = new StringBuilder();
        command.append(pythonFolder)
                .append(PYTHON_COMPILER)
                .append(pythonFile.getAbsoluteFile());
        return command.toString();
    }
}
