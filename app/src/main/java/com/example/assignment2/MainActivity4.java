package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
private RadioGroup radioGroup;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        radioGroup=findViewById(R.id.radioG);
        prefs=getSharedPreferences("pref",0);
        int radio=prefs.getInt("radio",3);
        editor=prefs.edit();
        radio1=findViewById(R.id.radio1);
        radio2=findViewById(R.id.radio2);
        radio3=findViewById(R.id.radio3);
        if(radio==1){
            radio1.setChecked(true);
        } else if (radio==2) {
            radio2.setChecked(true);

        }
        else{
            radio3.setChecked(true);
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radio2:
                        editor.putInt("radio",2);
                        Toast.makeText(MainActivity4.this, "Excellent you chose the correct time!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio1:
                        editor.putInt("radio",1);
                        Toast.makeText(MainActivity4.this, "Oops!,you chose the wrong time,try again",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio3:
                        editor.putInt("radio",3);
                        Toast.makeText(MainActivity4.this, "Oops!,you chose the wrong time,try again",Toast.LENGTH_SHORT).show();
                        break;

                }
                editor.commit();
            }
        });


    }
}