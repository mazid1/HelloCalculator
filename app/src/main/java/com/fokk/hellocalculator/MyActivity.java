package com.fokk.hellocalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_exit) {
            finish();
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void add(View view) {
        EditText editText = (EditText) findViewById(R.id.input1);
        EditText editText1 = (EditText) findViewById(R.id.input2);
        String text = editText.getText().toString();
        String text1 = editText1.getText().toString();
        Double a = Double.parseDouble(text);
        Double b = Double.parseDouble(text1);
        Double c = a+b;

        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(c);
        String s = sb.toString();
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(s);
    }

    public void sub(View view) {
        EditText editText = (EditText) findViewById(R.id.input1);
        EditText editText1 = (EditText) findViewById(R.id.input2);
        String text = editText.getText().toString();
        String text1 = editText1.getText().toString();
        Double a = Double.parseDouble(text);
        Double b = Double.parseDouble(text1);
        Double c = a-b;

        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(c);
        String s = sb.toString();
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(s);
    }
}
