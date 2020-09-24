import java.util.Arrays;
import java.util.Scanner;

public class StringEspecial {
	
	Scanner entrada = new Scanner(System.in);
	String cadena;
	
	public StringEspecial() {}

	public void eliminarSubCadena() {
		
		String rango;
		int inicio;
		int fin;

		if(cadena.equals("")) {
			System.out.println("La cadena esta vacia");
		}else if(cadena.length()==1) {
			cadena = "";
			System.out.println("Solo habia un elemento asi que se elimino ese");
		}else {
			
			do {
				System.out.println("Introduce rango, ejemplo(3-6): ");
				rango = entrada.nextLine();
				inicio = Integer.parseInt(rango.substring(0, rango.indexOf("-")));
				fin = Integer.parseInt(rango.substring(rango.indexOf("-")+1, rango.length()));
				
				if(inicio>=0 && fin<cadena.length() && rango.substring(rango.indexOf("-"), rango.indexOf("-")+1).equals("-") && inicio<=fin) {
					break;
				}else {
					System.out.println("Te haz equivocado en el llenado, por favor vuelve a intentarlo");
				}

			}while(true);

			if(inicio==0 && fin==cadena.length()-1) {
				cadena = "";
			}else {
				cadena = cadena.substring(0, inicio) + cadena.substring(fin+1, cadena.length());
			}
			System.out.println(cadena);
		}
	}

	public void eliminarCaracter() throws StringIndexOutOfBoundsException{
		
		int posicion;
		
		if(cadena.equals("")) {
			System.out.println("La cadena esta vacia");
		}else if(cadena.length()==1) {
			cadena = "";
			System.out.println("Solo habia un elemento asi que se elimino ese");
		}else {
			
			do {
				System.out.println("Introduce posicion");
				posicion = entrada.nextInt();
				
				if(posicion>=0 && posicion<cadena.length()) {
					break;
				}else {
					System.out.println("Posicion inexistente, por favor vuelve a intentarlo");
				}
			}while(true);
			cadena = cadena.substring(0, posicion) + cadena.substring(posicion+1, cadena.length());
			System.out.println(cadena);
		}
		
	}


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


	public void primerLetraMayuscula() throws StringIndexOutOfBoundsException{
		
		String cad[] = cadena.split(" ");
		
		System.out.println();
		for(int i=0; i<cad.length; i++) {
			System.out.print(cad[i].substring(0, 1).toUpperCase() + cad[i].substring(1, cad[i].length()).toLowerCase() + " ");
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


    public void mostrarCadenaInvertida() throws StringIndexOutOfBoundsException{

		String palabras[];
		
		if(cadena==""){
			System.out.println("La cadena esta vacia");
		}if(cadena.length()==1) {
			System.out.println("No habra diferencia, por favor prueba cuando tengas mas elementos");
		}else {
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
	}


	public void agregarElementoEntre() {
		
		int pos;
		String cadenaNueva = "";
		
		if(this.cadena.equals("")) {
			ingresarCadena();
		}else {
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
			    cadenaNueva = cadena.substring(0, pos) + cadenaNueva + cadena.substring(pos, cadena.length());
		    }
		
		    cadena = cadenaNueva;
		    System.out.println(cadena);
		}
	}


    public void limpieza() {
		entrada.nextLine();
	}
	
}
