package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.common.exceptions.CompilerException;
import com.jalasoft.compiler.common.exceptions.ExecuteException;
import com.jalasoft.compiler.model.parameters.PythonParameter;

import java.io.File;

public class PythonCompiler implements ICompiler {

    @Override
    public String compiler(String folder, File file) throws CompilerException {
        try {
            ICommandBuilder<PythonParameter> command = new PythonCommand();
            String cmd = command.buildCommand(new PythonParameter(folder, file));
            Execute execute = new Execute();
            return execute.run(cmd);
        } catch (CommandException ex) {
            throw new CompilerException(ex.getMessage(), ex, "404");
        } catch (ExecuteException ex) {
            throw new CompilerException(ex.getMessage(), "400");
        }
    }
}
