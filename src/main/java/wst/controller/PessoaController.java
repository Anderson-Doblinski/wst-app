package wst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wst.common.Pessoa;
import wst.service.IPessoaService;

@RestController
public class PessoaController {
	
	@Autowired
	private IPessoaService iPessoaService;
	
	@RequestMapping (value = "/pessoa",
			produces = {"application/json"},
			method=RequestMethod.GET)
    public ResponseEntity<Pessoa> retornarPessoa( ){
		
		Pessoa pessoa = iPessoaService.obterPessoa();

        return new ResponseEntity<>(pessoa,HttpStatus.OK);
    }

}
