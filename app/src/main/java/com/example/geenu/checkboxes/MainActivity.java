package com.example.geenu.checkboxes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    CheckBox c1, c2, c3;
    Button button;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox4);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked() && c2.isChecked() && c3.isChecked())
                    str="Tu rehn de!";
                else if(c1.isChecked() && c2.isChecked())
                    str="You are confused,baby";
                else if(c2.isChecked() && c3.isChecked())
                    str="Go to IIT";
                else if(c1.isChecked() && c3.isChecked())
                    str="Yippie, MBA";
                else if(c1.isChecked())
                    str="CAT";
                else if(c2.isChecked())
                    str="GATE";
                else if(c3.isChecked())
                    str="Go to Hell";
                else
                    str="22 kuch ta krle";

                Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
