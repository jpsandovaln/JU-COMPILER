package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.common.exceptions.CompilerException;
import com.jalasoft.compiler.common.exceptions.ExecuteException;
import com.jalasoft.compiler.model.parameters.JavaParameter;

import java.io.File;

public class JavaCompiler implements ICompiler {
    @Override
    public String compiler(String folder, File file) throws CompilerException {
        try {
            ICommandBuilder<JavaParameter> command = new JavaCommand();
            String cmd = command.buildCommand(new JavaParameter(folder, file));
            Execute execute = new Execute();
            return execute.run(cmd);
        } catch (CommandException ex) {
            throw new CompilerException(ex.getMessage(), "400");
        } catch (ExecuteException ex) {
            throw new CompilerException(ex.getMessage(), "404");
        }
    }
}
