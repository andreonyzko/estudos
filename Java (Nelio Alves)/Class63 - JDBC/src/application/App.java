package application;

import java.sql.Connection;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        Connection db = DB.getConnection();
        DB.closeConnection();
    }
}
