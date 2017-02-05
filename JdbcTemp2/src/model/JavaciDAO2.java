package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by BeKiR on 05/02/2017.
 */
@Component("javacidao2")
public class JavaciDAO2 {

    private DataSource dataSource;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public JavaciDAO2(DataSource dataSource) {
        this.dataSource = dataSource;
        namedParameterJdbcTemplate =  new NamedParameterJdbcTemplate(dataSource);
    }
    public void create(Javaci javaci){
        String sql = "INSERT INTO kodcu.javaci(no,isim,soyisim) values (:no,:isim,:soyisim)";
        Map<String,Object> parameters =  new HashMap<>();
        parameters.put("no",javaci.getNo());
        parameters.put("isim",javaci.getIsim());
        parameters.put("soyisim",javaci.getSoyisim());
        namedParameterJdbcTemplate.update(sql,parameters);
    }
    public List<Javaci> javaciList(){
        List<Javaci> liste =  namedParameterJdbcTemplate.query("Select * from kodcu.javaci",new JavaciMapper());
        return liste;
    }
}
