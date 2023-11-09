package com.example.buttonnaviation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomnav);




        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                bottomNavigationView.getOrCreateBadge(R.id.nav).setNumber(100);



                if (item.getItemId()==R.id.menu){




                    Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();


                }else if (item.getItemId()==R.id.home){


                    Toast.makeText(MainActivity.this, "not", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId()==R.id.nav) {
                    Toast.makeText(MainActivity.this, "notfeation", Toast.LENGTH_SHORT).show();

                }


                return false;
            }
        });








    }
}