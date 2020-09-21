import java.util.Arrays;
import java.util.Scanner;

/*
 * 2.Agregar/eliminar caracteres y/o subcadenas en posiciones especificas
*/

public class StringEspecial {
	
	Scanner entrada = new Scanner(System.in);
	String cadena;
	
	public StringEspecial() {}


	public void camelCaseEspecial() {
		
		for(int i=0; i<cadena.length(); i++) {
			if((int)cadena.charAt(i)==241) {
				System.out.print(cadena.substring(i, i+1).toUpperCase());
			}else if((int)cadena.charAt(i)==209) {
				System.out.print(cadena.substring(i, i+1).toLowerCase());
			}else if((int)cadena.charAt(i)>90) {
				System.out.print(cadena.substring(i, i+1).toUpperCase());
			}else {
				System.out.print(cadena.substring(i, i+1).toLowerCase());
			}
		}
		System.out.println();
	}


	public void primerLetraMayuscula() {
		
		String cad[] = cadena.split(" ");
		
		System.out.println();
		for(int i=0; i<cad.length; i++) {
			System.out.print(cad[i].substring(0, 1).toUpperCase() + cad[i].substring(1, cad[i].length()) + " ");
		}
		System.out.println();
		
	}


    public void ingresarCadena() {
		
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;
		String cadena;
		
		do{
			System.out.println("Introduce cadena: ");
			cadena = entrada.nextLine();
			
			for(int i=0; i<cadena.length(); i++) {
				if(!((int)cadena.charAt(i)==241) && !((int)cadena.charAt(i)==209) && !((int)cadena.charAt(i)==32) && !((int)cadena.charAt(i)>=65 && (int)cadena.charAt(i)<=90) && !((int)cadena.charAt(i)>=97 && (int)cadena.charAt(i)<=122)) {
					System.out.println("No puedes ingresar caracteres invalidos, por favor prueba de nuevo");
					break;
				}else if(i==cadena.length()-1) {
					candado = false;
				}
			}
			
		}while(candado);
		
		this.cadena = cadena;
	}


    public String ingresarCadena2() {
		
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;
		String cadena;
		
		do{
			System.out.println("Introduce cadena: ");
			cadena = entrada.nextLine();
			
			for(int i=0; i<cadena.length(); i++) {
				if(!((int)cadena.charAt(i)==241) && !((int)cadena.charAt(i)==209) && !((int)cadena.charAt(i)==32) && !((int)cadena.charAt(i)>=65 && (int)cadena.charAt(i)<=90) && !((int)cadena.charAt(i)>=97 && (int)cadena.charAt(i)<=122)) {
					System.out.println("No puedes ingresar caracteres invalidos, por favor prueba de nuevo");
					break;
				}else if(i==cadena.length()-1) {
					candado = false;
				}
			}
			
		}while(candado);
		
		return cadena;
	}


    public void mostrarCadenaInvertida() {

		String palabras[];
		
		for(int i=0; i<=cadena.length()-1; i++) {
			System.out.print(cadena.substring(cadena.length()-1-i,cadena.length()-i));
		}
		
		palabras = cadena.split(" ");
		System.out.println();
		
		if(palabras.length!=1) {
			for(int i=palabras.length-1; i>=0; i--) {
				System.out.print(palabras[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
	}


	public String agregarElementoEntre() {
		
		int pos;
		String cadenaNueva = "";
		
		do {

		    System.out.println("\nIntroduce en que posicion se insertara el elemento: ");
		    pos = entrada.nextInt();

		    if(!(pos>-1 && pos<cadena.length())) {
			    System.out.println("Posicion fuera de rango, por favor prueba de nuevo\n");
		    }else {
		    	break;
		    }

		}while(true);

		cadenaNueva = ingresarCadena2();

		if(pos==0) {
			cadenaNueva = cadenaNueva + cadena;
		}else if(pos==cadena.length()) {
			cadenaNueva = cadena + cadenaNueva;
		}else {
			cadenaNueva = cadena.substring(0, pos-1) + cadenaNueva + cadena.substring(pos, cadena.length()-1);
		}

		return cadenaNueva;
	}
	
}
