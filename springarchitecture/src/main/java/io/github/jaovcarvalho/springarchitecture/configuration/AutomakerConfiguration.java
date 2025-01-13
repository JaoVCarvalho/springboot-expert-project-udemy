package io.github.jaovcarvalho.springarchitecture.configuration;

import io.github.jaovcarvalho.springarchitecture.automaker.Engine;
import io.github.jaovcarvalho.springarchitecture.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomakerConfiguration {

    @Bean
    public Engine createEngine(){
        Engine engine = new Engine();
        engine.setNumber(1457);
        engine.setModel("Flex Hybrid System");
        engine.setType(EngineType.HYBRID);
        engine.setPower(122);

        return engine;
    }
}
