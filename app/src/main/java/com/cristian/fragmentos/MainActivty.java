package com.cristian.fragmentos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivty extends AppCompatActivity {
    Button primerFragmento, segundoFragmento;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        primerFragmento = (Button) findViewById(R.id.btn_PrimerFragmento);
        segundoFragmento = (Button) findViewById(R.id.btn_SegundoFragmento);

        primerFragmento.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
                cargarFragmento(new PrimerFragmento());
            }
        });

        segundoFragmento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new SegundoFragmento());
            }
        });
    }
    private void cargarFragmento(Fragment fragmento){
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frameLayout, fragmento).commit();
    }
}
