package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String args[]) {
        final var listaUsuario = ExcelReader.obtenerListaUsuarios();
        final var listaFiltrada = correoGmail(listaUsuario);
        System.out.printf("La lista de Usuarios es :%s", listaFiltrada);
    }

    private static List<Usuario> correoGmail(List<Usuario> listUsuario) {
        final var listGmail = new ArrayList<Usuario>();

        for (var usuario : listUsuario) {
            if (usuario.getCorreo().endsWith("GMAIL.COM")) {
                listGmail.add(usuario);
            }
        }


        return listGmail;
    }
}
