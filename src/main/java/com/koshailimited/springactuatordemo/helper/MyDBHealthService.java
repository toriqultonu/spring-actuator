package com.koshailimited.springactuatordemo.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHealthService implements HealthIndicator {

    public boolean isHealthGood(){

        return true;
    }

    @Override
    public Health health() {
        if(isHealthGood()){
            return Health.up().withDetail("Data base service is running").build();
        }
        return Health.down().withDetail("down").build();
    }
}
