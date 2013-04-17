/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;

/**
 *
 * @author WinXP
 */
public class ParteFixaGeradorDisciplinas  implements ParteExpressaoGeradorDisciplinas{
    
    private String texto;
    
    public ParteFixaGeradorDisciplinas(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String get() {
        return texto;
    }

    
    
    
    
}
