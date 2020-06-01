package com.wst_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wst_app.common.Pessoa;

@RestController
public class PessoaController {
	
	@RequestMapping(value = "/pessoa", 
	produces = { "application/json" },
	method = RequestMethod.GET)
    public Pessoa Get() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");
        
		return pessoa;
    }

}
