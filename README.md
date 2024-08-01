## Repositório de Estudos - Desenvolvimento Android (Udemy - Marcos Maddo) e Mentoria Jamilton Damasceno

### Modificadores de Acesso em Java

Os modificadores de acesso em Java controlam a visibilidade dos membros (atributos e métodos) de uma classe.

* **private:**
  * **Visibilidade:** Apenas dentro da classe em que é declarado.
  * **Objetivo:** Encapsular dados e métodos, protegendo-os de acessos externos não intencionais.

* **protected:**
  * **Visibilidade:** Dentro da classe, em subclasses e em classes do mesmo pacote.
  * **Objetivo:** Permitir a herança e o polimorfismo, ao mesmo tempo que restringe o acesso a membros que não são parte da interface pública da classe.

* **default (package-private):**
  * **Visibilidade:** Apenas dentro do mesmo pacote.
  * **Objetivo:** Controlar a visibilidade entre classes relacionadas dentro de um mesmo pacote.

* **public:**
  * **Visibilidade:** De qualquer lugar do programa.
  * **Objetivo:** Expor membros para serem utilizados por outras classes, independentemente de seu pacote.

Sugestão de Melhoria para a Seção sobre Polimorfismo no seu README
Texto original:

##Polimorfismo
* Sobreposição de métodos:
 * Exemplo: Uma classe pai por exemplo anima tem duas classes filhas passaro e cachorro a classe animal tem o metodo andar que pode ser sobrescrito nas classe filha como andar com duas patas na classe passáro e andar com quatro patas na classe cahorro. Utilizamos a sitasse super.andar() e colocamos no metodo o que é comun e depois criamos uma metodo com o mesmo nome que terá as particularidades

Polimorfismo: Muitas formas, um mesmo nome
O polimorfismo é um dos pilares da programação orientada a objetos que permite que objetos de diferentes classes sejam tratados como se fossem de uma mesma classe. Em outras palavras, um mesmo método pode ter comportamentos diferentes dependendo do objeto que o invoca.

Sobreposição de Métodos (Overriding):

Conceito: Quando uma subclasse reimplementa um método herdado da superclasse, modificando seu comportamento, dizemos que houve sobreposição de métodos.

Exemplo:
Imagine uma classe base Animal com um método fazerBarulho(). Subclasses como Cachorro e Gato podem sobrepor esse método para produzir sons específicos:

Java
class Animal {
    public void fazerBarulho() {
        System.out.println("Fazendo um barulho genérico");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }
}
## Utilizando super:

Chamando o método da superclasse: Para reutilizar o comportamento da classe pai dentro da subclasse, utilizamos a palavra-chave super.
Exemplo:
Java
class Animal {
    public void andar() {
        System.out.println("Andando...");
    }
}

class Passaro extends Animal {
    @Override
    public void andar() {
        super.andar(); // Chama o método andar() da classe pai
        System.out.println("...com duas patas!");
    }
}

Por que usar polimorfismo?

Flexibilidade: Permite criar código mais flexível e reutilizável.
Manutenção: Facilita a manutenção do código, pois alterações em um método da classe base afetam todas as subclasses que o sobrepõem.
Abstração: Permite criar hierarquias de classes mais abstratas e genéricas.
Em resumo:

O polimorfismo é uma ferramenta poderosa que permite criar códigos mais flexíveis, reutilizáveis e organizados. Ao entender como a sobreposição de métodos funciona e como utilizar a palavra-chave super, você poderá criar hierarquias de classes mais robustas e eficientes.
