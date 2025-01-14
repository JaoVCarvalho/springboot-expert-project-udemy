package io.github.jaovcarvalho.springarchitecture.api;

import io.github.jaovcarvalho.springarchitecture.automaker.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class FactoryController {

    @Autowired
    // A anotação @Qualifier é usada para identificar um único Bean entre vários do mesmo tipo
    // que estão sendo gerenciados pelo contêiner do Spring, permitindo especificar qual deles deve ser injetado.
    //@Qualifier("ElectricEngine")
    @Turbo // É possível criar sua própria anotação
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key){
        Car car = new Corolla(engine);
        return car.ignition(key);
    }
}
