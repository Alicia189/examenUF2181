
package libs;
/**
 * 
 * @author Alicia Mohedo Gatón
 *
 */

public class Funciones {
	/**
	 * función en la que dados tres números nos devuelve el número central
	 * @param num1 int primer número
	 * @param num2 int segundo número
	 * @param num3 int tercer número
	 * @return int número colocado en medio
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
	 * Dado un año te dice si es bisiesto
	 * @param año int el año a consultar
	 * @return bisiesto Boolean año bisiesto
	 * 
	 */
	public boolean esBisiesto(int año) {
		boolean bisiesto = false;
		if (año %4 == 0 ) {
			if (año%100==0 && año%400!=0) {
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
	 * se pasa un vector por la función y devuelve si el vector es capícua
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
	 * @throws ArithmeticException No se pueden pasar vectores de distinto tamaño
	 */
	public  int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
