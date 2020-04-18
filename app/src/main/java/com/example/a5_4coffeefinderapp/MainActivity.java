package com.example.a5_4coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] coffee = {"Grindhouse Coffee", "The Haus\nCoffee Shop", "Knee Deep\nCoffee Shop", "Dunedin Coffee Company & Bakery"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.coffeeList, coffee));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0: //Grindhouse
                startActivity(new Intent(MainActivity.this, grind.class));
                break;
            case 1: //The Haus
                startActivity(new Intent(MainActivity.this, haus.class));
                break;
            case 2: //Knee Deep
                startActivity(new Intent(MainActivity.this, knee.class));
                break;
            case 3: //Dunedin
                startActivity(new Intent(MainActivity.this, dunedin.class));
                break;
            default:
                //stuff
                break;
        }
    }
}
