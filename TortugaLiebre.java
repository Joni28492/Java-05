/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Alumno36
 */
public class TortugaLiebre extends JApplet{
    
     public static void inicializarMatriz(boolean matriz[]){
     
         matriz[0]=true;
         for (int i = 1; i < matriz.length; i++) {
             matriz[i]=false;
         }
     }
     
     public static void mostrarMatriz(boolean tortuga[], boolean liebre[]){
         
         System.out.println("POSICIONES ACTUALES");
         System.out.println("-------------------");
         
         for (int i = 0; i < tortuga.length; i++) {
             if(!tortuga[i])
                 System.out.print("*");
             else
                 System.out.print("T");
         }
         
         System.out.println();
          System.out.println();
          for (int i = 0; i < liebre.length; i++) {
             if(!liebre[i])
                 System.out.print("*");
             else
                 System.out.print("L");
         }
         System.out.println();
          System.out.println();
     }
         
     public static void asignarPosicion(boolean tortuga[], boolean liebre[], int posicionTortuga, int posicionLiebre){
     
         
         //modificamos la tortuga
         for (int i = 0; i < posicionTortuga; i++) {
             
             if(tortuga[i]){
                 tortuga[i]=false;
                 
             }
             
             if(i==(posicionTortuga-1)){
                 tortuga[i]=true;
             }
             
         }
         
          //modificamos la liebre
         for (int i = 0; i < posicionLiebre; i++) {
             
             if(liebre[i]){
                 liebre[i]=false;
                 
             }
             
             if(i==(posicionLiebre-1)){
                 liebre[i]=true;
             }
             
         }
     
     
     
     
     
     }
     
     public static boolean detectarChoque(boolean tortuga[], boolean liebre[]){
     
     
            for (int i = 0; i < tortuga.length; i++) {
             
                if(tortuga[i] && liebre[i]){
                    return true;
                }
            }
     
     
            return false;
     
     }
         
     public static int devolverAleatorio(int num){
         
         Random numeroAleatorio=new Random();
         
         num=1+numeroAleatorio.nextInt(10);
         return num;
     
     }
     
     
     //movimientos tortuga
     public static int pasoPesadoRapido(){System.out.println("Paso pesado rapido +3"); return 3;}
     public static int resbalon(){System.out.println("resbalon -6"); return -6;}
     public static int pasePesadoLento(){System.out.println("paso pesado lento +1"); return 1;}
     
     //movimientos liebre
     public static int dormir(){System.out.println("dormir 0"); return 0;}
     public static int granSalto(){System.out.println("gran salto +9"); return 9;}
     public static int granResbalon(){System.out.println("gran resbalon -12"); return -12;}
     public static int pequenioSalto(){System.out.println("pequenio salto +1"); return 1;}
     public static int pequenioResbalon(){System.out.println("pequenio resbalon -2"); return -2;}
    
     public static void movimiento(boolean tortuga[], boolean liebre[], int num, int posicionTortuga, int posicionLiebre){
           
        //movimientos para la tortuga
       //num=devolverAleatorio(num);
        System.out.println(num);
       if(num>0 && num<6){   posicionTortuga+=pasoPesadoRapido();   }
       if(num>5 && num<8){  posicionTortuga+=resbalon();   }
       if(num>7 && num<11){ posicionTortuga+=pasePesadoLento();   }
       if(posicionTortuga<0){   posicionTortuga=0;  }
       if(posicionTortuga>tortuga.length-1){    posicionTortuga=tortuga.length-1;   }
       
       //movimientos para la liebre
       num=devolverAleatorio(num);
       System.out.println(num);
       if(num>0 && num<3){  posicionLiebre+=dormir();   }
       if(num>3 && num<5){  posicionLiebre+=granSalto(); }
       if(num>5 && num<7){ posicionLiebre+=granResbalon(); }
       if(num>7 && num<10){    posicionLiebre+=pequenioSalto(); }
       if(num==10){    posicionLiebre+=pequenioResbalon(); }
       if(posicionLiebre<0){    posicionLiebre=0;   }
       if(posicionLiebre>liebre.length-1){  posicionLiebre=liebre.length-1; }

               
       asignarPosicion(tortuga,liebre,posicionTortuga,posicionLiebre);
       
    }
    
    public static void botonEspera(){
        Scanner sc=new Scanner(System.in);
        int boton=0;
        
        System.out.println("continuar?");
        boton=sc.nextInt();
        
        
    }
     
    public static void main(String[] args) {
        // TODO code application logic here

        
        int posicionTortuga=0;
        int posicionLiebre=0;
        boolean tortuga[]=new boolean[30];
        boolean liebre[]=new boolean[30];
        
        int numero=0;
        //inicializacion
        inicializarMatriz(tortuga);
        inicializarMatriz(liebre);
        mostrarMatriz(tortuga, liebre);
        
        //movimientos
        do{
            botonEspera();
            numero=devolverAleatorio(numero);
            movimiento( tortuga,  liebre,  numero,  posicionTortuga,  posicionLiebre);
            mostrarMatriz(tortuga, liebre);
        
        
        }while(posicionTortuga!=tortuga.length-1 && posicionLiebre!=liebre.length-1);
        
        
        //resultado
        if(posicionTortuga==tortuga.length-1 && posicionLiebre==liebre.length-1){
            System.out.println("EMPATE!!!");
        }
        
        else if(posicionTortuga==tortuga.length-1){
            System.out.println("La tortuga ha ganado la carrera");
        }
        
        else{
            System.out.println("La Liebre ha ganado la carrera");
        }
        
        
        
        
       
       
    }
    
}
