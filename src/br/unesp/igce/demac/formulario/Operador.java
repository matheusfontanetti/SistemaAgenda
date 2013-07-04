/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.demac.formulario;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/**
 *
 * @author WinXP
 */
public class Operador {
    protected Map<String,DisciplinasCursadas> dados;
    protected br.unesp.igce.demac.formulario.ui.FormularioImpl form;
    public Operador(Map<String,DisciplinasCursadas> dados,
            br.unesp.igce.demac.formulario.ui.FormularioImpl form){
        this.dados=dados; 
        this.form=form;
        }
    public void  adicionarDisciplinasCursadas(DisciplinasCursadas disc){
        dados.put(disc.getNomeDisciplinas(),disc);   
    }
    public void  adicionarHorario(DisciplinasCursadas disc){
        dados.put(disc.getHorario(),disc);   
    }
    public void  adicionarDiaSemana(DisciplinasCursadas disc){
        dados.put(disc.getDiaSemana(),disc);      
    }
    public DisciplinasCursadas buscarDisciplinas(String disciplina){
        return dados.get(disciplina); 
    }
    public DisciplinasCursadas buscarHorario(String horario){
        return dados.get(horario); 
    }
     public DisciplinasCursadas buscarDiaSemana(String diaSemana){
        return dados.get(diaSemana); 
    }
     public DisciplinasCursadas removerDisciplinas(String disciplina){
         return dados.remove(disciplina);
     }
     
      public DisciplinasCursadas removerHorario(String horario){
         return dados.remove(horario);
     }
      
      public DisciplinasCursadas removerDiaSemana(String diaSemana){
         return dados.remove(diaSemana);
     }
      
      
      
      

      
      
     
     
     public void fechar(){
         try {
            FileOutputStream fos = new FileOutputStream("dados.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dados);
            oos.close();

        } catch (Exception ex) {
            System.err.println("Erro de arquivo");
           
        }
    }
}

     
    
    
    
    
    

