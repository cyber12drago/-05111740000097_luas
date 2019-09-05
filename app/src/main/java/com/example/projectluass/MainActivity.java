package com.example.projectluass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang,edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung luas persegi panjang");

        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
        edtLebar = (EditText)findViewById(R.id.edt_lebar);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_Luas);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String panjang=edtPanjang.getText().toString().trim();
                String lebar=edtLebar.getText().toString().trim();

                double p= Double.parseDouble(panjang);
                double l= Double.parseDouble(lebar);

                double luas=p*l;
                txtLuas.setText("luas: "+luas);

            }
        });
    }
}
