/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unito;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Melee & Fede
 */
public class Unito {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int d1,k,nj,p1,p2,p3,p4,pr;
    p1=0; p2=0; p3=0; p4=0; pr=0;
    String nt;
    Random rnd=new Random();
             
    nj=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de jugadores hasta un maximo de 3"));
        
    while(p1<100 && p2<100 && p3<100){
        
        for (k=1;k<=nj;k++){
        JOptionPane.showMessageDialog(null, "Turno Jugador N°: "+k);
        nt=JOptionPane.showInputDialog("Lanzar Dados?");
           while (nt.equalsIgnoreCase("si")){
            d1=rnd.nextInt(6)+1;
            if (d1==1){
                JOptionPane.showMessageDialog(null, "pierde el turno");
                pr=0;
                nt="no";
            }else{
                pr=pr+d1;
                JOptionPane.showMessageDialog(null,"Resultado de la tirada: "+d1+"\n Puntaje acumulado: "+pr );
                nt=JOptionPane.showInputDialog("volver a tirar?");
            }
        }
        switch (k) {
            case 1:
                p1= p1+pr ;
                JOptionPane.showMessageDialog(null, "puntaje: "+p1 );
                pr =0;
                break;
            case 2:
                p2= p2+pr ;
                JOptionPane.showMessageDialog(null, "puntaje: "+p2 );
                pr =0;
                break;
            case 3:
                p3= p3+pr ;
                JOptionPane.showMessageDialog(null, "puntaje: "+p3 );
                pr =0;
                break;
            default:
                p4= p4+pr ;
                JOptionPane.showMessageDialog(null, "puntaje: "+p4 );
                pr =0;
                break;
        }
        
      }      
    } 
       
    if (p1>p2 && p2>p3){
        if(p2>p3){
            JOptionPane.showMessageDialog(null,"1° Jugador Nro 1 \n 2° Jugador Nro 2 \n 3° Jugador Nro 3");
        }else{
            JOptionPane.showMessageDialog(null,"1° Jugador Nro 1 \n 2° Jugador Nro 3 \n 3° Jugador Nro 2");
        }
    }else{
        if(p2>p1 && p2>p3){
            if(p1>p3){
                JOptionPane.showMessageDialog(null,"1° Jugador Nro 2 \n 2° Jugador Nro 1 \n 3° Jugador Nro 3");
            }else{
                JOptionPane.showMessageDialog(null,"1° Jugador Nro 3 \n 2° Jugador Nro 3 \n 3° Jugador Nro 1");
            }
        }else if (p1>p2){
            JOptionPane.showMessageDialog(null,"1° Jugador Nro 3 \n 2° Jugador Nro 1 \n 3° Jugador Nro 2");
          
        }else{
            JOptionPane.showMessageDialog(null,"1° Jugador Nro 3 \n 2° Jugador Nro 2 \n 3° Jugador Nro 1");
        }
    }
    }
     }     

