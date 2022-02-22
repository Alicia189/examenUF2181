
package libs;
/**
 * 
 * @author Alicia Mohedo Gat�n
 *
 */

public class Funciones {
	/**
	 * funci�n en la que dados tres n�meros nos devuelve el n�mero central
	 * @param num1 int primer n�mero
	 * @param num2 int segundo n�mero
	 * @param num3 int tercer n�mero
	 * @return int n�mero colocado en medio
	 */
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * Dado un a�o te dice si es bisiesto
	 * @param a�o int el a�o a consultar
	 * @return bisiesto Boolean a�o bisiesto
	 * 
	 */
	public boolean esBisiesto(int a�o) {
		boolean bisiesto = false;
		if (a�o %4 == 0 ) {
			if (a�o%100==0 && a�o%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto= false;
		}
		return bisiesto;
	}
	/**
	 * se pasa un vector por la funci�n y devuelve si el vector es cap�cua
	 * 
	 * @param v int [], el vector que se pasa
	 * @return capicua boolean es capicua
	 */
	public  boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
	/**
	 * Sumamos dos vectores 
	 * 
	 * @param v int[] primer vector
	 * @param v2 int[] segundo vector
	 * @return int suma de vectores
	 * @throws ArithmeticException No se pueden pasar vectores de distinto tama�o
	 */
	public  int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
