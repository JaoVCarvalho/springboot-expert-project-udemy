package io.github.jaovcarvalho.apiproducts.model.entity;


import jakarta.persistence.*;

// POJO -> Plan Old Java Object
// Classe com os atributos privados e os methods getters e setters
@Entity
@Table(name = "product")
public class Product {

    /*
    * Uma dica é utilizar o comando `ctrl + space` para ver as opções possíveis
    * Exemplo.: @GeneratedValue(`ctrl + space`)
    * */

    @Id
    // @Columm(...) define o nome do meu atributo na coluna da tabela
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

}
