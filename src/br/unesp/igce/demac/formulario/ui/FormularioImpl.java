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
import java.io.IOException;
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
    protected br.unesp.igce.demac.formulario.Operador op;
    protected JButton buscar;
    protected JButton remover;
    protected JButton editar;
    
    
    public FormularioImpl(){
    GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);  
        
        
            
     // label1=new JLabel("Codigo da Disciplina:");
     label1=new JLabel();
        c.gridx=0;c.gridy=0;
     layout.setConstraints(label1, c);
     add(label1);
     campoNomeDisciplinas = new JTextField(20);
      c.gridx=1;c.gridy=0;
     layout.setConstraints(campoNomeDisciplinas, c);
     add(campoNomeDisciplinas);
     
     
    //label2=new JLabel("Nome da Disciplina:");
     label2=new JLabel();
     c.gridx=0;c.gridy=1;
     layout.setConstraints(label2, c);
     add(label2);
     campoHorario = new JTextField(20);
      c.gridx=0;c.gridy=0;
     layout.setConstraints(campoHorario, c);
     add(campoHorario);
     
     label3=new JLabel();
     c.gridx=0;c.gridy=1;
     layout.setConstraints(label3, c);
     add(label3);
     campoDiaSemana = new JTextField(20);
      c.gridx=0;c.gridy=0;
     layout.setConstraints(campoDiaSemana, c);
     add(campoDiaSemana);
     
     
     
     
     
    // salvar=new JButton("Salvar");
     salvar=new JButton();
      c.gridx=0;c.gridy=0;
     layout.setConstraints(salvar, c);
     add(salvar);
     salvar.addActionListener(this);
     
     
    // buscar=new JButton("Buscar");
      buscar=new JButton();
      c.gridx=0;c.gridy=0;
     layout.setConstraints(buscar, c);
     add(buscar);
     buscar.addActionListener(this);
     
      // buscar=new JButton("remover");
      remover=new JButton();
      c.gridx=0;c.gridy=0;
     layout.setConstraints(remover, c);
     add(remover);
     remover.addActionListener(this);
     
     
    // buscar=new JButton("editar");
    // editar=new JButton();
    //  c.gridx=0;c.gridy=0;
    // layout.setConstraints(editar, c);
    // add(editar);
    // editar.addActionListener(this);
     
     
     
     
     addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent e){
         op.fechar();
     }
 
     
     });
     
 }
       
     
     
  public void setController(br.unesp.igce.demac.formulario.Operador op){
      this.op=op;   
     
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==salvar){
      op.adicionarDisciplinasCursadas(
      new br.unesp.igce.demac.formulario.DisciplinasCursadas(campoNomeDisciplinas.getText(),campoHorario.getText(),
              campoDiaSemana.getText()));
      System.out.println("a");
  } else if(e.getSource()==buscar){
     br.unesp.igce.demac.formulario.DisciplinasCursadas  disc=op.buscarDisciplinas(
             campoNomeDisciplinas.getText());
          
             
      if(disc!=null){
          campoNomeDisciplinas.setText(disc.getNomeDisciplinas());
          campoHorario.setText(disc.getHorario());
          campoDiaSemana.setText(disc.getDiaSemana());
          
      }
  }
  else if(e.getSource()==remover){
      op.removerDisciplinas(
              new br.unesp.igce.demac.formulario.DisciplinasCursadas(campoNomeDisciplinas.getText(),campoHorario.getText(),
              campoDiaSemana.getText()));  
  }
  
 //else if(e.getSource()==editar){
      //cont.editarDisciplinas( new br.unesp.igce.demac.formulario.DisciplinasCursadas(campoNomeDisciplinas.getText(),campoHorario.getText(),
             // campoDiaSemana.getText(),new br.unesp.igce.demac.formulario.DisciplinasCursadas(auxiliarDisciplinas.getText(), auxiliarHorario.getText(),auxiliardiaSemana.getText()));  
  //}
  
  
  }
 
 public void windowsStateChanged(WindowEvent w){
   if(w.getNewState()==WindowEvent.WINDOW_CLOSED){
       try{
          FileOutputStream fos=new FileOutputStream("dados.bin"); 
          ObjectOutputStream oos= new ObjectOutputStream(fos);
          oos.writeObject(oos);
          
       }
       catch(IOException io){
           System.err.printf("Erro ao abrir o arquivo");
       }
   }  
 }
 
 
 
 
 
 }
        
        
    
    
    

