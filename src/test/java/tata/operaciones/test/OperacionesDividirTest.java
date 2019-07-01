package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.op.Operaciones;

public class OperacionesDividirTest {

	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes=new Operaciones();
	}

	@Test
	public void cuando15dividido20entonces0_75() {
		double resultado= this.opes.dividir(15, 20);
		assertTrue("ES "+resultado+" pero deberia ser 0.75",resultado==0.75);
		
		
	}

}
