package jdbcexample;
import java.sql.*;
public class JdbcEg1 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/Inventory";
        String user="stn.s";
        String pass="Kishore";
        Connection con;
        Statement st;
        try{
            con=DriverManager.getConnection(url,user,pass);
            st=con.createStatement();
            String sql;
            sql="insert into Inventory"+"(itemNo,itemName,Category,no.ofitemsinshelf)"+"values('24','diarymilk','chocolate','10')";
            st.executeUpdate(sql);
        }catch(SQLException e){
            System.err.println(e);
         
        }
    
    }
    
}