package com.example.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    EditText etNombre, etApellido;
    Button buGrabar;
    ListView lvListado;
    ArrayList profesores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        buGrabar = findViewById(R.id.buGrabar);
        lvListado = findViewById(R.id.lvListado);

        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        buGrabar = findViewById(R.id.buGrabar);
        lvListado = findViewById(R.id.lvListado);

        profesores = new ArrayList<String>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,profesores);

        lvListado.setAdapter(adapter);

        buGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                profesores.add(etNombre.getText().toString() + " " + etApellido.getText().toString());
                lvListado.deferNotifyDataSetChanged();


            }
        });

    }


}

