package com.example.createclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ClientAddressFragment extends Fragment {
    private EditText streetEditText;
    private EditText cityEditText;
    private EditText stateEditText;
    private EditText zipEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_client_address, container, false);

        // Initialize the EditText views
        streetEditText = view.findViewById(R.id.street_edit_text);
        cityEditText = view.findViewById(R.id.city_edit_text);
        stateEditText = view.findViewById(R.id.state_edit_text);
        zipEditText = view.findViewById(R.id.zip_edit_text);

        return view;
    }

    public String getStreet() {
        return streetEditText.getText().toString().trim();
    }

    public String getCity() {
        return cityEditText.getText().toString().trim();
    }

    public String getState() {
        return stateEditText.getText().toString().trim();
    }

    public String getZip() {
        return zipEditText.getText().toString().trim();
    }
}
