/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;
import java.util.Random;
/**
 *
 * @author WinXP
 */
public class ParteSorteadaGeradorDisciplinas implements ParteExpressaoGeradorDisciplinas {
    
  private String[] roleta;
    
    public ParteSorteadaGeradorDisciplinas(String[] valores) {
        roleta = valores;
    }
    
    @Override
    public String get(){
        Random g = new Random();
        int sorteio = g.nextInt(roleta.length);
        return roleta[sorteio];
    }  
    
    
}
