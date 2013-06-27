/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.demac.formulario;

/**
 *
 * @author aluno
 */
public class DisciplinasCursadas {
    private String nomeDisciplinas;
    private String horario;
    private String diaSemana;

    public DisciplinasCursadas(String nomeDisciplinas,String horario, String diaSemana){
        this.nomeDisciplinas=nomeDisciplinas;
        this.horario=horario;
        this.diaSemana=diaSemana;       
    }
    
    
    
    /**
     * @return the nomeDisciplinas
     */
    public String getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    /**
     * @param nomeDisciplinas the nomeDisciplinas to set
     */
    public void setNomeDisciplinas(String nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the diaSemana
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    
}
