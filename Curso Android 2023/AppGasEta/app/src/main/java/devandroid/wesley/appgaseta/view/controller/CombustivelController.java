package devandroid.wesley.appgaseta.view.controller;


import android.content.SharedPreferences;
import devandroid.wesley.appgaseta.view.MainActivity;
import devandroid.wesley.appgaseta.view.database.GasEtaDB;
import devandroid.wesley.appgaseta.view.model.Combustivel;

public class CombustivelController extends GasEtaDB {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dadosPreferences;
    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController(MainActivity mainActivity) {
        super(mainActivity);
        sharedPreferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        dadosPreferences = sharedPreferences.edit();
    }
    public void salvar(Combustivel combustivel){
        dadosPreferences.putString("combustivel",combustivel.getNomeDoCombustivel());
        dadosPreferences.putString("recomendacao",combustivel.getRecomendacao());
        dadosPreferences.apply();
    }
    public void limpar(){
        dadosPreferences.clear();
        dadosPreferences.apply();
    }
}
