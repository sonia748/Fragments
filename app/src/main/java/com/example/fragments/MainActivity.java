package com.example.fragments;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getSupportActionBar();

        ab.setTitle("My App");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        //Layout Inflator

        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int clicked = item.getItemId();
        Fragment fr ;
        if(clicked== R.id.screen1){
            fr = new screen1();
    }
//    public void changeFrag(View v){
//
//        int clicked = v.getId();
//        Fragment fr ;
//        if(clicked== R.id.btn1){
//            fr = new screen1();
          //  Toast.makeText(this,"you clicked btn1",Toast.LENGTH_LONG).show();

    else{
            fr = new screen2();
        }
        return super.onOptionsItemSelected(item);
    }
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();

//        ft.replace(R.id.fragment, fr);
//        ft.commit();
}


