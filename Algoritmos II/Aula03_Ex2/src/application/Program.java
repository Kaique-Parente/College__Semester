package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matriz[][] = new int[5][5];
        double soma = 0;

        for(int i=0; i<matriz.length;i++)
        {
            for(int j =0; j<matriz[0].length;j++)
            {
                matriz[i][j] = (int) (Math.random()*5000);
            }
        }
        System.out.println("1) Exibir");
        for(int i=0; i<matriz.length;i++)
        {
            for(int j =0; j<matriz[0].length;j++)
            { 
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("2) Diagonal Principal");
        for(int i=0; i < matriz.length; i++) {
            if(i == 0) {
                System.out.print(matriz[i][i]);
            } else {
                System.out.print(", " + matriz[i][i]);
            }
        }
        System.out.println("\n");
        
        System.out.print("3) Somar Coluna digitada: ");
        int c = sc.nextInt() - 1;
        
        for(int i=0; i < matriz.length; i++) {
            soma += matriz[i][c];
        }
        System.out.printf("Soma: %.2f\n", soma);
        soma = 0.0;
        
        System.out.println("");
        
        System.out.print("4) Somar Linha digitada: ");
        int l = sc.nextInt() - 1;
        
        for(int i=0; i < matriz.length; i++) {
            soma += matriz[l][i];
        }
        System.out.printf("Soma: %.2f\n", soma);
        soma = 0.0;
        
        System.out.println("");
        
        System.out.println("05) Elementos acima da Diagonal Principal");
        int v = 0;
        for(int i=0; i < matriz.length; i++) {
            
            for(int j=0; j < matriz[0].length -1; j++) {
                
                if(v==0) {
                    System.out.print(matriz[i][v+ 1]);
                } else if(v + 1 < matriz.length){
                    System.out.print(", " + matriz[i][v+1]);
                }
                v++;
            }
            
        }
        System.out.println("\n");
    }
}
