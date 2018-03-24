package com.Elixir.Java.Model;

public class DeriveClassificationCodeRequest {

    private final String issuedDate;
    private final int productCd;
    private final int taxCd;
    private final boolean advisedInd;

    public DeriveClassificationCodeRequest(Builder builder) {
        this.issuedDate = builder.issuedDate;
        this.productCd = builder.productCd;
        this.taxCd = builder.taxCd;
        this.advisedInd = builder.advisedInd;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public int getpProductCd() {
        return productCd;
    }

    public int getTaxCd() {
        return taxCd;
    }

    public boolean isAdvisedInd() {
        return advisedInd;
    }

    public static DeriveClassificationCodeRequest newBuilder(Builder builder) {
        return new DeriveClassificationCodeRequest(builder);
    }
}

class Builder {
    String issuedDate;
    int productCd;
    int taxCd;
    boolean advisedInd;

    public Builder issuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    public Builder productCd(int pProductCd) {
        this.productCd = pProductCd;
        return this;
    }

    public Builder taxCd(int taxCd) {
        this.taxCd = taxCd;
        return this;
    }

    public Builder advisedInd(boolean advisedInd) {
        this.advisedInd = advisedInd;
        return this;
    }
}