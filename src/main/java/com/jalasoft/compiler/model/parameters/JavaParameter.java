package com.jalasoft.compiler.model.parameters;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;
import com.jalasoft.compiler.common.validations.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JavaParameter extends Parameter {
    private String javaFolder;
    public  JavaParameter(String javaFolder, File javaFile) {
        super(javaFile);
        this.javaFolder = javaFolder;
    }

    public String getJavaFolder() {
        return javaFolder;
    }

    public void validate() throws InvalidDataException {
        List<IValidationStrategy> validationStrategies = new ArrayList<>();
        validationStrategies.add(new NotNullOrEmptyValidation("javaFolder", this.javaFolder));
        validationStrategies.add(new FolderValidation(this.javaFolder));
        validationStrategies.add(new FileValidation(this.file));

        ValidationContext context = new ValidationContext(validationStrategies);
        context.validate();
    }
}
