import java.util.Arrays;
import java.util.Scanner;

public class StringEspecial {
	
	Scanner entrada = new Scanner(System.in);
	String cadena;
	
	public StringEspecial() {}


	public void eliminarElementoEntre() throws StringIndexOutOfBoundsException{
		
		byte opcion = 0;
	    int pos = 0;
	    int cont = 0;
		
	    for(int i=0; i<cadena.length(); i++) {
	        if(cadena.substring(i, i+1).equals(" ")) {
		        cont++;
	        }
        }
	    
		if(cadena.length()==0) {
			System.out.println("La cadena esta vacia");
		}
		else {
		
		    do {
		    	
		        if(cadena.length()==1) {
		    		cadena = "";
		    		System.out.println("Solo existia 1 elemento asi que solo ese se elimino");
		    		break;
		    	}else {
			        System.out.println("\nIntroduce opcion: ");
	                System.out.println("1.- Eliminar caracter");
		            System.out.println("2.- Eliminar subcadena");
			        opcion = entrada.nextByte();
			
			        if(opcion==1 || opcion==2) {
				        break;
			        }else {
				        System.out.println("Opcion invalida, prueba de nuevo");
			        }
		    	}
		    }while(true);
		    
		    if(!cadena.equals("")) {
		        if(opcion==1) {
		        	do {
			            System.out.println("\nIntroduce en que posicion se eliminara el elemento: ");
			            pos = entrada.nextInt();

			            if(!(pos>-1 && pos<cadena.length())) {
				            System.out.println("Posicion fuera de rango, por favor prueba de nuevo\n");
			            }else {
			    	        break;
			            }
			        }while(true);
			        cadena = cadena.substring(0, pos) + cadena.substring(pos+1, cadena.length());
		        }else {

			        if(cont==0) {
				        cadena = "";
			        }else {
			    	    String palabras[] = cadena.split(" ");
			    	    cadena = "";
			    	    
			    	    do {
				            System.out.println("\nIntroduce en que posicion se eliminara el elemento: ");
				            pos = entrada.nextInt();

				            if(!(pos>-1 && pos<palabras.length)) {
					            System.out.println("Posicion fuera de rango, por favor prueba de nuevo\n");
				            }else {
				    	        break;
				            }
				        }while(true);

			    	    for(int i=0; i<palabras.length; i++) {
			    		    if(i == pos) {
			    			    continue;
			    		    }
			    		    cadena += palabras[i] + " ";
			    	    }
			        }
		        }
		    }
		}
		System.out.println(cadena);
		
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
