package Ejercicios;

import modelos.Pokemon;
import reader.JsonReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio3 {
    public static void main(String args[]) {
        final var listPokemon = JsonReader.leerPokemonJson();
        final var listOrdenada = ordenarPokemon(listPokemon);

        System.out.printf("La lista ordenada es : %s", listOrdenada);
    }

    private static List<Pokemon> ordenarPokemon(List<Pokemon> listPokemon) {
        final var listOrdenada = new ArrayList<Pokemon>();
        for (var pokemon : listPokemon) {
            if (pokemon.getUbicacion().equals("CERULEAN CITY")) {
                listOrdenada.add(pokemon);
            }
        }
        Collections.sort(listOrdenada, new Comparator<Pokemon>() {
            @Override
            public int compare(Pokemon o1, Pokemon o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        return listOrdenada;
    }
}
