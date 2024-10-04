package principal;

import modelos.Usuario;
import reader.ExcelReader;

import java.util.List;

public class Ejercicio5 {
    public static void main(String args[]) {
        final var listUsuario = ExcelReader.obtenerListaUsuarios();
        final var ID1 = "USR-124";
        final var ID2 = "USR-88";
        System.out.print("La suma de " + ID1 + " y " + ID2 + " : " + sumaEdades(listUsuario, ID1, ID2));

    }

    private static String sumaEdades(List<Usuario> listUsuario, String ID1, String ID2) {
        var suma = 0;
        for (var usuario : listUsuario) {
            if (usuario.getId().equals(ID1) || usuario.getId().equals(ID2)) {
                suma += usuario.getEdad();
            }
        }
        return suma + "";
    }
}
