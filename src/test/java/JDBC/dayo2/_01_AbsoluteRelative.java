package JDBC.dayo2;

import Utilities.JDBCConnections;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_AbsoluteRelative extends JDBCConnections {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");

        rs.absolute(10); // goes to the 10th row right away
        String title = rs.getString("title");
        System.out.println("Film title on the 10th row: " + title);

        rs.absolute(15);
        title = rs.getString("title");
        System.out.println("Film title on the 15th row: " + title);

        rs.absolute(5);
        title = rs.getString("title");
        System.out.println("Film title on the 5th row: " + title);

        rs.relative(20); // moves 20 row from current position. in this case it is 25th rows
        title =rs.getString("title");
        System.out.println("film title on the 25th row :"+ title );

        rs.relative(3); // moves 20 rowa from current position. in this case it is 25th rows
        title =rs.getString("title");
        System.out.println("film title on the 28th row :"+ title );

        rs.relative(-10);// it will be back
        title=rs.getString("title");
        System.out.println("film title on the 28th row :"+ title);






    }
}

