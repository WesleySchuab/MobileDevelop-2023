package devandroid.wesley.applistacurso.view.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.wesley.applistacurso.R;
import devandroid.wesley.applistacurso.view.controller.PessoaController;
import devandroid.wesley.applistacurso.view.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    //nome do arquivo
    public static final String NOME_PREFERENCES ="pref_listavip";
    Pessoa pessoa;
    PessoaController controller;
    String dadosPessoa;
    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeDoCurso;
    EditText editTelefone;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(NOME_PREFERENCES, 0 );
        //lista para salvar os dados
        SharedPreferences.Editor listaVip = sharedPreferences.edit();

        // Instanciando obj
        controller = new PessoaController();
        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Genivaldo");
        pessoa.setSobreNome("Jatim ");
        pessoa.setCursoDesejado("Alquimia");
        pessoa.setTelefoneContato("1499911911");

        dadosPessoa = "Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        Log.i("obj", "onCreate:  " + dadosPessoa);
        controller.salvar(pessoa);

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefone = findViewById(R.id.editTelefone);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

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
                listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
                listaVip.putString("sobrenome",pessoa.getSobreNome());
                listaVip.putString("cursoDejsedo",pessoa.getCursoDesejado());
                listaVip.putString("telefone",pessoa.getTelefoneContato());
                listaVip.apply();
                Toast.makeText(MainActivity.this, "Nome: " + editPrimeiroNome.getText().toString(), Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "sobrenome: " + editSobrenome.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


}