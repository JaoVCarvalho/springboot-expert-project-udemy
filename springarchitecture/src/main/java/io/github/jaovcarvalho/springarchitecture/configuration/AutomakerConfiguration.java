package io.github.jaovcarvalho.springarchitecture.configuration;

import io.github.jaovcarvalho.springarchitecture.automaker.Engine;
import io.github.jaovcarvalho.springarchitecture.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomakerConfiguration {

    @Bean(name = "AspiratedEngine")
    public Engine createAspiratedEngine(){
        Engine engine = new Engine();
        engine.setNumber(1010);
        engine.setModel("THA-10");
        engine.setType(EngineType.ASPIRATED);
        engine.setPower(102);

        return engine;
    }

    @Bean(name = "ElectricEngine")
    public Engine createElectricEngine(){
        Engine engine = new Engine();
        engine.setNumber(1020);
        engine.setModel("THE-20");
        engine.setType(EngineType.ELECTRIC);
        engine.setPower(72);

        return engine;
    }

    @Bean(name = "HybridEngine")
    public Engine createHybridEngine(){
        Engine engine = new Engine();
        engine.setNumber(1030);
        engine.setModel("THH-40");
        engine.setType(EngineType.HYBRID);
        engine.setPower(122);

        return engine;
    }

    @Bean(name = "TurboEngine")
    public Engine createTurboEngine(){
        Engine engine = new Engine();
        engine.setNumber(1040);
        engine.setModel("THT-50");
        engine.setType(EngineType.TURBO);
        engine.setPower(180);

        return engine;
    }
}
