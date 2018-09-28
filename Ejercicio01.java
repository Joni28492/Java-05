/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumno36
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       /* int matriz[]=new int[12];
        
        int matriz[]; //ambas son validas
        matriz=new int[12];
  
        String b[]=new String[100], 
                x[]=new String[27];*/
        
       int matriz[]=new int[10];
       
        for (int i = 0; i < matriz.length; i++) {
            matriz[i]=0;
            System.out.print("Indice: "+i);
            System.out.println(" valor: "+matriz[i]);
        }
        
        int matriz2[]={10,20,30,40,50};
        
        System.out.println();
        System.out.println("longitud array: "+matriz2.length);
        
        for (int i = 0; i < matriz2.length; i++) {
             System.out.print("Indice: "+i);
            System.out.println(" valor: "+matriz2[i]);
        }
        
        //final constante
        final int LONGITUD_MATRIZ = 10;
       // LONGITUD_MATRIZ = 22;//no se cambian los valores de las constantes, es como un define
        
        int matriz3[]= new int[LONGITUD_MATRIZ];
        System.out.println();
        System.out.println("matriz 3");
        for (int i = 0; i < matriz.length; i++) {
            matriz3[i]=2+2*i;
            System.out.print("Indice: "+i);
            System.out.println(" valor: "+matriz3[i]);
        }
        ////////***********************//////
        
        /*JTextArea areaSalida=new JTextArea(10,10);
        JScrollPane scrollPane= new JScrollPane(areaSalida);
        
        System.out.println("Matriz 4");
        int matriz4[]={10,20,30,40,50,60,70,80};
        int suma=0;
        
        for (int i = 0; i < matriz4.length; i++) {
            
            areaSalida.append("indice: "+i+" valor: "+matriz[i]+" suma= "+suma+"\n");
            
            suma+=matriz4[i];
            
        }
        
        //System.out.println("la suma es: ");
       // System.out.println(suma);
        
        areaSalida.append("la suma total es "+suma);
        
        JOptionPane.showMessageDialog(null, scrollPane,"Matrices", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        /*********************************/
        
      
        
        System.out.println("Matriz 5");
        
        int matrizContador[]={0,0,0,0,0,0};
        Random numeroAleatorio=new Random();
        int numero;
        
        for (int i = 0; i < 6000; i++) {
            
            numero=1+numeroAleatorio.nextInt(6);
            
            
                    matrizContador[numero-1]++;
                
            
            
            
            
        }
        
        
        for (int i = 0; i < 6; i++) {
            System.out.println("numero "+(i+1)+" sale "+ matrizContador[i]+" veces");
            
        }
        
        //un programa  que oida la nota  de  20 alumnos, notas de 1 a 5
        //mostar cuantas personas sacaron un 1,2,3,4 o 5;
        
        
        //float matrizAlumnos[]
        int matrizNotas[]={0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce nota:");
            num=sc.nextInt();
            matrizNotas[num-1]++;
            
        }
        
        
        for (int i = 0; i < matrizNotas.length; i++) {
            System.out.print("notas "+(i+1)+":");
            
            for (int j = 0; j < matrizNotas[i]; j++) {
                System.out.print("*");
            }
            
            System.out.println();
                    
        }
        
                
    }
    
}
