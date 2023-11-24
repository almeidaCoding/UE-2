import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestionAlmacen {
    public static void main(String[] args) {

        //Conexión con la BD
        Connection connection = GestionDB.getConnection();

        //Insertar productos del JSON en la tabla 'productos'
        InsertTableProducts.getJsonFromProducts();
        InsertTableProducts.insertProductsDatabase(InsertTableProducts.name,
                InsertTableProducts.category,
                InsertTableProducts.description,
                InsertTableProducts.stock,
                InsertTableProducts.price);

        //Insertar empleados del JSON en la tabla 'empleados'
        InsertTableEmployees.getJsonFromEmployees();
        InsertTableEmployees.insertEmployeesDataBase(InsertTableEmployees.nombre,
                InsertTableEmployees.apellido1,
                InsertTableEmployees.apellido2,
                InsertTableEmployees.correo);
    }
}