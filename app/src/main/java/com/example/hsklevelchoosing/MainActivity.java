package com.example.hsklevelchoosing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnRegister,btnClear;
    CheckBox chkHSK1,chkHSK2,chkHSK3,chkHSK4,chkHSK5,chkHSK6;
    TextView username,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUIView();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String phoneNum = phone.getText().toString();
                String selectedCourse = "Selected Levels : ";

                if (chkHSK1.isChecked()){
                    selectedCourse += "HSK 1 \n";
                }

                if(chkHSK2.isChecked()){
                    selectedCourse += "HSK 2 \n";
                }

                if(chkHSK3.isChecked()){
                    selectedCourse += "HSK 3 \n";
                }

                if(chkHSK4.isChecked()){
                    selectedCourse += "HSK 4 \n";
                }

                if(chkHSK5.isChecked()){
                    selectedCourse += "HSK 5 \n";
                }

                if(chkHSK6.isChecked()){
                    selectedCourse += "HSK 6 \n";
                }

                Toast.makeText(MainActivity.this,"Username : " + name + "\n Phone : " + phoneNum + "\n " + selectedCourse,Toast.LENGTH_LONG ).show();
            }
        });
    }

    private void getUIView(){
        btnRegister = (Button) findViewById(R.id.btn_register);
        btnClear = (Button) findViewById(R.id.btn_clear);
        chkHSK1 = (CheckBox) findViewById(R.id.chk_hsk1);
        chkHSK2 = (CheckBox) findViewById(R.id.chk_hsk2);
        chkHSK3 = (CheckBox) findViewById(R.id.chk_hsk3);
        chkHSK4 = (CheckBox) findViewById(R.id.chk_hsk4);
        chkHSK5 = (CheckBox) findViewById(R.id.chk_hsk5);
        chkHSK6 = (CheckBox) findViewById(R.id.chk_hsk6);
        username = (TextView) findViewById(R.id.txt_username);
        phone = (TextView) findViewById(R.id.txt_phone);
    }
    public void clearData(View view){
        username.setText("");
        phone.setText("");
        chkHSK1.setChecked(true);
        chkHSK2.setChecked(false);
        chkHSK3.setChecked(false);
        chkHSK4.setChecked(false);
        chkHSK5.setChecked(false);
        chkHSK6.setChecked(false);
    }

    public void checkSelectedBox(View view){
        boolean checked = ((CheckBox) view).isChecked();
        String selectedState = "";

        switch (view.getId()){
            case R.id.chk_hsk1 :
                selectedState = checked? "HSK 1 is selected" : "HSK 1 is deselected";
                break;

            case R.id.chk_hsk2:
                selectedState = checked? "HSK 2 is selected" : "HSK 2 is deselected";
                break;

            case R.id.chk_hsk3:
                selectedState= checked? "HSK 3 is selected" : "HSK 3 is deselected";
                break;

            case R.id.chk_hsk4:
                selectedState = checked? "HSK 4 is selected" : "HSK 4 is deselected";
                break;

            case R.id.chk_hsk5:
                selectedState = checked? "HSK 5 is selected" : "HSK 5 is deselected";
                break;

            case R.id.chk_hsk6:
                selectedState = checked? "HSK 6 is selected" : "HSK 6 is deselected";
                break;
        }

        Toast.makeText(MainActivity.this,selectedState,Toast.LENGTH_SHORT).show();
    }
}
