import java.sql.*;
public class Fd
{
static final String url="jdbc:mysql://localhost:3306/worlddata";
static final String driver="com.mysql.jdbc.Driver";
static final String user="root";
static final String pass="root";
public static void main(String[] args)throws SQLException,ClassNotFoundException
{
Connection con;
Statement st;
ResultSet rs;
try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection(url,user,pass);
System.out.println("Connected to database");
st=con.createStatement();
String sql="select * from Ec_student";
rs=st.executeQuery(sql);
while(rs.next())
{
String college=rs.getString("college");
String  department=rs.getString("department");
int classname=rs.getInt("classname");
System.out.println(", collegename:"+college);
System.out.println(", Department:"+population);
rs.close();
st.close();
con.close();
}
}
catch(SQLException e)
{
System.out.println(e);
}
}}