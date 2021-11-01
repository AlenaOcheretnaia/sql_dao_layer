package netology.aloch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DaoRepository {
    String myQuery = read("myQuery.sql");

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void getProductName(String nameCustomer) {
        SqlRowSet productList = namedParameterJdbcTemplate.queryForRowSet("select * from customers where name = :name",
                Map.of("name", nameCustomer));

//        while(product_nameList.next())
//        {
//            System.out.println(product_nameList.getString(1));
//        }

    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}