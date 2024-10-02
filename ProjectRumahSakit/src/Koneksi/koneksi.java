package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil tersambung");
        }
    catch (ClassNotFoundException ex) {
        System.out.println("gagal Menyambungkan"+ex);
    }
    String url = "jdbc:mysql://localhost:3306/rumahsakit";
    try{
        koneksi = DriverManager.getConnection(url,"root","");
        System.out.println("berhasil koneksi database"); 
    }
    catch (SQLException ex) {
        System.out.println("gagal koneksi database"+ex);
    }
    return koneksi;
   }
}
