package pokemones.Ejercicios;

import pokemones.modelos.Pokemon;
import pokemones.reader.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String args[]) {
        final var listPokemon = JsonReader.leerPokemonJson();
        final var listFiltrada = filtrarPokemon(listPokemon);
        System.out.printf("La lista es : %s", listFiltrada);
    }

    private static List<Pokemon> filtrarPokemon(List<Pokemon> listPokemon) {
        final var listFiltrada = new ArrayList<Pokemon>();
        for (var pokemon : listPokemon) {
            if (!pokemon.getEsMacho() && pokemon.getTipo().equals("AIRE")) {
                listFiltrada.add(pokemon);
            }
        }
        return listFiltrada;
    }
}
