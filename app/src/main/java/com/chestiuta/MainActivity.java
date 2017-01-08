package com.chestiuta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        //prima varianta, declar textView pt a avea acces la el
//        final TextView caca = (TextView) findViewById(R.id.ana);
//        caca.setText("Nu e ana");
//        caca.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show();
//            }
//        });

        //a doua varianta, daca vreau doar sa atasez un onClickListener
        findViewById(R.id.ana).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show();
            }
        });

    }
}
