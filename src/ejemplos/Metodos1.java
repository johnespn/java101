package ejemplos;

public class Metodos1 {

	public static void main(String[] args) {
		ejecutarEjemplo1();		
		ejecutarEjemplo2();
	}

	private static void ejecutarEjemplo1() {
		// ejemplo de metodo que suma dos numeros:
		int resultadoSuma = sumar(3,5);
		System.out.println("el resultado de llamar al metodo suma es:" + resultadoSuma);
	}
	private static int sumar(int i, int j) {
		return i + j;
	}

	private static void ejecutarEjemplo2() {
		int resultadoNotaFinal = notaFinal(5,2,3,4);
		System.out.println("el promeies:" + resultadoNotaFinal);
	}
	private static int notaFinal(int i, int j, int k, int l) {
		int notapromedio = (i + j + k + l) / 4;
		return notapromedio ;
	}
}
