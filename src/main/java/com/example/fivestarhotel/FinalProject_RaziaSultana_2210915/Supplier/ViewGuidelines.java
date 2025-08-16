package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

public class ViewGuidelines {
    private String documentTitle;
    private String documentType;
    private String documentPath;

    public ViewGuidelines(String documentTitle, String documentType, String documentPath) {
        this.documentTitle = documentTitle;
        this.documentType = documentType;
        this.documentPath = documentPath;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    @Override
    public String toString() {
        return "ViewGuidelines{" +
                "documentTitle='" + documentTitle + '\'' +
                ", documentType='" + documentType + '\'' +
                ", documentPath='" + documentPath + '\'' +
                '}';
    }
}
