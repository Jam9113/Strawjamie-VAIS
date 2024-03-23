import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/virtual_assistant";
    private static final String USERNAME = "jamiezoilon";
    private static final String PASSWORD = "Mothermary9113-";

    public static void main(String[] args) {
        initializeDatabase();
    }

    public static void initializeDatabase() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
                Statement statement = connection.createStatement()) {

            // Create database if not exists
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS virtual_assistant");

            // Use the virtual_assistant database
            statement.execute("USE virtual_assistant");

            // Create clients table
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS clients (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "total_amount_billed DOUBLE" +
                    ")");

            // Create services table
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS services (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "hourly_rate DOUBLE," +
                    "total_hours_billed DOUBLE" +
                    ")");

            // Create invoices table
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS invoices (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "client_id INT," +
                    "total_amount DOUBLE," +
                    "FOREIGN KEY (client_id) REFERENCES clients(id)" +
                    ")");

            System.out.println("Database initialized successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
