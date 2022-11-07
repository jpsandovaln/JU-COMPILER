package com.jalasoft.compiler.model.parameters;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.common.exceptions.InvalidDataException;
import com.jalasoft.compiler.common.validations.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PythonParameter extends Parameter {

    private String pythonFolder;

    public PythonParameter(String pythonFolder, File pythonFile) {
        super(pythonFile);
        this.pythonFolder = pythonFolder;
    }

    public String getPythonFolder() {
        return pythonFolder;
    }

    public void setPythonFolder(String pythonFolder) {
        this.pythonFolder = pythonFolder;
    }

    public void validate() throws InvalidDataException {
        /*if (this.pythonFolder == null || this.pythonFolder.isEmpty()) {
            throw new InvalidDataException("Invalid python value");
        }
        File folder = new File(this.pythonFolder);
        if (!folder.exists()) {
            throw new InvalidDataException("the pythonfolder not exists");
        }
        if (!folder.isDirectory()) {
            throw new InvalidDataException("pythonFolder is not directory");
        }
        if (!this.file.isFile()) {
            throw new InvalidDataException("Invalid file");
        }
        if (this.file.isHidden()) {
            throw new InvalidDataException("File is hidden");
        }*/

        List<IValidationStrategy> validationStrategies = new ArrayList<>();
        validationStrategies.add(new NotNullOrEmptyValidation("pythonFolder", this.pythonFolder));
        validationStrategies.add(new FolderValidation(this.pythonFolder));
        validationStrategies.add(new FileValidation(this.file));

        ValidationContext context = new ValidationContext(validationStrategies);
        context.validate();

    }
}
