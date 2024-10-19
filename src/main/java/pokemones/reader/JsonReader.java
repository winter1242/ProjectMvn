package pokemones.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import pokemones.modelos.Pokemon;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    private final static String pokemonPath = "src/main/resources/json/pokemones.json";

    public static List<Pokemon> leerPokemonJson() {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    new File(pokemonPath),
                    TypeFactory.defaultInstance()
                            .constructCollectionType(List.class, Pokemon.class)
            );
        } catch (IOException ioException) {
            System.out.println("Error : " + ioException.getLocalizedMessage());
            throw new RuntimeException();
        }
    }
}
