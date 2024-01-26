package devandroid.wesley.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import devandroid.wesley.appgaseta.R;
import devandroid.wesley.appgaseta.view.controller.CursoController;
import devandroid.wesley.appgaseta.view.controller.PessoaController;
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


    Button btnCalcular;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        // Instanciando obj
        controller = new PessoaController(MainActivity.this);
        pessoa = new Pessoa();
        controller.buscar(pessoa);
        cursoController = new CursoController();
        nomesDosCursos = cursoController.dadosParaSpinner();

        initiForm();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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