package devandroid.wesley.appgaseta.view.controller;

import static devandroid.wesley.appgaseta.view.controller.PessoaController.NOME_PREFERENCES;

import android.content.SharedPreferences;
import android.util.Log;

import devandroid.wesley.appgaseta.view.MainActivity;
import devandroid.wesley.appgaseta.view.model.Combustivel;

public class CombustivelController {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dadosPreferences;
    public static final String NOME_PRERENCES = "pref_gaseta";

    public CombustivelController(MainActivity mainActivity) {
        sharedPreferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        dadosPreferences = sharedPreferences.edit();
    }
    public void salvar(Combustivel combustivel){
        dadosPreferences.putString("combustivel",combustivel.getNomeDoCombustivel());
        //dadosPreferences.putFloat("precoDoCombustivel",(float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao",combustivel.getRecomendacao());
        dadosPreferences.apply();
        Log.i("1w2r","Shared nome combustivel "+sharedPreferences.getString("Gasolina","Not founded"));

        Log.i("1w2e", "onCreate: combustivel: "+sharedPreferences.getString("combustivel",""));
        //Log.i("1w2e", "onCreate: precoDoCombustivel: "+sharedPreferences.getString("precoDoCombustivel",""));
    }
    public void limpar(){
        dadosPreferences.clear();
        dadosPreferences.apply();
        Log.i("1w2e","onCreate: shared nome: "+sharedPreferences.getString("combustivel","Not founded"));
    }
}
