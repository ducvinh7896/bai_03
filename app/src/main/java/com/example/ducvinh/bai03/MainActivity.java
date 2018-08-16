package com.example.ducvinh.bai03;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtnamduong,txtnamam;
    private Button btnchuyen;
    private  int namduong;
    private String namam,can, chi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontrol();
        addevent();
    }

    private void addevent() {
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namduong=Integer.parseInt(txtnamduong.getText().toString());

                if(namduong<1900){
                    Toast.makeText(MainActivity.this,"năm phải >=1900",Toast.LENGTH_LONG).show();;
                }else{
                    switch (namduong%10){
                        case 0:can="Canh";
                        break;
                        case 1:can="Tân";
                        break;
                        case 2: can="Nhâm";
                        break;
                        case 3:can="Quý";
                        break;
                        case 4: can="Giáp";
                        break;
                        case 5:can="Ất";
                        break;
                        case 6: can="Bính";
                        break;
                        case 7:can="Đinh";
                        break;
                        case 8: can="Mậu";
                        break;
                        case 9: can="Kỳ";
                        break;


                    }
                    switch (namduong%12){
                        case 0:chi="thân";
                            break;
                        case 1:chi="dậu";
                            break;
                        case 2:chi="tuất";
                            break;
                        case 3:chi="hợi";
                            break;
                        case 4:chi="tý";
                            break;
                        case 5: chi="sỉu";
                            break;
                        case 6:chi="dần";
                            break;
                        case 7:chi="mẹo";
                            break;
                        case 8:chi="thìn";
                            break;
                        case 9:chi="tỵ";
                            break;
                        case 10:chi="ngọ";
                            break;
                        case 11:chi="mùi";
                            break;
                    }
                    txtnamam.setText(String.valueOf(can+" "+chi));


                }

            }
        });
    }

    private void addcontrol() {
        txtnamduong=findViewById(R.id.txtnamduong);
        txtnamam=findViewById(R.id.txtnamam);
        btnchuyen=findViewById(R.id.btnchuyen);
    }
}
