package usuarios.principal;

import usuarios.modelos.Usuario;
import usuarios.reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String args[]) {
        final var listatotal = ExcelReader.obtenerListaUsuarios();
        //System.out.println(listatotal);
        final var listafiltrada = filtrarUsuarios(listatotal);

        System.out.printf("La lista de Usuarios es :%s", listafiltrada);

    }

    private static List<Usuario> filtrarUsuarios(List<Usuario> listaUsuarios) {
        final var listFiltrada = new ArrayList<Usuario>();

        for (var usuario : listaUsuarios) {
            if (usuario.getPeso() > 50 && usuario.getNombre().startsWith("R") && usuario.getApellido().endsWith("O")) {
                listFiltrada.add(usuario);
            }
        }
        return listFiltrada;

    }


}
