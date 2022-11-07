package com.jalasoft.compiler.common.validations;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;

import java.io.File;

public class FolderValidation implements IValidationStrategy {
    private String value;

    public FolderValidation(String value) {
        this.value = value;
    }

    @Override
    public void validate() throws InvalidDataException {
        File folder = new File(this.value);
        if (!folder.exists()) {
            throw new InvalidDataException("the folder not exists");
        }
        if (!folder.isDirectory()) {
            throw new InvalidDataException("Folder is not directory");
        }
    }
}
