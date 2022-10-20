package com.jalasoft.compiler.model;
import java.io.File;

public interface ICommandBuilder {
    public String buildCommand(String folder, File file);
}
