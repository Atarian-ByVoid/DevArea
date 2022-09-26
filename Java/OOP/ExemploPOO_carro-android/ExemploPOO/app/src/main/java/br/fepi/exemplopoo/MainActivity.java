package br.fepi.exemplopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import br.fepi.exemplopoo.modelo.Carro;

public class MainActivity extends AppCompatActivity {

    private EditText etMarca;
    private EditText etCor;
    private Switch switchLiga;
    private TextView tvDados;

    private ArrayList<Carro> carros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMarca = findViewById(R.id.editTextMarca);
        etCor = findViewById(R.id.editTextCor);
        switchLiga = findViewById(R.id.switchLiga);
        tvDados = findViewById(R.id.textViewDados);
    }

    public void adicionarCarro(View view){
        Carro c = new Carro();
        c.setMarca(etMarca.getText().toString());
        c.setCor(etCor.getText().toString());
        c.setMotorLigado(switchLiga.isChecked());

        //append adiciona o texto no final
        tvDados.append(c.mostraAtributos2());

        //adicionando o carro em uma lista
        carros.add(c);

        //resetar os campos
        etMarca.setText("");
        etCor.setText("");
        switchLiga.setChecked(false);
    }
}