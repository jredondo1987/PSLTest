package LCD;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.lang.System.out;
import java.util.Iterator;
import java.util.logging.Logger;

public class ImpresorLCD {

	//Puntos Fijos
	private final int[] pf1, pf2, pf3, pf4, pf5;
	private String[][] matrizImpr;
	
	static final String CARACTER_VERTICAL = "|";
	static final String CARACTER_HORIZONTAL = "-";
	static final String POSICION_X = "X";
	static final String POSICION_Y = "Y";
	
	private int size;
	
	//Calcula el numero de filasDig
	private int filasDig, columDig, totalFilas, totalColum;
	
	public ImpresorLCD(){
		//Inicializa variables
		this.pf1 = new int[2];
		this.pf2 = new int[2];
		this.pf3 = new int[2];
		this.pf4 = new int[2];
		this.pf5 = new int[2];
		
	}
	
	/**
	 * Metodo encargado de añadir una linea a la matriz de Impresion
	 * @param matriz Matriz Impresion
	 * @param punto Punto pivote
	 * @param posFija Posicion Fija
	 * @param size Tamaño Segmento
	 * @param caracter Caracter Segmento
	 * **/
	
	private void adicionarLinea(String[][] matriz, int[] punto, String posFija,
			int size, String caracter){
		
		if(posFija.equalsIgnoreCase(POSICION_X)){
			for(int y = 1; y <= size; y++){
				int valor = punto[1] + y;
				matriz[punto[0]][valor] = caracter;
			}
		}else{
			for(int i = 1; i <= size; i++){
				int valor = punto[0] + i;
				matriz[valor][punto[1]] = caracter;
			}
		}
	}
	
	/**
    * Metodo encargado de un segmento a la matriz de Impresion
    * @param segmento Segmento a adicionar
    */  
	
	
	private void adicionarSegmento(int segmento){
		
		Segmento segmento = new Segmento(segmento);
	}
	
	/**
    * Metodo encargado de definir los segmentos que componen un digito y
    * a partir de los segmentos adicionar la representacion del digito a la matriz
    * @param numero Digito
    */
	
	private void adicionarDigito(int numero){
		
		Digit digito = new Digit(numero);
		
		Iterator<Integer> iterator = digito.getSegment().iterator();
		
		while(iterator.hasNext()){
			adicionarSegmento(iterator.next());
		}
	}
	
	/**
    * Metodo encargado de imprimir un numero
    * @param size Tamaño Segmento Digitos
    * @param numeroImp Numero a Imprimir
    * @param espacio Espacio Entre digitos
    */
	
	private void imprimirNumero(int size, String numeroImp, int espacio){
		
		int pivotX = 0;
		char[] digitos;
		
		this.size = size;
		
		//Calcula el numero de filas de cada digito
		this.filasDig = (2 * this.size) + 3;
		
		//Calcula el numero de columnas de cada digito
		this.columDig = this.size + 2;
		
		//Calcula el total de filas de la matriz en la que se almacenaran los digitos
		this.totalFilas = this.filasDig;
		
		//Calcula el total de columnas de la matriz donde se almacenaran los digitos
		this.totalColum = (this.columDig * numeroImp.length()) + 
				(espacio * numeroImp.length());
		
		//Crea matriz para almacenar los numeros a imprimir
		this.matrizImpr = new String[this.totalFilas][this.totalColum];
		
		//crea el arreglo de digitos
		digitos = numeroImp.toCharArray();
		
		//Inicializa la matriz
		for(int i = 0 ; i < this.totalFilas; i++){
			for(int j = 0; i < this.totalColum; j++){
				this.matrizImpr[i][j] = " ";
			}
		}
		
		for(char digito:digitos){
			
			//Valida que el caracter sea un digito
			if(!isDigit(digito)){
				throw new IllegalArgumentException("Caracter" + digito
						+ "no es digito");
			}
			
			int numero = parseInt(valueOf(digito));
			
			//Calcula puntos fijos
			this.pf1[0] = 0;
			this.pf1[1] = 0 + pivotX;
			
			this.pf2[0] = (this.filasDig / 2);
			this.pf2[1] = 0 + pivotX;
			
			this.pf3[0] = (this.filasDig - 1);
			this.pf3[1] = 0 + pivotX;
			
			this.pf4[0] = (this.columDig - 1);
			this.pf4[1] = (this.filasDig / 2) + pivotX;
			
			this.pf5[0] = 0;
			this.pf5[1] = (this.columDig - 1) + pivotX;
			
			pivotX += this.columDig + espacio;
			
			adicionarDigito(numero);
		}
		
		//Adiciona Linea Separadora
		String[] lineaSeparadora = new String[totalColum];
		
		for(int i = 0; i < totalColum; i++){
			lineaSeparadora[i] = "-";
		}
		
		//Imprime Matriz
		for(int i = 0; i < this.totalFilas; i++){
			for(int j = 0; j < this.totalColum; j++){
				out.print(this.matrizImpr[i][j]);
			}
			System.out.println("");
		}
		for(int i = 0; i < totalColum; i++){
			System.out.print(lineaSeparadora[i]);
		}
		System.out.println("");
	}
	
	/**
    *
    * Metodo encargado de procesar la entrada que contiene el size del segmento
    * de los digitos y los digitos a imprimir
    * @param comando Entrada que contiene el size del segmento de los digito
    * y el numero a imprimir
    * @param espacioDig Espacio Entre digitos
    */
	
	
}
