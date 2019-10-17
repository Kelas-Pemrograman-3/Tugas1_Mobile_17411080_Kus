package com.kus.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView txtnpm;
  TextView txtnama;
  TextView txtalamat;
  TextView txtprodi;
  EditText edtnpm;
  EditText edtnama;
  EditText edtalamat;
  EditText edtprodi;
  Button btnsimpan;
  Button btnbersih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnama = (TextView) findViewById(R.id.txtnama);
        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtprodi = (TextView) findViewById(R.id.txtprodi);
        edtnpm = (EditText) findViewById(R.id.edtnpm);
        edtnama = (EditText) findViewById(R.id.edtnama);
        edtalamat = (EditText) findViewById(R.id.edtalamat);
        edtprodi = (EditText) findViewById(R.id.edtprodi);
        btnsimpan = (Button) findViewById(R.id.btnsimpan);
        btnbersih = (Button) findViewById(R.id.btnbersih);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnpm = edtnpm.getText().toString();
                String strnama = edtnama.getText().toString();
                String stralamat = edtalamat.getText().toString();
                String strprodi = edtprodi.getText().toString();

                txtnpm.setText(strnpm);
                txtnama.setText(strnama);
                txtalamat.setText(stralamat);
                txtprodi.setText(strprodi);
                edtnpm.requestFocus();

            }
        });

        btnbersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtnpm.setText("");
                txtnama.setText("");
                txtalamat.setText("");
                txtprodi.setText("");
                edtnpm.setText("");
                edtnama.setText("");
                edtalamat.setText("");
                edtprodi.setText("");

            }
        });

    }
}
