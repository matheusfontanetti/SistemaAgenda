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
  /*  public void  adicionarHorario(DisciplinasCursadas disc){
        dados.put(disc.getHorario(),disc);   
    }
    public void  adicionarDiaSemana(DisciplinasCursadas disc){
        dados.put(disc.getDiaSemana(),disc);      
    }
     */
    public DisciplinasCursadas buscarDisciplinas(String disciplina){
        return dados.get(disciplina); 
    }
  /*  public DisciplinasCursadas buscarHorario(DisciplinasCursadas horario1){
        return dados.get(horario1); 
    }
     public DisciplinasCursadas buscarDiaSemana(DisciplinasCursadas diaSemana1){
        return dados.get(diaSemana1); 
    }
     */
     public DisciplinasCursadas removerDisciplinas(DisciplinasCursadas disc){
         return dados.remove(disc.getNomeDisciplinas());
     }
     
    /*  public DisciplinasCursadas removerHorario(DisciplinasCursadas horario){
         return dados.remove(horario.getHorario());
     }
      
      public DisciplinasCursadas removerDiaSemana(DisciplinasCursadas diaSemana){
         return dados.remove(diaSemana.getDiaSemana());
          */
    // }
     // public DisciplinasCursadas editarDisciplinas( DisciplinasCursadas auxiliar){
       // DisciplinasCursadas disciplinas;
        
       //   buscarDisciplinas(disciplinas);
       //   auxiliar=auxiliar;
       //   removerDisciplinas(auxiliar);
        //  return dados.put(auxiliar.getNomeDisciplinas(),auxiliar);  
     // }
      
      
    /*  public DisciplinasCursadas editarHorario(DisciplinasCursadas horario, DisciplinasCursadas auxiliar){
          buscarDisciplinas(horario);
          auxiliar=horario;
          removerDisciplinas(horario);
          return dados.put(auxiliar.getNomeDisciplinas(),auxiliar);  
      }
       
     public DisciplinasCursadas editarDiaSemana(DisciplinasCursadas diaSemana, DisciplinasCursadas auxiliar){
          buscarDisciplinas(diaSemana);
          auxiliar=diaSemana;
          removerDisciplinas(diaSemana);
          return dados.put(auxiliar.getNomeDisciplinas(),auxiliar);  
      }
     
        
      */
      

      
      
     
     
     public void fechar(){
         try {
            FileOutputStream fos = new FileOutputStream("dados.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dados);
            oos.close();

        } catch (Exception ex) {
            System.err.println("Erro de arquivo");
           
        }
    }
}

     
    
    
    
    
    

