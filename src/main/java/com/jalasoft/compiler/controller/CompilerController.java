package com.jalasoft.compiler.controller;

import com.jalasoft.compiler.model.CompileCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compile")
public class CompilerController {

    @PostMapping
    public String compile() {
        CompileCode compile = new CompileCode();
        return compile.run();
    }
}
