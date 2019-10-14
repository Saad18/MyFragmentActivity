package com.example.myfragmentactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;




public class FirstFragment extends Fragment {
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_first, container, false);
      Button firstButton = view.findViewById(R.id.firstButton);

       firstButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_LONG).show();
          }
       });

     return view;
    }
}
