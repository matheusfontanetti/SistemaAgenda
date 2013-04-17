/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;
import java.util.Random;
/**
 *
 * @author aluno
 */




public class GeradorDisciplinas {

   
    static public String[] disciplinas1 ={
        "Microprocessadores ",
        "Arquitetura",
        "Sistemas",
        "Teoria",
        "Inteligencia",
        "Linguagens",
        "Estrutura",
        
    };
    static private String[] disciplinas2 ={
      "II",
      "Computadores",
      "Operacionas",
      "Orientados",
      "Computação",
      "Artificial",
      "Comercias",
      "Dados",    
    };
    static private String[] disciplinas3 ={
      "Objetos",
      "I",
      "a",
      "Programação",
     
    };
    
     static private String disciplinas3() {
        
        ExpressaoGeradorDisciplinas disciplinaGerada = new ExpressaoGeradorDisciplinas(15);
        disciplinaGerada.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        
        ExpressaoGeradorDisciplinas disciplinaGerada2 = new ExpressaoGeradorDisciplinas(20);
        disciplinaGerada2.colar(new ParteFixaGeradorDisciplinas("de "));
        disciplinaGerada2.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        disciplinaGerada2.colar(new ParteFixaGeradorDisciplinas(" "));
        disciplinaGerada2.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        
        ExpressaoGeradorDisciplinas disciplinaGerada3 = new ExpressaoGeradorDisciplinas(20);
        disciplinaGerada3.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        disciplinaGerada3.colar(new ParteFixaGeradorDisciplinas(" da "));
        disciplinaGerada3.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        
        ExpressaoGeradorDisciplinas disciplinaGerada4 = new ExpressaoGeradorDisciplinas(45);
        disciplinaGerada4.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        disciplinaGerada4.colar(new ParteFixaGeradorDisciplinas(" "));
        disciplinaGerada4.colar(new ParteSorteadaGeradorDisciplinas(disciplinas3));
        
        ExpressaoGeradorDisciplinas[] opts = {disciplinaGerada, disciplinaGerada2, disciplinaGerada3, disciplinaGerada4};
        Gerador g = new Gerador(opts);
        
        return g.prox();

    }
    
    static public String disciplinas1() {
        
        ExpressaoGeradorDisciplinas disciplinasAlgumas = new ExpressaoGeradorDisciplinas(5);
       
        disciplinasAlgumas.colar(new ParteSorteadaGeradorDisciplinas(disciplinas1));
        disciplinasAlgumas.colar(new ParteFixaGeradorDisciplinas(" " + disciplinas2()));
        
        ExpressaoGeradorDisciplinas disciplinasAlgumas2 = new ExpressaoGeradorDisciplinas(5);
        
        disciplinasAlgumas2.colar(new ParteSorteadaGeradorDisciplinas(disciplinas1));
        disciplinasAlgumas2.colar(new ParteFixaGeradorDisciplinas(" " + disciplinas2()));

        ExpressaoGeradorDisciplinas disciplinasAlgumas3 = new ExpressaoGeradorDisciplinas(90);
        disciplinasAlgumas3.colar(new ParteSorteadaGeradorDisciplinas(disciplinas1));
        disciplinasAlgumas3.colar(new ParteFixaGeradorDisciplinas(" " + disciplinas2()));
        
        ExpressaoGeradorDisciplinas[] opts = {disciplinasAlgumas, disciplinasAlgumas2, disciplinasAlgumas3};
        Gerador g1 = new Gerador(opts);
        
       
        
        return g1.prox();
    }
    
    static public String disciplinas2() {
        
        ExpressaoGeradorDisciplinas disciplinasCriadas = new ExpressaoGeradorDisciplinas(5);
       
        disciplinasCriadas.colar(new ParteSorteadaGeradorDisciplinas(disciplinas2));
        disciplinasCriadas.colar(new ParteFixaGeradorDisciplinas(" " + disciplinas3()));
        
        ExpressaoGeradorDisciplinas disciplinasCriadas2 = new ExpressaoGeradorDisciplinas(5);
        
        disciplinasCriadas2.colar(new ParteSorteadaGeradorDisciplinas(disciplinas2));
        disciplinasCriadas2.colar(new ParteFixaGeradorDisciplinas(" " + disciplinas3()));

        ExpressaoGeradorDisciplinas disciplinasCriadas3 = new ExpressaoGeradorDisciplinas(90);
        disciplinasCriadas3.colar(new ParteSorteadaGeradorDisciplinas(disciplinas2));
        disciplinasCriadas3.colar(new ParteFixaGeradorDisciplinas(" " + disciplinas3()));
        
        ExpressaoGeradorDisciplinas[] opts = {disciplinasCriadas, disciplinasCriadas2, disciplinasCriadas3};
        Gerador g = new Gerador(opts);
        return g.prox();
    }
   
    static public String prox() {
        Random g = new Random();
        if (g.nextBoolean()) {
            return disciplinas2();
        } else {
            return disciplinas1();
        }
    
    
    
    
    
    
    
  
   
        
    
    }
    

    
    
    
    
    
    
}
