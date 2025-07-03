package com.example.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ConcertAdapter extends RecyclerView.Adapter<ConcertAdapter.ViewHolder> {

    private List<Concert> concertList;

    public ConcertAdapter(List<Concert> concertList) {
        this.concertList = concertList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDate;

        public ViewHolder(View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDate = itemView.findViewById(R.id.tvDate);
        }
    }

    @NonNull
    @Override
    public ConcertAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_concert, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConcertAdapter.ViewHolder holder, int position) {
        Concert concert = concertList.get(position);
        holder.tvTitle.setText(concert.getTitle());
        holder.tvDate.setText(concert.getDate());
    }

    @Override
    public int getItemCount() {
        return concertList.size();
    }
}
