package usuarios.reader;

import com.poiji.bind.Poiji;
import usuarios.modelos.Usuario;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/excel/data.xlsx";

    public static List<Usuario> obtenerListaUsuarios() {
        return Poiji.fromExcel(new File(excelPath), Usuario.class);
    }
}
