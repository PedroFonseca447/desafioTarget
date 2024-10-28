package desafioTarget.exercicio;

public class ExercicioString {
	
	
	 public static void main (String args []){
	        String entrada = "AlfAbetar";
	        int count = 0;
	        String apoio =entrada.toLowerCase();
	        
	        for(char c : apoio.toCharArray()) {
	        	if( c == 'a' ) {
	        		count ++;
	        	}
	        }
	        
	        System.out.println(count);
	        
	    }
}
