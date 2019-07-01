package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.op.Operaciones;

public class OperacionesRestarTests {
	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes=new Operaciones();
	}
	@Test
	public void cuandoRestar15y20entoces0() {
		int resultado= this.opes.restar(15, 20);
		assertEquals(0,resultado);
	}
	@Test
	public void cuandoRestarMAXyMAXentoces0() {
		int resultado= this.opes.restar(Integer.MAX_VALUE,Integer.MAX_VALUE);
		assertEquals(0,resultado);
	}

}
