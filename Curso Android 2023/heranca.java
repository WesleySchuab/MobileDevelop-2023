class Animal {//Classe pai -> SUPER classe

    String cor;
    int tamanho;
    int quantidadePatas;
    double peso;

    public Animal(){}

    public Animal(String cor, int tamanho, int qtdPatas, double peso){
        //Validações do que foi passado
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadePatas = qtdPatas;
        this.peso = peso;
    }

    void correr(){
        System.out.println("Correr como um ");//20 linhas de código
    }

    void dormir(){
        System.out.println("Dormir");
    }

}

// DRY -> Don't Repeat Yourserf
class Cachorro extends Animal {//Classe filha ou subclasse

    //Atributos específicos para o cachorro

    //Construtor
    public Cachorro(){}

    public Cachorro(String cor, int tamanho, int qtdPatas, double peso){
        super(cor, tamanho, qtdPatas, peso);
    }

    void latir(){
        System.out.println("Latir");
    }
    void latir( String pessoa ){
        System.out.println("Latir para " + pessoa );
    }

    // Sobrescrita de método -> Sobreposição
    @Override
    void correr(){
        super.correr();//Implementação padrão
           // A implementação acima de super é equivalente a 
       /* Animal animal = new Animal();
        animal.correr(); */
        System.out.println("cachorro com patas: " + this.quantidadePatas);
     
    }

}

class Passaro extends Animal {//Classe filha ou subclasse

    public Passaro(){}

    public Passaro(String cor, int tamanho, int qtdPatas, double peso){
        //Fazer alguma validação
        super(cor, tamanho, qtdPatas, peso);
        //Fazer mais alguma coisa
    }

    void voar(){
        System.out.println("voar");
    }

    @Override
    void correr(){
        super.correr();
        System.out.println("passaro utilizando as assas e com patas: " + this.quantidadePatas);
    }
}

class Scratch {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro(
            "Marrom", 8, 4, 1.5
        );
        cachorro.correr();


        //cachorro.latir();
        //cachorro.latir("Jamilton");
        /*cachorro.quantidadePatas = 4;
        cachorro.correr();*/

        /*System.out.println("----------");

        Passaro passaro = new Passaro();
        passaro.quantidadePatas = 2;
        passaro.correr();*/

        /*cachorro.dormir();
        cachorro.latir();*/

        /*System.out.println("----------");

        Passaro passaro = new Passaro();
        passaro.cor = "Azul";
        passaro.correr();
        passaro.dormir();
        passaro.voar();*/

    }
}