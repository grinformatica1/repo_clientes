package io.github.grinformatica1.clientes.rest;

import io.github.grinformatica1.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }
}

//Boa Tarde