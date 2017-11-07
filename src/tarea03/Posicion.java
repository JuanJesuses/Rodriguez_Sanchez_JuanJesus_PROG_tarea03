package tarea03;

public class Posicion {
	
	private int fila;
	private char columna;
	
	public Posicion (int fila, char columna) {
		
		if((fila >= 1 && fila <= 10) && (columna >= 97 && columna <= 104)) {
			
			this.fila = fila;
			this.columna = columna;
			
		}else {
			
			System.out.printf("Error, ha introducido valores no válidos o fuera del rango");
			System.out.printf("Se establecerá el valor \"1\" para la fila y el valor \"a\" para la columna.");
			this.fila = 1;
			this.columna = 'a';
			
		}
		
	}

}
