package com.a7medelnoor.ezenesstaskshopapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.a7medelnoor.ezenesstaskshopapplication.adapter.BodyProductNotSlidingAdapter;
import com.a7medelnoor.ezenesstaskshopapplication.adapter.TopMainCategoriesAdapter;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.BodyProductNotSliding;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.TopMainCategories;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView topMainCategoryRecyclerView;
    TopMainCategoriesAdapter topMainCategoriesAdapter;
    RecyclerView productForYouRecyclerView;
    BodyProductNotSlidingAdapter bodyProductNotSlidingAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topMainCategoryRecyclerView = findViewById(R.id.top_categories_recycler);
        productForYouRecyclerView = findViewById(R.id.for_you);
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