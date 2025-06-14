package io.github.jaovcarvalho.springarchitecture.todos.repository;

import io.github.jaovcarvalho.springarchitecture.todos.model.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Interfaces que estendem Repository (ex: JpaRepository) são automaticamente
registradas como beans pelo Spring Data JPA. Isso significa que não é necessário
usar a anotação @Component ou suas variantes para que essas interfaces sejam
gerenciadas pelo container Spring.
*/

// <> -> Pode ser conhecido como operador diamante

/*
A anotação @Repository é uma das poucas que apresenta diferença para os outros @Components,
visto que uma classe que utiliza essa anotação será otimizada para trabalhar com Banco de Dados.
*/
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    Boolean existsByDescription(String description);
}
