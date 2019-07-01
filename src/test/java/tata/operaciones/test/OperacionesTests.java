package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.op.Operaciones;

public class OperacionesTests {
	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes=new Operaciones();
	}

	@Test
	public void cuando15mas20entonces35() {
		int resultado= this.opes.sumar(15, 20);
		assertEquals(35,resultado);
		
	}
	@Test
	public void cuandoA0entonces0() {
		int resultado= this.opes.sumar(0, 20);
		assertEquals(0,resultado);
		
	}
	@Test
	public void cuandob0entonces0() {
		int resultado= this.opes.sumar(10, 0);
		assertEquals(0,resultado);
		
	}
	@Test
	public void cuandobMaxentonces0() {
		int resultado= this.opes.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertEquals(-2,resultado);
		
	}

}
