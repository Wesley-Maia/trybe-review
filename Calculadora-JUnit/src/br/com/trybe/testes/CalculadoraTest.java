package br.com.trybe.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.trybe.Calculadora;

@DisplayName("Eu sou a classe de teste da calculadora")
class CalculadoraTest {

	@Test
	@DisplayName("testando o método somar...")
	void testSomar() {
		Calculadora cal = new Calculadora();
		assertEquals(34, cal.somar(32, 2));
	}

	@Test
	@DisplayName("testando o método subtrair...")
	void testSubtrair() {
		Calculadora cal = new Calculadora();
		assertEquals(1, cal.subtrair(3, 2));
	}
	
	@Test
    @DisplayName("testando o método dividir...")
	public void testeDividir() {
		Calculadora cal = new Calculadora();
		assertEquals(3, cal.dividir(6, 2));
	}
	
	@Test
    @DisplayName("testando o método dividir por zero...")
	public void testeDividirZero() {
		Calculadora cal = new Calculadora();
		assertEquals(0, cal.dividir(6, 0));
	}
	
	@Test
    @DisplayName("testando o método verificar dividendo...")
    public void testeVerificarDividendo() {
    	Calculadora cal = new Calculadora();
    	assertTrue(cal.verificarDividendo(5));
    }

}
