## Repositório de Estudos - Desenvolvimento Android 2023 (Udemy - Marcos Maddo)

Este repositório servirá como um caderno de notas para acompanhar o curso de Desenvolvimento Android 2023 do professor Marcos Maddo na Udemy. 

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
