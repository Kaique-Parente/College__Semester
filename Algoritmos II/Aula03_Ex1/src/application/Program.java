package application;

public class Program {
    public static void main(String[] args) {
        double matriz[][] = new double[10][6];
        double total[] = new double[10];
        String linhao ="";
        double soma =0;
        double abono[] = new double[total.length];
        
        for(int i=0; i<matriz.length;i++)
        {
            for(int j =0; j<matriz[0].length;j++)
            {
                matriz[i][j] = (double) (Math.random()*25000);
            }
        }
        
        for(int i=0; i<matriz.length;i++)
        {
            for(int j =0; j<matriz[0].length;j++)
            {
                linhao = linhao +"\t\t"+ matriz[i][j]; //criar a linha antes de imprimir
                soma = soma +matriz[i][j];
            }
            total[i] = soma;
            if(total[i] >= 100000) {
                abono[i] = total[i] * 0.05;
            } else if(total[i] >= 50000 && total[i] < 100000) {
                abono[i] = total[i] * 0.03;
            } else {
                abono[i] = total[i] * 0.01;
            }
            System.out.println(linhao);
            linhao="";
            soma =0;
        }
        System.out.println("Total");
        for(int j =0; j<total.length;j++)
        {
            System.out.println(total[j]);   
        }
        System.out.println("");
        
        System.out.println("Abonos:");
        for(int j =0; j<total.length;j++)
        {
            System.out.printf("%d - %.2f \n", j+1, abono[j]);
        }        
    }
}
