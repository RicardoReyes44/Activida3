import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaStringEspecial {
	
	public static String ingresarCadena() {
		
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;
		String cadena;
		
		do{
			System.out.println("Introduce cadena: ");
			cadena = entrada.nextLine();

			for(int i=0; i<cadena.length(); i++) {
				if(!((int)cadena.charAt(i)>=65 && (int)cadena.charAt(i)<=90) && !((int)cadena.charAt(i)>=97 && (int)cadena.charAt(i)<=122)) {
					System.out.println("No puedes ingresar caracteres invalidos, por favor prueba de nuevo");
					break;
				}else if(i==cadena.length()-1) {
					candado = false;
				}
			}
			
		}while(candado);
		
		return cadena;
	}
	
	public static void main(String[] args) {
		
		StringEspecial se = new StringEspecial();
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;
		String cadena;
		
		do {
			
			System.out.print("1- Mostrar la cadena invertida por letra y por palabras\n" 
			+ "2- Agregar caracteres o subcadenas en posiciones especificas\n"
			+ "3- Eliminar caracteres o subcadenas en posiciones especificas\n"
			+ "4- Mostrar cadena en formato CaMeL CaSe especial\n"
			+ "5- Mostar la cadena con la primer letra de cada palabra en mayúscula\n"
			+ "6- Salir\n");
			
			try {
				System.out.println("Introduce opcion: ");
			    int opcion = entrada.nextInt();
			    
			    cadena = ingresarCadena();
			    
			    switch(opcion) {
			    	case 1:
			    		break;
			    	case 2:
			    		break;
			    	case 3:
			    		break;
			    	case 4:
			    		break;
			    	case 5:
			    		break;
			    	case 6:
			    		candado=false;
			    		break;
			    	default:
			    		System.out.println("No existe esa opcion, por favor prueba de nuevo\n");
			    		break;
			    }
	
			}catch(InputMismatchException error) {
				System.out.println("Entrada invalida <" + error + ">\n");
				entrada.nextLine();
			}	
			
		}while(candado);
		
		entrada.close();
		System.out.println("---------------------------");
		System.out.println("Programa terminado");
		System.out.println("---------------------------");

	}

}
