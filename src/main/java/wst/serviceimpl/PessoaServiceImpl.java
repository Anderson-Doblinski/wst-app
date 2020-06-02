package wst.serviceimpl;

import org.springframework.stereotype.Service;

import wst.common.Pessoa;
import wst.service.IPessoaService;

@Service
public class PessoaServiceImpl implements IPessoaService{

	@Override
	public Pessoa obterPessoa() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");
		
		return pessoa;
	}

}
