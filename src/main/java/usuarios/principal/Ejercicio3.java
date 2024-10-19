package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String args[]) {
        final var listUsuario = ExcelReader.obtenerListaUsuarios();
        final var listFiltrada = listChina(listUsuario);

        System.out.printf("La lista de Usuario es : %s", listFiltrada);
    }

    public static List<Usuario> listChina(List<Usuario> listUsuario) {
        final var listFiltrada = new ArrayList<Usuario>();

        for (var usuario : listUsuario) {
            if (usuario.getPais().equals("CHINA")) {
                listFiltrada.add(usuario);
            }
        }
        return listFiltrada;
    }
}
