package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CompilerException;

import java.io.File;

public class CompileFacade {
    public static String compileCode(String lang, String folder, File file) throws CompilerException {
        CompilerFactory compilerFactory = new CompilerFactory();
        ICompiler comp = compilerFactory.getInstance(lang);

        return comp.compiler(folder, file);
    }
}
