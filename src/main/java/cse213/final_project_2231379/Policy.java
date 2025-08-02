package cse213.final_project_2231379;

import java.time.LocalDate;

public class Policy {
    private String policyId;
    private String title;
    private String message;
    private String referenceLink;
    private LocalDate dateSent;

    public Policy(String policyId, String title, String message, String referenceLink, LocalDate dateSent) {
        this.policyId = policyId;
        this.title = title;
        this.message = message;
        this.referenceLink = referenceLink;
        this.dateSent = dateSent;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }

    public LocalDate getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDate dateSent) {
        this.dateSent = dateSent;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", referenceLink='" + referenceLink + '\'' +
                ", dateSent=" + dateSent +
                '}';
    }
}
