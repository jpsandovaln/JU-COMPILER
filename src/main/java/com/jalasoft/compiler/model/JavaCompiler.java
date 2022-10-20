package com.jalasoft.compiler.model;

import java.io.File;

public class JavaCompiler implements ICompiler {
    @Override
    public String compiler(String folder, File file) {
        ICommandBuilder command = new JavaCommand();
        String cmd = command.buildCommand(folder, file);
        Execute execute = new Execute();
        return execute.run(cmd);
    }
}
