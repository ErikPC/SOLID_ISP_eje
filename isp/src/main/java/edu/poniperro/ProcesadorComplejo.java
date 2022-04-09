package edu.poniperro;

import edu.poniperro.interfaces.Complejo;

public class ProcesadorComplejo extends ProcesadorBasico implements Complejo {

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
