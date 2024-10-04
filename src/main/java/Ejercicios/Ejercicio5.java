package Ejercicios;

import modelos.Pokemon;
import reader.JsonReader;

import java.util.List;

public class Ejercicio5 {
    public static void main(String args[]) {
        final var listPokemon = JsonReader.leerPokemonJson();
        final var id1 = "PKM-10";
        final var id2 = "PKM-6";
        System.out.printf("La suma es : %.2f", sumaPokemon(listPokemon, id1, id2));

    }

    private static Double sumaPokemon(List<Pokemon> listPokemon, String id1, String id2) {
        var suma = 0.0;
        for (var pokemon : listPokemon) {
            if (pokemon.getId().equals(id1) || pokemon.getId().equals(id2)) {
                suma += pokemon.getDefensa();
            }
        }

        return suma;
    }
}
