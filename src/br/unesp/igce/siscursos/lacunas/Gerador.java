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
public class Gerador {
   
        private ExpressaoGeradorDisciplinas[] cartucho;
    private int[] distribuicao;
    private Random g = new Random();

    
    public Gerador(ExpressaoGeradorDisciplinas[] cartucho){
        this.cartucho = cartucho;
        
        distribuicao = new int[cartucho.length - 1];
        int total = 0;
        for (int i = 0; i < cartucho.length; i++) 
            if (cartucho[i].peso > 0)
                total += cartucho[i].peso;
        if (total == 0)
            System.err.println("Pesos devem ser positivos");
        else {
            int acumula = 0;
            for (int i = 0; i < cartucho.length - 1 ; i++) {
                acumula += cartucho[i].peso*100/total;
                distribuicao[i] = acumula;
            }
        }

    }
    
    public String prox() {
        int sorteio = g.nextInt(100);
        int iCaso;
        for (iCaso = 0; iCaso < distribuicao.length; iCaso++)
            if (sorteio < distribuicao[iCaso]) 
                break;
        ExpressaoGeradorDisciplinas caso = cartucho[iCaso];
        
        String mtg = "";
        ParteExpressaoGeradorDisciplinas[] partes = caso.toArray();
        for (int i = 0; i < partes.length; i++) {
            mtg = mtg + partes[i].get();
        }
        return mtg;
    }
    
    
    
    
    
    
    
    
    
    
}
