package com.a7medelnoor.ezenesstaskshopapplication.data.model;

public class SubCategory {
    Integer subCategoryImage;
    String subCategoryTitle;

    public Integer getSubCategoryImage() {
        return subCategoryImage;
    }

    public void setSubCategoryImage(Integer subCategoryImage) {
        this.subCategoryImage = subCategoryImage;
    }

    public String getSubCategoryTitle() {
        return subCategoryTitle;
    }

    public void setSubCategoryTitle(String subCategoryTitle) {
        this.subCategoryTitle = subCategoryTitle;
    }

    public SubCategory(Integer subCategoryImage, String subCategoryTitle) {
        this.subCategoryImage = subCategoryImage;
        this.subCategoryTitle = subCategoryTitle;
    }
}
