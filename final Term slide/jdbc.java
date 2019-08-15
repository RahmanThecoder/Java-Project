    import java.sql.*;  
    class MysqlCon{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/mydb","root","");  
    //here mydb is database name, root is username and password  
    Statement stmt=con.createStatement(); 
String sql= "CREATE TABLE student(id INTEGER not NULL, first VARCHAR(255), last VARCHAR(255), age INTEGER)"; 	
    stmt.executeUpdate(sql);  
    con.close();
    }catch(Exception e){ System.out.println(e);}  
    }  
    }  
	
	//java -cp .;mysql-connector-java-5.1.47.jar MysqlCon