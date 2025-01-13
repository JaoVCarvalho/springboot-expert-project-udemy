package io.github.jaovcarvalho.springarchitecture.api;

import io.github.jaovcarvalho.springarchitecture.automaker.CarStatus;
import io.github.jaovcarvalho.springarchitecture.automaker.Key;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class FactoryController {

    @PostMapping
    public CarStatus startCar(@RequestBody Key key){

    }
}
