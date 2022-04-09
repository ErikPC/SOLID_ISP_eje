package edu.poniperro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.interfaces.Complejo;
import edu.poniperro.interfaces.Basico;

public class ProcesadorTexto implements Complejo, Basico {

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
