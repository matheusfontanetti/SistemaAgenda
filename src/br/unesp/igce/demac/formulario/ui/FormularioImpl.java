/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.demac.formulario.ui;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author WinXP
 */
public class FormularioImpl extends JFrame implements ActionListener{
     protected JLabel label1;
    protected JTextField campoNomeDisciplinas;
    protected JLabel label2;
    protected JTextField campoHorario;
    protected JLabel label3;
    protected JTextField campoDiaSemana;
    protected JButton salvar;
    protected br.unesp.igce.demac.formulario.Operador cont;
    protected JButton buscar;
    public FormularioImpl(){
    GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(new GridBagLayout());   
        
    }
    
    
}
