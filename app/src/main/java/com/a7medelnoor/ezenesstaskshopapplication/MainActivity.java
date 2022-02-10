package com.a7medelnoor.ezenesstaskshopapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.a7medelnoor.ezenesstaskshopapplication.adapter.BodyProductNotSlidingAdapter;
import com.a7medelnoor.ezenesstaskshopapplication.adapter.SubCategoryAdapter;
import com.a7medelnoor.ezenesstaskshopapplication.adapter.TopMainCategoriesAdapter;
import com.a7medelnoor.ezenesstaskshopapplication.adapter.TopStoresAdapter;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.BodyProductNotSliding;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.SubCategory;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.TopMainCategories;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.TopStores;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView topMainCategoryRecyclerView;
    TopMainCategoriesAdapter topMainCategoriesAdapter;
    RecyclerView productForYouRecyclerView;
    BodyProductNotSlidingAdapter bodyProductNotSlidingAdapter;
    RecyclerView topStoreRecyclerView;
    TopStoresAdapter topStoresAdapter;
    RecyclerView subCategoryRecyclerView;
    SubCategoryAdapter subCategoryAdapter;
    RecyclerView subBodyProductRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topMainCategoryRecyclerView = findViewById(R.id.top_categories_recycler);
        productForYouRecyclerView = findViewById(R.id.for_you);
        topStoreRecyclerView = findViewById(R.id.top_stores_recycler_view);
        subCategoryRecyclerView = findViewById(R.id.shop_by_category_sub_recycler_view);
        subBodyProductRecyclerView = findViewById(R.id.shop_by_category_sub_recycler_view);
        List<TopMainCategories> topMainCategoriesList = new ArrayList<>();
        topMainCategoriesList.add(new TopMainCategories(R.drawable.ic_cateogry,"TOP Cateory"));
        topMainCategoriesList.add(new TopMainCategories(R.drawable.ic_cateogry,"TOP Cateory"));
        topMainCategoriesList.add(new TopMainCategories(R.drawable.ic_cateogry,"TOP Cateory"));
        setTopMainCategories(topMainCategoriesList);
        List<BodyProductNotSliding> bodyProductNotSlidingList = new ArrayList<>();
        bodyProductNotSlidingList.add(new BodyProductNotSliding("Test","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingList.add(new BodyProductNotSliding("Test","3 KM",R.drawable.ic_launcher_foreground,"30$","20%","23%"));
        bodyProductNotSlidingList.add(new BodyProductNotSliding("Test","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingList.add(new BodyProductNotSliding("Test","3 KM",R.drawable.ic_launcher_foreground,"30$","20%","23%"));
        bodyProductNotSlidingList.add(new BodyProductNotSliding("Test","3 KM",R.drawable.ic_launcher_foreground,"30$","20%","23%"));
        bodyProductNotSlidingList.add(new BodyProductNotSliding("Test","3 KM",R.drawable.ic_launcher_foreground,"30$","20%","23%"));
        setupProductForYou(bodyProductNotSlidingList);
        List<TopStores> topStoresList = new ArrayList<>();
        topStoresList.add(new TopStores(R.drawable.ic_launcher_background,"@_ahmed"));
        topStoresList.add(new TopStores(R.drawable.ic_launcher_background,"@a7medelnoor"));
        topStoresList.add(new TopStores(R.drawable.ic_launcher_background,"@ezeness"));
        topStoresList.add(new TopStores(R.drawable.ic_launcher_background,"@androidDeveloper"));
        setupTopStoreRecyclerView(topStoresList);
        List<SubCategory> subCategoryList = new ArrayList<>();
        subCategoryList.add(new SubCategory(R.drawable.ic_launcher_background,"Sub Category"));
        subCategoryList.add(new SubCategory(R.drawable.ic_launcher_background,"Sub Category2"));
        setupSubCategoryRecyclerView(subCategoryList);
        List<BodyProductNotSliding> bodyProductNotSlidingListSub = new ArrayList<>();
        bodyProductNotSlidingListSub.add(new BodyProductNotSliding("Test Sub","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingListSub.add(new BodyProductNotSliding("Test Sub","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingListSub.add(new BodyProductNotSliding("Test Sub","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingListSub.add(new BodyProductNotSliding("Test Sub","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingListSub.add(new BodyProductNotSliding("Test Sub","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        bodyProductNotSlidingListSub.add(new BodyProductNotSliding("Test Sub","3 KM",R.drawable.ic_launcher_background,"30$","20%","23%"));
        setupProductBodyRecyclerView(bodyProductNotSlidingListSub);
    }

    private void setupProductBodyRecyclerView(List<BodyProductNotSliding> bodyProductNotSlidingListSub) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        subBodyProductRecyclerView.setLayoutManager(layoutManager);
        bodyProductNotSlidingAdapter = new BodyProductNotSlidingAdapter(this,bodyProductNotSlidingListSub);
        subBodyProductRecyclerView.setAdapter(bodyProductNotSlidingAdapter);
    }

    private void setupSubCategoryRecyclerView(List<SubCategory> subCategoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        subCategoryRecyclerView.setLayoutManager(layoutManager);
        subCategoryAdapter = new SubCategoryAdapter(this,subCategoryList);
        subCategoryRecyclerView.setAdapter(subCategoryAdapter);
    }

    private void setupTopStoreRecyclerView(List<TopStores> topStoresList) {
        RecyclerView.LayoutManager layoutManager  = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        topStoreRecyclerView.setLayoutManager(layoutManager);
        topStoresAdapter = new TopStoresAdapter(this,topStoresList);
        topStoreRecyclerView.setAdapter(topStoresAdapter);
    }

    private void setupProductForYou(List<BodyProductNotSliding> bodyProductNotSlidingList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        productForYouRecyclerView.setLayoutManager(layoutManager);
        bodyProductNotSlidingAdapter = new BodyProductNotSlidingAdapter(this,bodyProductNotSlidingList);
        productForYouRecyclerView.setAdapter(bodyProductNotSlidingAdapter);
    }

    private void setTopMainCategories(List<TopMainCategories> topMainCategoriesList){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        topMainCategoryRecyclerView.setLayoutManager(layoutManager);
        topMainCategoriesAdapter = new TopMainCategoriesAdapter(this,topMainCategoriesList);
        topMainCategoryRecyclerView.setAdapter(topMainCategoriesAdapter);
    }
}