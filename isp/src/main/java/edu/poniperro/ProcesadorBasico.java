package edu.poniperro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.interfaces.Basico;

public class ProcesadorBasico implements Basico {

    List<String> texto = new ArrayList<String>();

    @Override
    public void nueva(String palabra) {
        texto.add(palabra);
    }

    @Override
    public String texto() {
        return texto.stream().collect(Collectors.joining(" "));
    }

}
