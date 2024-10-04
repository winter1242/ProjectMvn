package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("usuarios")
public class Usuario {
    @ExcelCellName("ID")
    private String id;
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("APELLIDO")
    private String apellido;
    @ExcelCellName("EDAD")
    private int edad;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("CORREO")
    private String correo;
    @ExcelCellName("USERNAME")
    private String username;
    @ExcelCellName("PASSWORD")
    private String password;
    @ExcelCellName("PAIS")
    private String pais;
    @ExcelCellName("UNIVERSIDAD")
    private String universidad;

    public double getPeso() {
        return peso;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    ID: %s
                    NOMBRE: %s
                    APELLIDO: %s
                    EDAD: %d
                    PESO: %.2f
                    CORREO: %s
                    USERNAME: %s
                    PASSWORD: %s
                    PAIS: %s
                    UNIVERSIDAD: %s
                }
                """;
        return String.format(multilinea, id, nombre, apellido, edad, peso, correo, username, password, pais, universidad);

    }
}
