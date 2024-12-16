package io.github.jaovcarvalho.apiproducts.controller;

import io.github.jaovcarvalho.apiproducts.model.entity.Product;
import io.github.jaovcarvalho.apiproducts.repository.ProductRepository;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
// Indica para o Spring que essa clase irá receber requisições REST
@RequestMapping("/product")
// Indica a url básica dessa classe controller

public class ProductController {

    private ProductRepository repository;

    /*
    * Como a ProductController e a ProductRepository são gerenciadas pelo Spring, é possível realizar a injeção de dependência
    * utilizando apenas o contrutor, sem a necessidade de criar um intância, isto é, o spring já irá fazer isso.
    *
    * Outra abordagem seria utilizar a anotação @Autowired para injetar automaticamente a dependência do ProductRepository
    *
    * Contudo, a abordagem utilizando construtor é a mais indicada e segura
    * */
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    // @RequestBody transforma as informações recebidas pela requisição POST em um objeto
    public Product save(@RequestBody Product product){
        // Classe para gerar códigos de identificação únicos
        String id = UUID.randomUUID().toString();
        product.setId(id);
        repository.save(product);
        return product;
    }

    // @GetMapping("/{id}/{name}/{price}")
    //(@PathVariable("id") String id, @PathVariable("name") String name, @PathVariable("price") Double price)
    // Posso receber mais um de valor pela requisição
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id){

        /*
        * Uma dica para facilitar na hora de programar é utilizar `.var` para criar uma variável automaticamente, exemplo.:
        * repository.findById(id).var -> Optional<Product> product = repository.findById(id)
        * */

        /*
        * Por padrão, consultas retornam um Optional.
        * Caso tenha um produto com o id repassado, então é um produto
        * Caso não tenha um produto com o id repassado, então é um Optional vazio
        * */

//        Optional<Product> product = repository.findById(id);
//        return product.isPresent() ? product.get() : null;

        // Outra forma de escrever
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String id, @RequestBody Product product){
        product.setId(id);
        /*
        * Como definimos um id para o produto, o spring sabe que ao chamar a função `.save`, não se trata da criação de
        * um novo produto, mas sim da atualização de um produto existente.
        * */
        repository.save(product);
    }

    @GetMapping
    /*
    * @RequestParam indica que é uma consulta utilizando parâmetros, nesse caso, por exemplo, ficaria:
    * http://localhost:8080/products?name=name
    *
    * Além disso, é possivel realizar consultas utilizando mais de um parâmetro, por exemplo:
    * (@RequestParam("name") String name, @RequestParam("price") Double price)
    * http://localhost:8080/products?name=name&price=price
    * */
    public List<Product> getProductsByName(@RequestParam("name") String name){
        // Query personalizada
        return repository.findByName(name);
    }
}
