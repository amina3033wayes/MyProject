package com.example.dell.class_305;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Actionbar this is back button*/
        ActionBar actionbar = getSupportActionBar();
        if (actionbar!=null)
        {
            actionbar.setHomeButtonEnabled(true);
            actionbar.setDisplayHomeAsUpEnabled(true);
        }
        /**ActionBar*/



    }
    /**Creating menu by inflate*/

    /**Creating menu by using Inflatter*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.About){
            /**Making Toast*/
            Toast.makeText(this,"Clicked on about item",Toast.LENGTH_SHORT).show();
        }
        if(id==android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    /**Backpressed Buton*/
    @Override
    public void onBackPressed() {
        /**super.onBackPressed();*/
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


    }
}
