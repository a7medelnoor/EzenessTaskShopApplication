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
import com.a7medelnoor.ezenesstaskshopapplication.data.model.SubCategory;

import org.w3c.dom.Text;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder> {
    private Context context;
    private List<SubCategory> subCategoryList;

    public SubCategoryAdapter(Context context, List<SubCategory> subCategoryList) {
        this.context = context;
        this.subCategoryList = subCategoryList;
    }

    @NonNull
    @Override
    public SubCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SubCategoryViewHolder( LayoutInflater.from(context).inflate(R.layout.sub_category_recycler_view_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryViewHolder holder, int position) {
holder.subCategoryImageView.setImageResource(subCategoryList.get(position).getSubCategoryImage());
holder.subCategoryTextView.setText(subCategoryList.get(position).getSubCategoryTitle());
    }

    @Override
    public int getItemCount() {
        return subCategoryList.size();
    }

    public class SubCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView subCategoryImageView;
        TextView subCategoryTextView;
        public SubCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            subCategoryImageView = itemView.findViewById(R.id.sub_category_image_view);
            subCategoryTextView = itemView.findViewById(R.id.sub_category_text_view_title);
        }
    }
}
