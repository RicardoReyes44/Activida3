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
			
			System.out.println("\n---------------------------");
			System.out.println("Menu principal");
			System.out.println("---------------------------");
			System.out.print("\n1- Mostrar la cadena invertida por letra y por palabras\n" 
			+ "2- Agregar caracteres o subcadenas en posiciones especificas\n"
			+ "3- Eliminar caracter en posicion especifica\n"
			+ "4- Eliminar subcadenas en posiciones especificas\n"
			+ "5- Mostrar cadena en formato CaMeL CaSe especial\n"
			+ "6- Mostrar la cadena con la primer letra de cada palabra en mayúscula\n"
			+ "7- Salir\n");
			
			try {

				System.out.println("Introduce opcion: ");
			    int opcion = entrada.nextInt();
			    
			    switch(opcion) {
			    	case 1:
			    		se.mostrarCadenaInvertida();
			    		break;
			    	case 2:
			    		se.agregarElementoEntre();
			    		break;
			    	case 3:
			    		se.eliminarCaracter();
			    		break;
			    	case 4:
			    		se.eliminarSubCadena();
			    		break;
			    	case 5:
			    		se.camelCaseEspecial();
			    		break;
			    	case 6:
			    		se.primerLetraMayuscula();
			    		break;
			    	case 7:
			    		candado = false;
			    		break;
			    	default:
			    		System.out.println("No existe esa opcion, por favor prueba de nuevo\n");
			    		break;
			    }
	
			}catch(InputMismatchException error) {
				System.out.println("\nEntrada invalida <" + error + ">\nDevolviendo al menu principal...");
				entrada.nextLine();
				se.limpieza();
			}catch(StringIndexOutOfBoundsException error) {
				System.out.println("\nLa entrada no es adecuada <" + error + ">\nDevolviendo al menu principal...");
				entrada.nextLine();
				se.limpieza();
			}catch(NumberFormatException error) {
				System.out.println("\nFormato incorrecto de ingreso de datos <" + error + ">\nDevolviendo al menu principal...");
				entrada.nextLine();
				se.limpieza();
			}
			
		}while(candado);
		
		entrada.close();
		System.out.println("---------------------------");
		System.out.println("Programa terminado");
		System.out.println("---------------------------");

	}

}
