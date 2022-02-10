package com.a7medelnoor.ezenesstaskshopapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.a7medelnoor.ezenesstaskshopapplication.R;
import com.a7medelnoor.ezenesstaskshopapplication.data.model.TopMainCategories;

import java.util.List;

public class TopMainCategoriesAdapter extends RecyclerView.Adapter<TopMainCategoriesAdapter.TopMainCategoriesViewHolder> {
    private final Context context;
    private List<TopMainCategories> topMainCategoriesList;

    public TopMainCategoriesAdapter(Context context, List<TopMainCategories> topMainCategoriesList) {
        this.context = context;
        this.topMainCategoriesList = topMainCategoriesList;
    }

    @NonNull
    @Override
    public TopMainCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopMainCategoriesViewHolder(LayoutInflater.from(context).inflate(R.layout.main_category_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopMainCategoriesViewHolder holder, int position) {
        holder.productTitle.setText(topMainCategoriesList.get(position).getTopMainCategoryTitle());
        holder.productImage.setImageResource(topMainCategoriesList.get(position).getTopMainCategoryImage());
    }

    @Override
    public int getItemCount() {
        return topMainCategoriesList.size();
    }

    public class TopMainCategoriesViewHolder extends RecyclerView.ViewHolder {
        TextView productTitle;
        ImageView productImage;

        public TopMainCategoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            productTitle = itemView.findViewById(R.id.main_category_recycler_view_text_view_title);
            productImage = itemView.findViewById(R.id.main_category_recycler_view_image_view);
        }
    }
}
