package com.example.ffr6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvGame;
    private ArrayList<String> gameList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_games, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        GamesAdapter adapter = new GamesAdapter(gameList);
        if (rvGame != null) {
            rvGame.setAdapter(adapter);
        }
    }

    private void loadData() {
        gameList.add("Free Fire");
        gameList.add("Pubg");
        gameList.add("Minecraft");
        gameList.add("Clash of Clans");
        gameList.add("Clash Royale");
        gameList.add("Brawl Stars");
        gameList.add("Fifa Mobile");
        gameList.add("Shadow Fight");
        gameList.add("Soul Knight");
        gameList.add("Dota 2");
        gameList.add("Mobile Legends");
        gameList.add("Hay Day");
        gameList.add("Call of Duty");
    }

    private void initView(View view) {
        rvGame = view.findViewById(R.id.rv_game);
    }
}
