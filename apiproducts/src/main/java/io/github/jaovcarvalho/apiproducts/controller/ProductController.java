package io.github.jaovcarvalho.apiproducts.controller;

import io.github.jaovcarvalho.apiproducts.model.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Indica para o Spring que essa clase irá receber requisições REST
@RequestMapping("/product")
// Indica a url básica dessa classe controller
public class ProductController {

    @PostMapping
    // @RequestBody transforma as informações recebidas pela requisição POST em um objeto
    public Product save(@RequestBody Product product){
        System.out.println("Product received!");
        return product;
    }
}
