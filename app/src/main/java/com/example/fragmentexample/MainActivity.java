package com.example.fragmentexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction  mFragmentTransaction = mFragmentManager.beginTransaction();
        if(item.getItemId() == R.id.action_blue){


            BlueFragment mBlueFragment = new BlueFragment();
           // mBlueFragment = (BlueFragment) mFragmentManager.findFragmentByTag("BLUE");
            mFragmentTransaction.add(R.id.fragment_container, mBlueFragment, "BLUE");

        }else if (item.getItemId() == R.id.action_add){

           AdditionFragment mAdditionFragment = new AdditionFragment();
            mFragmentTransaction.replace(R.id.fragment_container, mAdditionFragment, "ADDITION");



        }
        mFragmentTransaction.commit();
        return super.onOptionsItemSelected(item);
    }
}
