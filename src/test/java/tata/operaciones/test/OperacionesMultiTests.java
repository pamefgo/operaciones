package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.op.Operaciones;

public class OperacionesMultiTests {
	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes=new Operaciones();
	}

	@Test
	public void cuando15por20entonces300() {
		int resultado= this.opes.multiplicar(15, 20);
		assertEquals(300,resultado);
		
	}

	@Test
	public void cuando15por0entonces1() {
		int resultado= this.opes.multiplicar(15, 0);
		assertEquals(1,resultado);
		
	}
	@Test
	public void cuandoMAXporMAXentonces300() {
		int resultado= this.opes.multiplicar(Integer.MAX_VALUE,Integer.MAX_VALUE);
		assertEquals(1,resultado);
		
	}

}
