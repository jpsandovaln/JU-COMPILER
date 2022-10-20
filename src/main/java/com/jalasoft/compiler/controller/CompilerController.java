package com.jalasoft.compiler.controller;

import com.jalasoft.compiler.model.CompileFacade;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/compile")
public class CompilerController {

    @PostMapping
    public String compile(@RequestParam(value = "lang") String lang,
                          @RequestParam(value =  "version") String version,
                          @RequestParam(value = "file")MultipartFile file) {
        try {
            Files.createDirectories(Paths.get("javaProject/"));
            Path path = Paths.get("javaProject/" + file.getOriginalFilename());
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            File javaFile = new File(path.toString());

            String javaFolder = "D:\\JUProgra102\\java\\jdk1.8.0_251\\bin\\";
            String pythonFolder = "D:\\JUProgra102\\python\\python3\\bin\\";

            String folder = "";
            if ("java".equals(lang)) {
                folder = "D:\\JUProgra102\\java\\jdk1.8.0_251\\bin\\";
            }
            if ("python".equals(lang)) {
                folder = "C:\\python39\\";
            }
            String result = CompileFacade.compileCode(lang, folder, javaFile);
            return result;
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
