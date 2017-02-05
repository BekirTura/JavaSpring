package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BeKiR on 05/02/2017.
 */
@Component("Javacilar")
public class JavaciDAO {
    @Autowired
    private DataSource dataSource;
    public List<Javaci> javacilar(){
        String query = "select *  from kodcu.javaci";
        Connection connection = null;
        List<Javaci> list = new ArrayList<>();
        try {
            connection =  dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                list.add(new Javaci(resultSet.getInt("no"), resultSet.getString("isim"),resultSet.getString("soyisim")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  list;
    }
}
