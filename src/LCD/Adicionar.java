package LCD;


public class Adicionar {
	
	static final String CARACTER_VERTICAL = "|";
    static final String CARACTER_HORIZONTAL = "-";
    static final String POSICION_X = "X";
    static final String POSICION_Y = "Y";
    
    
    /**
     * Metodo encargado de añadir una linea a la matriz de Impresion
     *
     * @param matriz Matriz Impresion
     * @param punto Punto Pivote
     * @param posFija Posicion Fija
     * @param size Tamaño Segmento
     * @param caracter Caracter Segmento
     */
    
    public void adicionarLineas(String[][] matriz, int[] punto, String posFija,
			int size, String caracter){
		
		if(posFija.equalsIgnoreCase(POSICION_X)){
			for(int y=1; y <= size; y++){
				int valor = punto[1] + y;
				matriz[punto[0]][valor] = caracter; 
			}
		}else{
			for(int i=1; i <= size; i++){
				int valor = punto[0] + i;
				matriz[valor][punto[1]] = caracter; 
			}
		}
		
	}
    
    /**
    *
    * Metodo encargado de aderir un segmento a la matriz de Impresion
    *
    * @param segmento Segmento a adicionar
    * @param pf1, pf2, pf3, pf4, pf5 puntos fijos
    * @param size tamaño del segmento del digito
    * @param matrizImpr Matriz impresion
    */
   
	
	public void adicionarSegmentos(int segmento, int[] pf1, int[] pf2,
			int[] pf3, int[] pf4, int[] pf5, int size, String[][] matrizImpr){
		switch (segmento) {
        case 1:
            adicionarLineas(matrizImpr, pf1, POSICION_Y, size, CARACTER_VERTICAL);
            break;
        case 2:
            adicionarLineas(matrizImpr, pf2, POSICION_Y, size, CARACTER_VERTICAL);
            break;
        case 3:
            adicionarLineas(matrizImpr, pf5, POSICION_Y, size, CARACTER_VERTICAL);
            break;
        case 4:
            adicionarLineas(matrizImpr, pf4, POSICION_Y, size, CARACTER_VERTICAL);
            break;
        case 5:
            adicionarLineas(matrizImpr, pf1, POSICION_X, size, CARACTER_HORIZONTAL);
            break;
        case 6:
            adicionarLineas(matrizImpr, pf2, POSICION_X, size, CARACTER_HORIZONTAL);
            break;
        case 7:
            adicionarLineas(matrizImpr, pf3, POSICION_X, size, CARACTER_HORIZONTAL);
            break;
        default:
            break;
		}
	}
}



