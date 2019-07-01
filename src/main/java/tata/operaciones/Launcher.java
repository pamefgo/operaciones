package tata.operaciones;

import tata.operaciones.op.Operaciones;

public class Launcher {
	
	public static void main(String[] args) {
		Operaciones opes=new Operaciones();
		System.out.println("La suma es: "+opes.sumar(15, 20));
		System.out.println("La resta es: "+opes.restar(15, 20));
		System.out.println("La multiplicacion es: "+opes.multiplicar(15, 20));
		System.out.println("La division es: "+opes.dividir(15, 20));
		System.out.println("La suma es: "+opes.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println("La suma es: "+opes.multiplicar(Integer.MAX_VALUE, Integer.MAX_VALUE));

	}


}
