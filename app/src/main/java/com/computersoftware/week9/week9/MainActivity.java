package com.computersoftware.week9.week9;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;
    Spinner spn_pet,spn_major;
    //for spinner
    ArrayAdapter<String> mAdapter_pet;
    ArrayAdapter<String> mAdapter_major;
    String [] arrPet = {"สุนัข","แมว","ม้า","ปลา","ปู"};
    String [] arrMajor = {"ในเวียง","ร้องกวาง","สอง","ลอง","วังชิ้น","หนองม่วงไข่"};
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_submit = findViewById(R.id.btn_submit);
        spn_pet = findViewById(R.id.spn_pet);
        spn_major = findViewById(R.id.spn_major);

        context = MainActivity.this;
        mAdapter_pet = new ArrayAdapter<String>(context,
                android.R.layout.simple_dropdown_item_1line,arrPet);

        mAdapter_major = new ArrayAdapter<String>(context,
                android.R.layout.simple_dropdown_item_1line,arrMajor);

        spn_pet.setAdapter(mAdapter_pet);
        spn_major.setAdapter(mAdapter_major);

        spn_pet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

//                Toast.makeText(context,
//                        "Result1 : "+arrPet[position],
//                        Toast.LENGTH_SHORT).show();
//                Toast.makeText(context,
//                        "Result1 : "+spn_pet.getSelectedItemId(),
//                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spn_major.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(context,
////                        "Result2 : "+arrMajor[position]
////                        , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        "Pet : "+spn_pet.getSelectedItem() +
                                " Major :"+spn_major.getSelectedItem() ,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
