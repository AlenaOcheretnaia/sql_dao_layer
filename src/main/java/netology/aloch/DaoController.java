package netology.aloch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DaoController {
    DaoRepository daoRepository=new DaoRepository();

    @GetMapping("/")
    public String helloMetod() {
        return("Hello from DAO Layer!");
    }


    @GetMapping("/products/fetch-product")
    public String getOrders(@RequestParam String name) {
        daoRepository.getProductName(name);

        return("Product name = "+name);
    }


}

