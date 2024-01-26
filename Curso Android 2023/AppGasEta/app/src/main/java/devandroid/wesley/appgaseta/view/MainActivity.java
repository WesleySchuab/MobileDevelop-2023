package devandroid.wesley.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import devandroid.wesley.appgaseta.R;
import devandroid.wesley.appgaseta.view.apoio.UtilGasEta;
import devandroid.wesley.appgaseta.view.controller.CursoController;
import devandroid.wesley.appgaseta.view.controller.PessoaController;
import devandroid.wesley.appgaseta.view.model.Combustivel;
import devandroid.wesley.appgaseta.view.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    List<String> nomesDosCursos;
    PessoaController controller;
    CursoController cursoController;
    String dadosPessoa;
    EditText editGasolina;
    EditText editEtanol;

    TextView txtResultado;

    double precoGasolina;
    double precoEtanol;
    String recomendacao;
    Button btnCalcular;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        // Instanciando obj
        Combustivel combustivelGasolina;
        Combustivel combustivelEtanol;

        initiForm();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            boolean isDadosOk = true;
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editGasolina.getText())){
                    editGasolina.setError("* Obrigatório");
                    editGasolina.requestFocus();
                    isDadosOk = false;
                }

                if(TextUtils.isEmpty(editEtanol.getText())){
                    editEtanol.setError("* Obrigatório");
                    editEtanol.requestFocus();
                    isDadosOk = false;
                }

                if(isDadosOk){

                    precoGasolina = Double.parseDouble(editGasolina.getText().toString());
                    precoEtanol = Double.parseDouble(editEtanol.getText().toString());

                    recomendacao = UtilGasEta.calcularMelhorOpcao(precoGasolina,precoEtanol);
                    txtResultado.setText(recomendacao);


                }else{
                    Toast.makeText(MainActivity.this,
                            "Por favor, digite os dados obrigatórios...",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editEtanol.setText("");
                editGasolina.setText("");
            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void initiForm() {
        editGasolina = findViewById(R.id.editGasolina);
        editEtanol = findViewById(R.id.editEtanol);

        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular = findViewById(R.id.btnCalcular);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);
    }


}