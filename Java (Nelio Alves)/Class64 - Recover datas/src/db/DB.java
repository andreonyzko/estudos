package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

    private static Connection connection = null;

    public static Connection getConnection(){
        if(connection == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                connection = DriverManager.getConnection(url, props);
            } 
            catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }

        return connection;
    }

    public static void closeConnection(){
         if(connection != null){
            try {
                connection.close();
            }
            catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
         }
    }

    public static void closeStatement(Statement consult){
        try {
            consult.close();
        } 
        catch (SQLException e) {
            throw new DBException(e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet result){
        try {
            result.close();
        } 
        catch (SQLException e) {
            throw new DBException(e.getMessage());
        }
    }

    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } 
        catch (IOException e) {
            throw new DBException(e.getMessage());
        }
    }
}
