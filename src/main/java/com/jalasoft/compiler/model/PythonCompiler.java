package com.jalasoft.compiler.model;

import java.io.File;

public class PythonCompiler implements ICompiler {

    @Override
    public String compiler(String folder, File file) {
        ICommandBuilder command = new PythonCommand();
        String cmd = command.buildCommand(folder, file);
        Execute execute = new Execute();
        return execute.run(cmd);
    }
}
