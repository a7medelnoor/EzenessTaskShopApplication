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
import com.a7medelnoor.ezenesstaskshopapplication.data.model.BodyProductNotSliding;

import java.util.List;

public class BodyProductNotSlidingAdapter extends RecyclerView.Adapter<BodyProductNotSlidingAdapter.BodyProductViewHolder> {
    private final Context context;
    private final List<BodyProductNotSliding> bodyProductNotSlidingList;

    public BodyProductNotSlidingAdapter(Context context, List<BodyProductNotSliding> bodyProductNotSlidingList) {
        this.context = context;
        this.bodyProductNotSlidingList = bodyProductNotSlidingList;
    }

    @NonNull
    @Override
    public BodyProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BodyProductViewHolder(LayoutInflater.from(context).inflate(R.layout.product_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BodyProductViewHolder holder, int position) {
        holder.productImageView.setImageResource(bodyProductNotSlidingList.get(position).getBodyProductImage());
        holder.productDistance.setText(bodyProductNotSlidingList.get(position).getBodyProductDistance());
        holder.productDiscountDashed.setText(bodyProductNotSlidingList.get(position).getBodyProductDiscount());
        holder.productDiscount.setText(bodyProductNotSlidingList.get(position).getBodyProductPriceDiscount());
        holder.productDiscountBold.setText(bodyProductNotSlidingList.get(position).getBodyProductPrice());
        holder.productTitleName.setText(bodyProductNotSlidingList.get(position).getBodyProductTitle());

    }

    @Override
    public int getItemCount() {
        return bodyProductNotSlidingList.size();
    }

    public class BodyProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productImageView;
        TextView productDistance;
        TextView productDiscountDashed;
        TextView productDiscount;
        TextView productDiscountBold;
        TextView productTitleName;

        public BodyProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImageView = itemView.findViewById(R.id.product_image_View);
            productDistance = itemView.findViewById(R.id.product_distance);
            productDiscountDashed = itemView.findViewById(R.id.product_distance_dashed);
            productDiscount = itemView.findViewById(R.id.product_discount);
            productDiscountBold = itemView.findViewById(R.id.product_discount_bold);
            productTitleName = itemView.findViewById(R.id.product_title_name);
        }
    }
}
