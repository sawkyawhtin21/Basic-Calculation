package com.skhh.myapplicationitone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoAdd(View view) {
        Intent myIntent = new Intent(this,AddNumberActivity.class);
        startActivity(myIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu mymenu) {
        MenuInflater myinflater  = getMenuInflater();
        myinflater.inflate(R.menu.main_menu,mymenu);
        return true;                    // if boolean return true
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.buAdd:
//                Toast.makeText(getApplicationContext(),"New Tab Click",Toast.LENGTH_LONG).show();
                Toasty.success(getApplicationContext(),"New Tab Click",Toasty.LENGTH_LONG).show();
                break;
            case R.id.homeMenu:
//                Toast.makeText(getApplicationContext(),"Home click",Toast.LENGTH_LONG).show();
                Toasty.error(getApplicationContext(),"Home Click",Toasty.LENGTH_LONG).show();
            case R.id.history:
//                Toast.makeText(getApplicationContext(),"History click",Toast.LENGTH_LONG).show();
                Toasty.info(getApplicationContext(),"History Click",Toasty.LENGTH_LONG).show();
        }
        return true;
    }
}