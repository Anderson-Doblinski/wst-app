package wst.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wst.common.Pessoa;

@RestController
public class PessoaController {
	
	@RequestMapping (value = "/pessoa",
			produces = {"application/json"},
			method=RequestMethod.GET)
    public ResponseEntity<Pessoa> retornarPessoa( ){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");

        return new ResponseEntity<>(pessoa,HttpStatus.OK);
    }

}
