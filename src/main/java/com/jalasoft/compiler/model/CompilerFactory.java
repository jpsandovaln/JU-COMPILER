package com.jalasoft.compiler.model;

import java.util.HashMap;
import java.util.Map;

public class CompilerFactory {
    private Map<String, ICompiler> compilerMap;

    public CompilerFactory() {
        this.compilerMap = new HashMap<>();
        this.compilerMap.put("java", new JavaCompiler());
        this.compilerMap.put("python", new PythonCompiler());
        this.compilerMap.put("nodejs", new NodeJsCompiler());

    }
    public ICompiler getInstance(String lang) {
       return this.compilerMap.get(lang);
    }
}
