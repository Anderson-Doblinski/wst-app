package wst.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wst.common.Pessoa;
import wst.dao.PessoaDao;
import wst.service.IPessoaService;

@Service
public class PessoaServiceImpl implements IPessoaService{
	
	@Autowired PessoaDao pessoaDao;

	@Override
	public Pessoa obterPessoa() {
		
		Pessoa pessoa = pessoaDao.obterPessoa();
		
		return pessoa;
	}

}
