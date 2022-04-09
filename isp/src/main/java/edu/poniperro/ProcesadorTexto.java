package edu.poniperro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.interfaces.Corregible;
import edu.poniperro.interfaces.Generable;

public class ProcesadorTexto implements Corregible, Generable {

	private List<String> texto = new ArrayList<>();

	@Override
	public void nueva(String palabra) {
		texto.add(palabra);
	}

	@Override
	public String texto() {
		return texto.stream().collect(Collectors.joining(" "));
	}

	@Override
	public boolean correcto(Idioma idioma) {
		for (String palabra : texto) {
			if (!idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
