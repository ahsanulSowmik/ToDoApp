package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.todoapp.databinding.ActivityDataInsertBinding;

public class DataInsertActivity extends AppCompatActivity {


    ActivityDataInsertBinding binding;
    NoteRepo noteViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_insert);

        binding = ActivityDataInsertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("title",binding.title.getText().toString());
//                intent.putExtra("disp",binding.disp.getText().toString());
////                Log.d("TAG", "onClick: "+intent.getData());
//                setResult(RESULT_OK,intent);
//                finish();

                Note note = new Note("title","disp");
                noteViewModel.insertData(note);
            }
        });
    }
}