package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.List;

public class Ejercicio5 {
    public static void main(String args[]) {
        final var listUsuario = ExcelReader.obtenerListaUsuarios();
        final var ID1 = "USR-124";
        final var ID2 = "USR-88";
        System.out.printf("La suma es : %s", sumaEdades(listUsuario, ID1, ID2));
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
