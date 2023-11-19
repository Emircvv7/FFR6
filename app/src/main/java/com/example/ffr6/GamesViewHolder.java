package com.example.ffr6;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GamesViewHolder extends RecyclerView.ViewHolder {

    private TextView gameName;
    public GamesViewHolder(@NonNull View itemView) {
        super(itemView);
        gameName = itemView.findViewById(R.id.game_name);
    }

    public void bind(String name){
        gameName.setText(name);

    }
}
