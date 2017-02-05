package model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class JavaciMapper implements RowMapper<Javaci> {

    @Override
    public Javaci mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Javaci(resultSet.getInt("no"), resultSet.getString("isim"),resultSet.getString("soyisim"));
    }
}
