package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemom {
    @JsonProperty("id")
    private String id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("iniveld")
    private int nivel;
    @JsonProperty("hp")
    private int hp;
    @JsonProperty("ataque")
    private double ataque;
    @JsonProperty("defensa")
    private double defensa;
    @JsonProperty("ataqueEspecial")
    private double ataqueEspecial;
    @JsonProperty("defensaEspecial")
    private double defensaEspecial;
    @JsonProperty("velocidad")
    private double velocidad;
    @JsonProperty("esMacho")
    private Boolean esMacho;
    @JsonProperty("entrenador")
    private String entrenador;
    @JsonProperty("ubicacion")
    private String ubicacion;
    @JsonProperty("tipo")
    private String tipo;

    @Override
    public String toString() {

        return "";
    }
}
