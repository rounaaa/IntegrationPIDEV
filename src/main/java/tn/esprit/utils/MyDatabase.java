package tn.esprit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabase {
    private static MyDatabase instance;
    private final String URL ="jdbc:mysql://127.0.0.1:3306/bledismart";
    private final String USERNAME ="root";
    private final String PASSWORD = "";
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/may
    private Connection  cnx ;

    private MyDatabase() {
        try {
            cnx = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("connected ...");
<<<<<<< HEAD
=======
    private Connection cnx;

    private MyDatabase() {
        try {
            cnx = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected ...");
>>>>>>> origin/adem
=======
>>>>>>> origin/may
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> origin/adem
=======

>>>>>>> origin/may
    public static MyDatabase getInstance() {
        if (instance == null)
            instance = new MyDatabase();
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
}
