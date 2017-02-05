package model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by BeKiR on 05/02/2017.
 */

@Component("javacidao")
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

    public List<Javaci> javaciList(){
        List<Javaci> liste =  jdbcTemplate.query("Select * from kodcu.javaci",new JavaciMapper());
        return liste;
    }
    public void createJavaci(String isim,String soyisim){
        jdbcTemplate.update("INSERT INTO kodcu.javaci(isim,soyisim) VALUE (?,?)",isim,soyisim);
    }



}
