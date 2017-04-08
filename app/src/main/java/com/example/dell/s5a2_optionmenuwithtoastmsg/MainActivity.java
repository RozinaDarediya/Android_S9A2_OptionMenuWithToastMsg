package com.example.dell.s5a2_optionmenuwithtoastmsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Computer is selected" , Toast.LENGTH_LONG).show();
                return true;

            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Gamepad is selected" , Toast.LENGTH_LONG).show();
                return true;

            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Camera is selected" , Toast.LENGTH_LONG).show();
                return true;

            case R.id.item4:
                Toast.makeText(getApplicationContext(),"Video is selected" , Toast.LENGTH_LONG).show();
                return true;

            case R.id.item5:
                Toast.makeText(getApplicationContext(),"EMail is selected" , Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
