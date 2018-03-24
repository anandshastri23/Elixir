package com.Elixir.Java.Model;

public class DeriveClassificationCodeResponse {
    String issuedDate;
    int productCd;
    int taxCd;
    boolean advisedInd;
    int classificationCd;

    public int getClassificationCd() {
        return classificationCd;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public int getProductCd() {
        return productCd;
    }

    public int getTaxCd() {
        return taxCd;
    }

    public boolean isAdvisedInd() {
        return advisedInd;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setProductCd(int productCd) {
        this.productCd = productCd;
    }

    public void setTaxCd(int taxCd) {
        this.taxCd = taxCd;
    }

    public void setAdvisedInd(boolean advisedInd) {
        this.advisedInd = advisedInd;
    }

    public void setClassificationCd(int classificationCd) {
        this.classificationCd = classificationCd;
    }
}
