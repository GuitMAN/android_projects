package ru.vdementev.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);

        textView  = (TextView) findViewById(R.id.textView);
    }

    public void sayHello(View view){

        textView.setText("Новое значение 1");

    }

}
