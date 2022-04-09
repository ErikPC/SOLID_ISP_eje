package edu.poniperro;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.poniperro.interfaces.Corregible;
import edu.poniperro.interfaces.Generable;

public class TestProcesadorTexto {

	@Test
	public void test_simple() {

		Generable procesador = new ProcesadorTexto();

		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");

		assertEquals("No himporta la hortografia", procesador.texto());
	}

	@Test
	public void test_con_idioma() {

		Generable generable = new ProcesadorTexto();

		generable.nueva("Tengo");
		generable.nueva("hambre");

		assertEquals("Tengo hambre", generable.texto());

		Corregible procesador = new ProcesadorTexto();

		assertTrue(procesador.correcto(Idioma.ES));
	}
}
