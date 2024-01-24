package devandroid.wesley.applistacurso.view.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import devandroid.wesley.applistacurso.R;
import devandroid.wesley.applistacurso.view.controller.CursoController;
import devandroid.wesley.applistacurso.view.controller.PessoaController;
import devandroid.wesley.applistacurso.view.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    List<String> nomesDosCursos;
    PessoaController controller;
    CursoController cursoController;
    String dadosPessoa;
    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeDoCurso;
    EditText editTelefone;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;
    Spinner spinner;

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

        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                cursoController.dadosParaSpinner());
        //quando clicar no adapter
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefone.setText(pessoa.getTelefoneContato());


        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomeDoCurso.setText("");
                editTelefone.setText("");
                controller.limpar();
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
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editNomeDoCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefone.getText().toString());
                controller.salvar(pessoa);
            }
        });
        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefone.setText(pessoa.getTelefoneContato());
    }

    private void initiForm() {
        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefone = findViewById(R.id.editTelefone);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        spinner = findViewById(R.id.spinner);
    }


}