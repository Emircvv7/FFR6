package com.example.ffr6;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GamesAdapter extends RecyclerView.Adapter<com.example.ffr6.GamesViewHolder> {

    private ArrayList<String> gameList;

    public GamesAdapter(ArrayList<String> gameList) {
        this.gameList = gameList;
    }

    @NonNull
    @Override
    public GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new com.example.ffr6.GamesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.ffr6.GamesViewHolder holder, int position) {
        holder.bind(gameList.get(position));
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }
}
