package com.a7medelnoor.ezenesstaskshopapplication.data.model;

public class TopMainCategories {
    Integer topMainCategoryImage;
    String topMainCategoryTitle;

    public TopMainCategories(Integer topMainCategoryImage, String topMainCategoryTitle) {
        this.topMainCategoryImage = topMainCategoryImage;
        this.topMainCategoryTitle = topMainCategoryTitle;
    }

    public Integer getTopMainCategoryImage() {
        return topMainCategoryImage;
    }

    public void setTopMainCategoryImage(Integer topMainCategoryImage) {
        this.topMainCategoryImage = topMainCategoryImage;
    }

    public String getTopMainCategoryTitle() {
        return topMainCategoryTitle;
    }

    public void setTopMainCategoryTitle(String topMainCategoryTitle) {
        this.topMainCategoryTitle = topMainCategoryTitle;
    }
}
