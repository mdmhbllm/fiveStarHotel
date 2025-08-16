package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import java.io.File;

public class UploadCatalog {
    private String category;
    private String uploadedFile;
    private String fileName;
    private long fileSize;
    private String fileFormat;

    public UploadCatalog(String category, String uploadedFile, String fileName, long fileSize, String fileFormat) {
        this.category = category;
        this.uploadedFile = uploadedFile;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(String uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "UploadCatalog{" +
                "category='" + category + '\'' +
                ", uploadedFile='" + uploadedFile + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
