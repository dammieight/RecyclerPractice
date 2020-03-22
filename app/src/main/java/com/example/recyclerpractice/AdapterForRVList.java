package com.example.recyclerpractice;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterForRVList extends RecyclerView.Adapter<AdapterForRVList.ViewHolderForRVList> {
    List<String> titles, descs;
    List<Integer> images;
    LayoutInflater inflater;

    public AdapterForRVList(Context context, List<String> titles, List<String> descs, List<Integer> images) {
        this.titles = titles;
        this.descs = descs;
        this.images = images;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolderForRVList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rv_item, parent, false);
        return new ViewHolderForRVList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderForRVList holder, int position) {
        holder.tvTitle.setText(titles.get(position));
        holder.tvDesc.setText(descs.get(position));
        holder.ivPhoto.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolderForRVList extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDesc;
        ImageView ivPhoto;
        private final Context context;
        public ViewHolderForRVList(@NonNull final View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            ivPhoto = itemView.findViewById(R.id.ivPhoto);
            context = itemView.getContext();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ViewItemDetails.class);
                    intent.putExtra("title", titles.get(getAdapterPosition()));
                    intent.putExtra("desc", descs.get(getAdapterPosition()));
                    intent.putExtra("image", images.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }
}
