package netology.aloch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DaoController {

    @Autowired
    DaoRepository daoRepository;

    @GetMapping("/")
    public String helloMetod() {
        return("Hello from DAO Layer!");
    }


    @GetMapping("/products/fetch-product")
    public String getOrders(@RequestParam String name) {
        List<String> resultProductName = daoRepository.getProductName(name);

        return("Product(s) name for name: " + name + " is(are) " + resultProductName.toString());
    }

    private void getProductName(String name) {
    }


}

