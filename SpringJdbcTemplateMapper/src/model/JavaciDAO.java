package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

public class JavaciDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public JavaciDAO(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Javaci getJavaci(int no){
        Javaci javaci =  jdbcTemplate.queryForObject("Select * from kodcu.javaci where no=?",new Object[]{no},new JavaciMapper());
        return javaci;
    }


}
