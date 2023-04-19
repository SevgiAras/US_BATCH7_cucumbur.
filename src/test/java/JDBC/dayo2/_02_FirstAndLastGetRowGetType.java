package JDBC.dayo2;

import Utilities.JDBCConnections;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_FirstAndLastGetRowGetType extends JDBCConnections {
    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id, city,country_id from city");

        rs.first(); //jump to the first row
        String cityName1 =rs.getString("city");
        System.out.println("City on the first row: "+ cityName1);

        rs.last();
        String cityName =rs.getString("city");
        System.out.println("City on the last row: "+ cityName);

        //if a column pure numbers we can get them either as a string or as an int
        int idInt =rs.getInt("city_id");
        System.out.println("id int : "+ idInt);

        String idStr =  rs.getString("city_id");
        System.out.println("id string : "+idStr);

        int currentRowNumber = rs.getRow();
        System.out.println("current row number: "+ currentRowNumber);

        // you can find how many rows your query returns by using last and getROW ONE AFTER ANOTHER





    }
}
