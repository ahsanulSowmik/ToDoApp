package com.example.todoapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.todoapp.databinding.ActivityDataInsertBinding;
import com.example.todoapp.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private NoteViewModel noteViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        noteViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(NoteViewModel.class);

        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataInsertActivity.class);

                startActivityForResult(intent,1);

            }
        });


//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        binding.recyclerView.setHasFixedSize(true);
//        RVAdapter adapter = new RVAdapter();
//        binding.recyclerView.setAdapter(adapter);

//        noteViewModel.getAllData().observe(this, new Observer<List<Note>>() {
//            @Override
//            public void onChanged(List<Note> notes) {
//                adapter.submitList(notes);
//            }
//        });

//        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
//            @Override
//            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
//                return false;
//            }
//
//            @Override
//            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
//
//                noteViewModel.delete(adapter.getNote(viewHolder.getAdapterPosition()));
//
//            }
//        }).attachToRecyclerView(binding.recyclerView);

    }

//    private void setHasFixedSize(boolean b) {
//    }

//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode==1){
//            String title = data.getStringExtra("title");
//            String disp = data.getStringExtra("disp");
//
//            Note note = new Note(title,disp);
//            noteViewModel.insert(note);
//            Toast.makeText(this,"added", Toast.LENGTH_SHORT).show();
//
//
//        }
//    }
}