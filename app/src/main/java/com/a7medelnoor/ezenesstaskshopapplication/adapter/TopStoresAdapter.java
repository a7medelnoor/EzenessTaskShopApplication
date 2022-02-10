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
import com.a7medelnoor.ezenesstaskshopapplication.data.model.TopStores;

import java.util.List;

public class TopStoresAdapter extends RecyclerView.Adapter<TopStoresAdapter.TopStoreViewHolder> {
    private Context context;
    private List<TopStores> topStoresList;

    public TopStoresAdapter(Context context, List<TopStores> topStoresList) {
        this.context = context;
        this.topStoresList = topStoresList;
    }

    @NonNull
    @Override
    public TopStoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopStoreViewHolder(LayoutInflater.from(context).inflate(R.layout.top_stores_recycler_view_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopStoreViewHolder holder, int position) {
        holder.topStoreImageView.setImageResource(topStoresList.get(position).getTopStoreImage());
        holder.topStoreTextViewTagTitle.setText(topStoresList.get(position).getTopStoreUserTag());

    }

    @Override
    public int getItemCount() {
        return topStoresList.size();
    }

    public class TopStoreViewHolder extends RecyclerView.ViewHolder{
        ImageView topStoreImageView;
        TextView topStoreTextViewTagTitle;
        public TopStoreViewHolder(@NonNull View itemView) {
            super(itemView);
            topStoreImageView  = itemView.findViewById(R.id.top_stores_recycler_view_image_view);
            topStoreTextViewTagTitle = itemView.findViewById(R.id.top_stores_recycler_view_text_view_title);
        }
    }
}
