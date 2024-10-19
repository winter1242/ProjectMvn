package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.List;

public class Ejercicio4 {
    public static void main(String args[]) {
        final var listUsuario = ExcelReader.obtenerListaUsuarios();
        final var listOrdenada = ordenarUsuario(listUsuario);

        System.out.printf("La lista de usuarios ordenada es : %s", listOrdenada);
    }

    public static List<Usuario> ordenarUsuario(List<Usuario> listUsuario) {
        var n = listUsuario.size();
        Usuario tempo;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listUsuario.get(j).getApellido().compareTo(listUsuario.get(j + 1).getApellido()) < 0) {
                    tempo = listUsuario.get(j);
                    listUsuario.set(j, listUsuario.get(j + 1));
                    listUsuario.set(j + 1, tempo);
                }
            }
        }
        return listUsuario;
    }
}
