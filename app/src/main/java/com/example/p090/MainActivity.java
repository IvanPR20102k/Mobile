package com.example.p090;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Intent intent =null;
        switch (item.getItemId())
        {
            case R.id.m1: intent = new Intent(this, theatre.class);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
class MyTask extends AsyncTask<String, Void, ArrayList<String[]>> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        tvInfo.setText("Begin");
    }
    @Override
    protected ArrayList<String[]> doInBackground(String... params) {
        ArrayList<String[]> res=new ArrayList <>();
        return res;
    }
    @Override
    protected void onPostExecute(ArrayList<String[]> result) {
        super.onPostExecute(result);

    }
}
