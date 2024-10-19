package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String args[]) {
        final var listUsuario = ExcelReader.obtenerListaUsuarios();
        final var ID1 = "USR-124";
        final var ID2 = "USR-88";
        System.out.printf("La suma es : %s", sumaEdades(listUsuario, ID1, ID2));
    }

    private static String sumaEdades(List<Usuario> listUsuario, String ID1, String ID2) {
        var suma = 0;
        Map<String, Integer> usuariosMap = new HashMap<>();
        for (var usuario : listUsuario) {
            usuariosMap.put(usuario.getId(), usuario.getEdad());
        }
        suma = usuariosMap.get(ID1) + usuariosMap.get(ID2);
        return suma + "";
    }
}
