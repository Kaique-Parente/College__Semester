package application;

public class Program {
    public static void main(String[] args) {
        int fibonnaci[] = new int[13];
        
        fibonnaci[0] = 0;
        fibonnaci[1] = 1;
        
        for(int i=2; i<fibonnaci.length; i++) {
            fibonnaci[i] = fibonnaci[i-1] + fibonnaci[i-2];
        }
        
        for(int i=0; i<fibonnaci.length; i++) {
            System.out.println(fibonnaci[i]);
        }
    }
}
