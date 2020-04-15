/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*;
/**
 *
 * @author Brayan
 */
public class Filmes extends JFrame implements ActionListener{
    //paneles para dividir texto y botones
    JPanel p1, p2;
    //Botones para realizar las acciones y tomar los datos
    JButton b1, b2, b3, b4, b5, b6, b7 ,b8, b9, b10,b11;
    //textos para describir
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    //para obtener los datos
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    int contador=0;
    public Filmes() {
        Pelicula pe1=new Pelicula("SONIC LA PELICULA","Jeff Fowler","2020");
        Pelicula pe2=new Pelicula("UN AMIGO ABOMINABLE","Jill Culton","2019");
        Pelicula pe3=new Pelicula("DOLITTLE","Stephen Gaghan","2020");
        Pelicula pe4=new Pelicula("LA FORMA DEL AGUA","Guillermo del Toro","2017");
        Pelicula pe5=new Pelicula("EL LABERINTO DEL FAUNO","Guillermo del Toro","2006");
        Pelicula pe6=new Pelicula("PARASITOS","Bong Joon-ho","2019");
        Pelicula pe7=new Pelicula("ASESINATO EN EL EXPRESO DE ORIENTE","Kennet Branagh","2017");
        Pelicula pe8=new Pelicula("JOKER","Todd Philips","2019");
        Pelicula pe9=new Pelicula("CORAZÓN DE TINTA","Iain Softley","2008");
        Pelicula pe10=new Pelicula("TOY STORY 4","Josh Cooley","2019");
        ArrayList taquilla = new ArrayList();
        taquilla.add(pe1);
        taquilla.add(pe2);
        taquilla.add(pe3);
        taquilla.add(pe4);
        taquilla.add(pe5);
        taquilla.add(pe6);
        taquilla.add(pe7);
        taquilla.add(pe8);
        taquilla.add(pe9);
        taquilla.add(pe10);
        setBounds(100,100,800,500);
        setLayout(new GridLayout());
        //panel
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel(taquilla.get(0).toString());
        t1 = new JTextField(10);
        b1 = new JButton("Vender Boletos: Sonic");
        b1.addActionListener(this);
        b1.setActionCommand("Vender Boletos: Sonic");
        p1.add(l1);
        p2.add(t1);
        p2.add(b1);
        p1.setBackground(Color.cyan);
        //panel 2
        l2 = new JLabel(taquilla.get(1).toString());
        t2 = new JTextField(10);
        b2= new JButton("Vender Boletos: Un Amigo Abominable");
        b2.addActionListener(this);
        b2.setActionCommand("Vender Boletos: Un Amigo Abominable");
        p1.add(l2);
        p2.add(t2);
        p2.add(b2);
        p2.setBackground(Color.orange);
        //panel 3
        l3 = new JLabel(taquilla.get(2).toString());
        t3 = new JTextField(10);
        b3= new JButton("Vender Boletos: Dolittle");
        b3.addActionListener(this);
        b3.setActionCommand("Vender Boletos: Dolittle");
        p1.add(l3);
        p2.add(t3);
        p2.add(b3);
        //panel 4
        l4 = new JLabel(taquilla.get(3).toString());
        t4 = new JTextField(10);
        b4= new JButton("Vender Boletos: La forma del agua");
        b4.addActionListener(this);
        b4.setActionCommand("Vender Boletos: La forma del agua");
        p1.add(l4);
        p2.add(t4);
        p2.add(b4);
        //panel 5
        l5 = new JLabel(taquilla.get(4).toString());
        t5 = new JTextField(10);
        b5= new JButton("Vender Boletos: El laberinto del fauno");
        b5.addActionListener(this);
        b5.setActionCommand("Vender Boletos: El laberinto del fauno");
        p1.add(l5);
        p2.add(t5);
        p2.add(b5);
        //panel 6
        l6 = new JLabel(taquilla.get(5).toString());
        t6 = new JTextField(10);
        b6= new JButton("Vender Boletos: Parasitos");
        b6.addActionListener(this);
        b6.setActionCommand("Vender Boletos: Parasitos");
        p1.add(l6);
        p2.add(t6);
        p2.add(b6);
        //panel 7
        l7 = new JLabel(taquilla.get(6).toString());
        t7 = new JTextField(10);
        b7= new JButton("Vender Boletos: Asesinato E. Oriente");
        b7.addActionListener(this);
        b7.setActionCommand("Vender Boletos: Asesinato E. Oriente");
        p1.add(l7);
        p2.add(t7);
        p2.add(b7);
        //panel 8
        l8 = new JLabel(taquilla.get(7).toString());
        t8 = new JTextField(10);
        b8= new JButton("Vender Boletos: Joker");
        b8.addActionListener(this);
        b8.setActionCommand("Vender Boletos: Joker");
        p1.add(l8);
        p2.add(t8);
        p2.add(b8);
        //panel 9
        l9 = new JLabel(taquilla.get(8).toString());
        t9 = new JTextField(10);
        b9= new JButton("Vender Boletos: Corazón de tinta");
        b9.addActionListener(this);
        b9.setActionCommand("Vender Boletos: Corazón de tinta");
        p1.add(l9);
        p2.add(t9);
        p2.add(b9);
        //panel 10
        l10 = new JLabel(taquilla.get(9).toString());
        t10 = new JTextField(10);
        b10= new JButton("Vender Boletos: Toy Story 4");
        b10.addActionListener(this);
        b10.setActionCommand("Vender Boletos: Toy Story 4");
        p1.add(l10);
        p2.add(t10);
        p2.add(b10);
        //panel 11
        b11 = new JButton("Calcular total entradas");
        b11.addActionListener(this);
        b11.setActionCommand("Calcular total entradas");
        p2.add(b11);
        add(p1);
        add(p2);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        int respuesta, calculo;
        if(ae.getActionCommand().equals("Vender Boletos: Sonic")){
            respuesta=Integer.parseInt(t1.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Un Amigo Abominable")){
            respuesta=Integer.parseInt(t2.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Dolittle")){
            respuesta=Integer.parseInt(t3.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: La forma del agua")){
            respuesta=Integer.parseInt(t4.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: El laberinto del fauno")){
            respuesta=Integer.parseInt(t5.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Parasitos")){
            respuesta=Integer.parseInt(t6.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Asesinato E. Oriente")){
            respuesta=Integer.parseInt(t7.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Joker")){
            respuesta=Integer.parseInt(t8.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Corazón de tinta")){
            respuesta=Integer.parseInt(t9.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Vender Boletos: Toy Story 4")){
            respuesta=Integer.parseInt(t10.getText());
            contador=respuesta+contador;
        }
        if(ae.getActionCommand().equals("Calcular total entradas")){
            calculo=Calculo(contador);
            JOptionPane.showMessageDialog(null, "Total de boletos es: " + calculo);
        }
    }
    public int Calculo(int a){
        return a;
    }
}
