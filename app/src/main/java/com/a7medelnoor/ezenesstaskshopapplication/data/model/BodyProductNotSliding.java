package com.a7medelnoor.ezenesstaskshopapplication.data.model;

public class BodyProductNotSliding {
    String bodyProductTitle;
    String bodyProductDistance;
    Integer bodyProductImage;
    String bodyProductPrice;
    String bodyProductPriceDiscount;
    String bodyProductDiscount;

    public BodyProductNotSliding(String bodyProductTitle, String bodyProductDistance, Integer bodyProductImage, String bodyProductPrice, String bodyProductPriceDiscount, String bodyProductDiscount) {
        this.bodyProductTitle = bodyProductTitle;
        this.bodyProductDistance = bodyProductDistance;
        this.bodyProductImage = bodyProductImage;
        this.bodyProductPrice = bodyProductPrice;
        this.bodyProductPriceDiscount = bodyProductPriceDiscount;
        this.bodyProductDiscount = bodyProductDiscount;
    }

    public String getBodyProductTitle() {
        return bodyProductTitle;
    }

    public void setBodyProductTitle(String bodyProductTitle) {
        this.bodyProductTitle = bodyProductTitle;
    }

    public String getBodyProductDistance() {
        return bodyProductDistance;
    }

    public void setBodyProductDistance(String bodyProductDistance) {
        this.bodyProductDistance = bodyProductDistance;
    }

    public Integer getBodyProductImage() {
        return bodyProductImage;
    }

    public void setBodyProductImage(Integer bodyProductImage) {
        this.bodyProductImage = bodyProductImage;
    }

    public String getBodyProductPrice() {
        return bodyProductPrice;
    }

    public void setBodyProductPrice(String bodyProductPrice) {
        this.bodyProductPrice = bodyProductPrice;
    }

    public String getBodyProductPriceDiscount() {
        return bodyProductPriceDiscount;
    }

    public void setBodyProductPriceDiscount(String bodyProductPriceDiscount) {
        this.bodyProductPriceDiscount = bodyProductPriceDiscount;
    }

    public String getBodyProductDiscount() {
        return bodyProductDiscount;
    }

    public void setBodyProductDiscount(String bodyProductDiscount) {
        this.bodyProductDiscount = bodyProductDiscount;
    }
}
