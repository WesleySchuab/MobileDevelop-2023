package devandroid.wesley.appgaseta.view.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.wesley.appgaseta.view.model.Curso;

public class CursoController {
    // Os atributos são privados e devem ser acessados pelos metodos publicos
   private List listaCurso;

   public List getListaCurso(){
       //Criando uma lista do tipo Curso;
       listaCurso= new ArrayList<Curso>();

       //Adicionando um item a lista de cursos
       listaCurso.add(new Curso("Java"));
       listaCurso.add(new Curso("Html"));
       listaCurso.add(new Curso("C#"));
       listaCurso.add(new Curso("c++"));
       return listaCurso;
   }
   // metodo que devolve uma lista de Strings
   public ArrayList<String> dadosParaSpinner(){
       //lista de string que armazenzar a lista de cursos
       ArrayList<String> dados = new ArrayList<>();
       //laço que vai perciorrer a lista de curos salvar no obejeto do tipo curso e passar para a lista
       for (int i = 0; i < getListaCurso().size(); i++) {
           Curso objeto = (Curso) getListaCurso().get(i);
           dados.add(objeto.getNomeDoCursoDesejado());
       }
       return dados;
   }
}
