
package application;

public class Program {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        String[] descricao = {"palha","madeira", "tijolo", "fio ", "tinta", "prego", "tubo", "cano"};
        double[] prec = {10.5, 45.9, 300.1, 423.33, 190.65, 0.35, 14.56, 90.0}; 
        int[] quantidade = new int[8];
        
        int valor = 0;
        int codigo = 0;
        int contVazia = 0;
        String linha = "";
        
        // 1) Gerar e Mostrar
        
        //Carregar Matriz e Imprimir a Matriz
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 899);
                
                 if(matriz[i][j] < 100) {
                     contVazia++;
                }
                 
                linha += "\t" + matriz[i][j];
            }
            System.out.println(linha);
            linha="";
        }
        
        System.out.println("Total de gavetas vazias: " + contVazia);
        
        
        //
         for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[0].length; j++) {
                
                if(matriz[i][j] >= 100) {
                    codigo = matriz[i][j] / 100;
                    valor = matriz[i][j] % 100;
                    quantidade[codigo-1] += valor;
                }
            }
            
        }
         
         System.out.println("Cod\tDescricao\tpreco");
         
         for(int i=0; i < descricao.length; i++) {
            
             System.out.println((i + 1) + "\t" + descricao[i] + "\t" + quantidade[i] + "\t" + (quantidade[i] * prec[i]));
            
        }
        
      
        /*Carregar Quantidade
         for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[0].length; j++) {
                quantidade[(matriz[i][j]/100) - 1] = matriz[i][j] % 100;
            }
         }
         
         for(int i=0; i < descricao.length; i++) {
           
             System.out.println(quantidade[i]);
        }
        
        
        System.out.println("Cod\tDescricao\t\tPreco");
        */
    }
}
