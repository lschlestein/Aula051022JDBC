package bd.executeUpdate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		String db_url = "jdbc:mysql://localhost:3306/reuniao";
		String db_query = "INSERT INTO pessoa (nome, email, cargo) values ('Adriano Rodrigues', 'adriano@yahoo.com', 'Aluno')";
		String db_user = "root";
		String db_password = "";
		
		try {Connection c = DriverManager.getConnection(db_url, db_user, db_password);
				Statement statement = c.createStatement();
				System.out.println("Conectado ao MySql");
				int linhas = statement.executeUpdate(db_query); 
				System.out.println("A operacao afetou: "+linhas+" linhas.");
			

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

	}

}
