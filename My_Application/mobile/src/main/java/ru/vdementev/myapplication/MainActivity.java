package ru.vdementev.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView text;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        text  = (TextView) findViewById(R.id.text_text);
    }

    public void sayRed(View view){

        text.setText("Теперь тут краснота");
        text.setTextColor(0xFFFF0000);
    }

    public void sayBlue(View view){

        text.setText("Теперь все Синее");
        text.setTextColor(0xFF0000FF);
    }

    public void sayGreen(View view){

        text.setText("Теперь тут Зелень");
        text.setTextColor(0xFF00FF00);
    }


    public void sayYellow(View view){

        text.setText("Теперь тут Желтизна");
        text.setTextColor(0xFFFFFF00);
    }
}
