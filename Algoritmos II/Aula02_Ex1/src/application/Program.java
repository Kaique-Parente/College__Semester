package application;

public class Program {
    public static void main(String[] args) {
        String nomes[] = {"Lucas", "Pedro", "Matheus", "Olivia", "Raimundo", "Carlos", "Vinicius", "Renan", "Marcelo", "Katia"};
        double vendas[] = new double[nomes.length];
        double percent[] = new double[nomes.length];
        double total[] = new double[nomes.length];
        double sum = 0;
        
        double maior = 0, menor = 0;
        int posMaior = 0, posMenor = 0;
        
        
        for(int i=0; i < nomes.length; i++) {
            vendas[i] = (Math.random() * 15000);
            percent[i] = (Math.random() * 5) + 1;
            total[i] = vendas[i] * percent[i] / 100;
            
            sum += total[i];
        }

        //Relatório
        for(int i=0; i < nomes.length; i++) 
            System.out.println("Vendedor(a) " + nomes[i] + " deve receber um total de: " + total[i]);
        
        System.out.println("\nTotal de vendas de todos os vendedores: " + sum);

        for(int i=0; i < nomes.length; i++) {
            if(i ==0) {
                maior = total[0];
                menor = total[0];
                posMaior = 0;
                posMenor = 0;
            }
            
            if(total[i] > maior) {
                maior = total[i];
                posMaior = i;
            } else if (total[i] < menor) {
                menor = total[i];
                posMenor = i;
            }
        }
        
        System.out.println("O maior valor e de: " + maior + " do(a) vendedor(a) " + nomes[posMaior]);
        System.out.println("O menor valor e de: " + menor + " do(a) vendedor(a) " + nomes[posMenor]);
    }
}
