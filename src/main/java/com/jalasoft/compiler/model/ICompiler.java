package com.jalasoft.compiler.model;

import java.io.File;

public interface ICompiler {
    String compiler(String folder, File file) throws Exception;
}
