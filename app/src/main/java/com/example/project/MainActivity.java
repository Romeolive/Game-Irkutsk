package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void levelFirstBtn(View view) {
        Intent intent = new Intent(MainActivity.this,LevelOne.class);
        startActivity(intent);
        MainActivity.this.onPause();
    }
}

























//        firstBtn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        AlertDialog.Builder bui1 = new AlertDialog.Builder(MainActivity.this);
//        bui1.setMessage("Ответ неверный");
//
//        bui1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialogInterface, int i) {
//        dialogInterface.cancel();
//        }
//        });
//        AlertDialog alei = bui1.create();
//        alei.show();
//
//        }
//        });