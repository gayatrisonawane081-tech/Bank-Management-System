package bank.management.system1;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "gayatri");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
