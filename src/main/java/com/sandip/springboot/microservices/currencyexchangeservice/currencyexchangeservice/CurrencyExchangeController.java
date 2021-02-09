package com.sandip.springboot.microservices.currencyexchangeservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private CurrencyExchangeRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange currencyExchange(
            @PathVariable String from,
            @PathVariable String to
    ) {
        CurrencyExchange cuurencyExchange = repository.findByFromAndTo(from, to);
        if (cuurencyExchange == null) {
            throw new RuntimeException("Unable to find from " + from + "And to " + to);
        }
        String port = environment.getProperty("local.server.port");
        cuurencyExchange.setEnvironment(port);
        return cuurencyExchange;
    }
}
