package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {
    public static void main(String args[]) {
        final var listUsuario = ExcelReader.obtenerListaUsuarios();
        final var listOrdenada = ordenarUsuario(listUsuario);

        System.out.printf("La lista de usuarios ordenada es : %s", listOrdenada);


    }

    private static List<Usuario> ordenarUsuario(List<Usuario> listUsuario) {

        Collections.sort(listUsuario, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o2.getApellido().compareTo(o1.getApellido());
            }
        });

        return listUsuario;
    }
}
