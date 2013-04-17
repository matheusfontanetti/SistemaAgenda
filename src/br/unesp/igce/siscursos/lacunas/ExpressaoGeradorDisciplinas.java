/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;
import java.util.ArrayList;
/**
 *
 * @author WinXP
 */
public class ExpressaoGeradorDisciplinas {
    public int peso;
    private ArrayList<ParteExpressaoGeradorDisciplinas> partes = new ArrayList<ParteExpressaoGeradorDisciplinas>();
    
    public ExpressaoGeradorDisciplinas(int peso){
        this.peso = peso;
    }
    public void colar(ParteExpressaoGeradorDisciplinas parte) {
     partes.add(parte);    
    } 
    
    public ParteExpressaoGeradorDisciplinas[] toArray(){
        Object [] ar  = partes.toArray();
     ParteExpressaoGeradorDisciplinas[] res = new ParteExpressaoGeradorDisciplinas[ar.length];
            for (int i = 0; i < res.length; i++) {
                res[i] =(ParteExpressaoGeradorDisciplinas) ar[i];
                
            }
         return res;
    }
    
    }
    
    
    

