package desafioTarget.fibonacci;


public class Fibonacci {

   private static int[] vetAux = new int[50]; 


   public static void calculaSequenciaFibonacci(int n) {
       vetAux[0] = 0;
       if (n > 0) {
           vetAux[1] = 1; 
           for (int i = 2; i <= n; i++) {
               vetAux[i] = vetAux[i - 1] + vetAux[i - 2];
               
           }
       }
   }

 
   private static boolean pertenceAoFibonacci(int j) {
       for (int i = 0; i < vetAux.length; i++) {
           if (vetAux[i] == j) {
               return true;
           }
       }
       return false;
   }

   public static void main(String[] args) {
       int numeroEntrada = 13; 
       calculaSequenciaFibonacci(30);    
       if (pertenceAoFibonacci(numeroEntrada)) {
           System.out.println("O número " + numeroEntrada + " pertence à sequência de Fibonacci.");
       } else {
           System.out.println("O número " + numeroEntrada + " não pertence à sequência de Fibonacci.");
       }
   }
}