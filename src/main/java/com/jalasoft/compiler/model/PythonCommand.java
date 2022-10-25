package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.model.parameters.PythonParameter;

class PythonCommand implements ICommandBuilder<PythonParameter> {
    private static final String PYTHON_COMPILER = "python ";

    public String buildCommand(PythonParameter parameter) throws CommandException {
        try {
            StringBuilder command = new StringBuilder();
            command.append(parameter.getPythonFolder())
                    .append(PYTHON_COMPILER)
                    .append(parameter.getFile().getAbsoluteFile());
            if (command.toString().equals("")) {
                throw new CommandException("Invalid parameter");
            }
            return command.toString();
        } catch (Exception ex) {
            throw new CommandException(ex);
        }
    }
}
