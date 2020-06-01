package wst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wst.common.Pessoa;

public class PessoaController {
	
	@RequestMapping (value = "/pessoa",
			produces = {"application/json"},
			method=RequestMethod.GET)
    public Pessoa retornarPessoa( ){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");

        return pessoa;
    }

}
