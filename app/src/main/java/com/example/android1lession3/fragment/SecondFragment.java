package com.example.android1lession3.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1lession3.NamesAdapter;
import com.example.android1lession3.R;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {
    private final List<String> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup conteiner,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second,conteiner,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.txt_names);

        list.add("Naruto");
        list.add("One Piece");
        list.add("Angel Beats");
        list.add("1+1");
        list.add("Wednesday");
        list.add("Kimetsu no Yaiba");
        list.add("Jojo");
        list.add("Anilibria");
        list.add("Portugal");
        list.add("Death Note");
        list.add("tennis");
        list.add("egg cup");
        list.add("biological molecules");
        list.add("Hiking boots");
        list.add("paparazzi");
        list.add("sensitive");
        list.add("margin");

        NamesAdapter name = new NamesAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()
                , RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(name);
    }
}