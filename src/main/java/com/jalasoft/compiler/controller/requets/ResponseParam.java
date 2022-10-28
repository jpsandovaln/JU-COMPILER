package com.jalasoft.compiler.controller.requets;


import org.springframework.web.multipart.MultipartFile;

public class ResponseParam {
   private String lang;
   private String version;
   private MultipartFile file;

    public ResponseParam(String lang, String version, MultipartFile file) {
        this.lang = lang;
        this.version = version;
        this.file = file;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
