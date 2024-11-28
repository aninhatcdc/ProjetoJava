import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseConnector {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/meubanco";
        String usuario = "root";
        String senha = "suaSenha";


        try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conexão bem-sucedida!");


            Statement stmt = conn.createStatement();


            String sql = "SELECT * FROM clientes";


            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

