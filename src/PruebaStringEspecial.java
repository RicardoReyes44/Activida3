import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaStringEspecial {
	
	public static void main(String[] args) {
		
		StringEspecial se = new StringEspecial();
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;
		
		se.ingresarCadena();
		
		do {
			
			System.out.print("\n1- Mostrar la cadena invertida por letra y por palabras\n" 
			+ "2- Agregar caracteres o subcadenas en posiciones especificas\n"
			+ "3- Eliminar caracteres o subcadenas en posiciones especificas\n"
			+ "4- Mostrar cadena en formato CaMeL CaSe especial\n"
			+ "5- Mostrar la cadena con la primer letra de cada palabra en mayúscula\n"
			+ "6- Salir\n");
			
			try {

				System.out.println("Introduce opcion: ");
			    int opcion = entrada.nextInt();
			    
			    switch(opcion) {
			    	case 1:
			    		break;
			    	case 2:
			    		break;
			    	case 3:
			    		break;
			    	case 4:
			    		se.camelCaseEspecial();
			    		break;
			    	case 5:
			    		break;
			    	case 6:
			    		candado = false;
			    		break;
			    	default:
			    		System.out.println("No existe esa opcion, por favor prueba de nuevo\n");
			    		break;
			    }
	
			}catch(InputMismatchException error) {
				System.out.println("Entrada invalida <" + error + ">\n");
				entrada.nextLine();
			}catch(StringIndexOutOfBoundsException error) {
				System.out.println("\nLa entrada no es adecuada <" + error + ">\nno ingreses espacios sin sentido\n");
				entrada.nextLine();	
			}
			
		}while(candado);
		
		entrada.close();
		System.out.println("---------------------------");
		System.out.println("Programa terminado");
		System.out.println("---------------------------");

	}

}
