
abstract class Pessoa {
    String nome;
    int idade;
    void comer(){
        System.out.println("Comer");
    }
    //void candidatarSeCargoPolitico(){}
}
// Interface é um metodo abastrato que deve ser construido nas classes que o implementar o objetivo é padronizar
interface Presidente {
    void candidatarSeCargoPolitico();
}

class DesenvolvedorAndroid extends Pessoa{
    void programar(){}
}
class DesenvolvedorWeb extends Pessoa {}
class ServidorPublico extends Pessoa {}
class Jornalista extends Pessoa implements Presidente  {
    void escreverNoticia(){}
    @Override
    public void candidatarSeCargoPolitico() {
        System.out.println("cadidatar-se cargo político");
    }
}

class Scratch {
    public static void main(String[] args) {

        DesenvolvedorAndroid devAndroid = new DesenvolvedorAndroid();
        //devAndroid.candidatarSeCargoPolitico();

        Jornalista jornalista = new Jornalista();
        jornalista.candidatarSeCargoPolitico();

    }
}