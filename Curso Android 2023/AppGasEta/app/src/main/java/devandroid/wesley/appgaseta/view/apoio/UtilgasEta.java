package devandroid.wesley.appgaseta.view.apoio;

public class UtilgasEta {
    public static String calcularMelhorOpcao(double gasolina, double etanol){
        // preco da gasolina: R$ 5,12
        // preco do etanol: 3,99

        // preço ideal = gasolina * 0.70 = R$ 3,548

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if(etanol<=precoIdeal) {
            mensagemDeRetorno =  "Abastecer com Etanol";
        }else{
            mensagemDeRetorno =  "Abastecer com Gasolina";
        }

        // se o preco do etanol for igual ou menor que o preco idel,
        // melhor abastecer com etanol, caso contrário, a gasolina é
        // mais vantagem.

        return mensagemDeRetorno; // Abastecer com Gasolina - Abastecer com Etanol
    }
}
