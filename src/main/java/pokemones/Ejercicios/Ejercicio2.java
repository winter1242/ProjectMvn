package pokemones.Ejercicios;

import pokemones.modelos.Pokemon;
import pokemones.reader.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String args[]) {
        final var listPokemon = JsonReader.leerPokemonJson();
        final var listFiltrada = filtrarPokemon(listPokemon);
        final var listOrdenada = ordenarPokemon(listFiltrada);
        System.out.printf("La lista es : %s", listOrdenada);
    }

    private static List<Pokemon> filtrarPokemon(List<Pokemon> listPokemon) {
        final var listFiltrada = new ArrayList<Pokemon>();
        for (var pokemon : listPokemon) {
            if (pokemon.getTipo().equals("ELECTRICIDAD")) {
                listFiltrada.add(pokemon);
            }
        }
        return listFiltrada;
    }

    private static List<Pokemon> ordenarPokemon(List<Pokemon> listPokemon) {
        var n = listPokemon.size();
        Pokemon tempo;

        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (listPokemon.get(j).getNivel() < listPokemon.get(j + 1).getNivel()) {
                    tempo = listPokemon.get(j);
                    listPokemon.set(j, listPokemon.get(j + 1));
                    listPokemon.set(j + 1, tempo);
                }
            }
        }
        return listPokemon;
    }
}
