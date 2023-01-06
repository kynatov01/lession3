package com.example.android1lession3.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.android1lession3.R;

public class FirstFragment extends Fragment {

    private final String admin = "admin";
    private EditText password;
    private Button btn_go_tsa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        password = view.findViewById(R.id.password);
        btn_go_tsa = view.findViewById(R.id.btn_input);

        click();
    }

    private void click() {
        btn_go_tsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = password.getText().toString().trim();

                if (!text.equals(admin)) {
                    password.setError("Не правильный пароль!");
                } else {
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new SecondFragment())
                            .addToBackStack(FirstFragment.class.getName())
                            .commit();
                }
            }
        });
    }
}