package com.jalasoft.compiler.controller;

import com.jalasoft.compiler.common.exceptions.CompilerException;
import com.jalasoft.compiler.controller.requets.ResponseParam;
import com.jalasoft.compiler.controller.responses.ErrorResponse;
import com.jalasoft.compiler.controller.responses.OKResponse;
import com.jalasoft.compiler.model.CompileFacade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity compile(ResponseParam parameter) {
        try {
            if (parameter.getLang().equals("java1")) {
                throw new CompilerException("fail", "500");
            }
            Files.createDirectories(Paths.get("javaProject/"));
            Path path = Paths.get("javaProject/" + parameter.getFile().getOriginalFilename());
            Files.copy(parameter.getFile().getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            File javaFile = new File(path.toString());

            String javaFolder = "D:\\JUProgra102\\java\\jdk1.8.0_251\\bin\\";
            String pythonFolder = "D:\\JUProgra102\\python\\python3\\bin\\";

            String folder = "";
            if ("java".equals(parameter.getLang())) {
                folder = "D:\\JUProgra102\\java\\jdk1.8.0_251\\bin\\";
            }
            if ("python".equals(parameter.getLang())) {
                folder = "C:\\python39\\";
            }
            String result = CompileFacade.compileCode(parameter.getLang(), folder, javaFile);
            return ResponseEntity.ok().body(
                    new OKResponse("200", result)
            );
        } catch (IOException ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse("400", ex.getMessage())
            );
        } catch (CompilerException ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse(ex.getErrorCode(), ex.getMessage())
            );
        }
    }
}
