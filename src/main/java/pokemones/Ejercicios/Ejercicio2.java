package pokemones.Ejercicios;

import pokemones.modelos.Pokemon;
import pokemones.reader.JsonReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String args[]) {
        final var listPokemon = JsonReader.leerPokemonJson();
        final var listFiltrada = filtrarPokemon(listPokemon);
        System.out.printf("La lista es : %s", listFiltrada);
    }

    private static List<Pokemon> filtrarPokemon(List<Pokemon> listPokemon) {
        final var listFiltrada = new ArrayList<Pokemon>();
        for (var pokemon : listPokemon) {
            if (pokemon.getTipo().equals("ELECTRICIDAD")) {
                listFiltrada.add(pokemon);
            }
        }
        Collections.sort(listFiltrada, new Comparator<Pokemon>() {
            @Override
            public int compare(Pokemon o1, Pokemon o2) {
                return Double.compare(o2.getNivel(), o1.getNivel());
            }
        });
        return listFiltrada;
    }
}
