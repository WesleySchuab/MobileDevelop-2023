package devandroid.wesley.applistacurso.view.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.wesley.applistacurso.view.model.Curso;

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
}
