package devandroid.wesley.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.wesley.applistacurso.R;
import devandroid.wesley.applistacurso.view.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    String dadosPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciando obj
        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Genivaldo");
        pessoa.setSobreNome("Jatim ");
        pessoa.setCursoDesejado("Alquimia");
        pessoa.setTelefoneContato("1499911911");

        dadosPessoa = "Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa = " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();

    }


}