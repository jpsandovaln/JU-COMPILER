package com.jalasoft.compiler.model;
import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.model.parameters.Parameter;

import java.io.File;

public interface ICommandBuilder<T extends Parameter> {
    public String buildCommand(T parameter) throws CommandException;
}
