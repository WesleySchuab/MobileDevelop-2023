package devandroid.wesley.applistacurso.view.controller;

import android.content.SharedPreferences;

import devandroid.wesley.applistacurso.view.model.Pessoa;
import devandroid.wesley.applistacurso.view.view.MainActivity;

public class PessoaController {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {
        sharedPreferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = sharedPreferences.edit();
    }

    public void criarSharedPreferences() {

    }

    public void salvar(Pessoa pessoa) {
        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobrenome", pessoa.getSobreNome());
        listaVip.putString("cursoDejsedo", pessoa.getCursoDesejado());
        listaVip.putString("telefone", pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(sharedPreferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(sharedPreferences.getString("sobrenome", ""));
        pessoa.setCursoDesejado(sharedPreferences.getString("cursoDejsedo", ""));
        pessoa.setTelefoneContato(sharedPreferences.getString("telefone", ""));
        return pessoa;

    }

    public void limpar() {

        listaVip.clear();
        listaVip.apply();
    }

}
