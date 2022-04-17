package minidocwubet;
import java.sql.*;

import project.ConnectionProvider;

public class minidocwubet {
    public static void main(String[] args) {
        try{
     Connection con = ConnectionProvider.getCon();
       Statement st1 =con.createStatement();
       st1.executeUpdate("create table yes(confermed int)" );
       
       
     
        }catch(Exception e){
            
        }
     
    }
}
