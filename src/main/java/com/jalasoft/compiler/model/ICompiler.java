package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.common.exceptions.ExecuteException;

import java.io.File;

public interface ICompiler {
    String compiler(String folder, File file) throws ExecuteException, CommandException;
}
