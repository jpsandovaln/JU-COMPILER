package com.jalasoft.compiler.common.validations;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;

import java.io.File;

public class FileValidation implements IValidationStrategy {
    private File file;

    public FileValidation(File file) {
        this.file = file;
    }

    @Override
    public void validate() throws InvalidDataException {
        if (!this.file.isFile()) {
            throw new InvalidDataException("Invalid file");
        }
        if (this.file.isHidden()) {
            throw new InvalidDataException("File is hidden");
        }
    }
}
