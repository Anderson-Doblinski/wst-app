package wst.daoImpl;

import org.springframework.stereotype.Repository;

import wst.common.Pessoa;
import wst.dao.PessoaDao;

@Repository(value = "pessoaDao")
public class PessoaDaoImpl implements PessoaDao {

	@Override
	public Pessoa obterPessoa() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");
		
		return pessoa;
	}

}
