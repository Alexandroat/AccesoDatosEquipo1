package ut01.act04;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio04Test {
	
	String prueba ="/Users/fj/git/AccesoDatosUEM/AccesoDatos/resources/prueba03.txt";
	@Test
	public void test() {
		Ejercicio04 ej = new Ejercicio04();
		int letras = 8;
		assertEquals("Prueba contar",letras, ej.countLowercase(prueba));
	}
	
}
