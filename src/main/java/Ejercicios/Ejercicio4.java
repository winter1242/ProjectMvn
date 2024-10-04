package Ejercicios;

import modelos.Pokemon;
import reader.JsonReader;

import java.util.List;

public class Ejercicio4 {
    public static void main(String args[]) {
        final var listPokemon = JsonReader.leerPokemonJson();
        aumentoNivel(listPokemon);
        System.out.printf("La lista es :%s", listPokemon);

    }

    private static void aumentoNivel(List<Pokemon> listPokemon) {

        for (int i = 0; i < listPokemon.size(); i++) {
            listPokemon.get(i).setHp(listPokemon.get(i).getHp() + 500);
        }

    }
}
