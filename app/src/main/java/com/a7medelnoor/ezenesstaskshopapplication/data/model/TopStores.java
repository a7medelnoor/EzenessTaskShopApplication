package com.a7medelnoor.ezenesstaskshopapplication.data.model;

public class TopStores {
Integer topStoreImage;
String topStoreUserTag;

    public TopStores(Integer topStoreImage, String topStoreUserTag) {
        this.topStoreImage = topStoreImage;
        this.topStoreUserTag = topStoreUserTag;
    }

    public Integer getTopStoreImage() {
        return topStoreImage;
    }

    public void setTopStoreImage(Integer topStoreImage) {
        this.topStoreImage = topStoreImage;
    }

    public String getTopStoreUserTag() {
        return topStoreUserTag;
    }

    public void setTopStoreUserTag(String topStoreUserTag) {
        this.topStoreUserTag = topStoreUserTag;
    }
}

