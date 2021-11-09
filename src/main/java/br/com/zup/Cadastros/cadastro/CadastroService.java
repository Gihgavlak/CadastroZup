package br.com.zup.Cadastros.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void cadastrarPessoa(Cadastro cadastro){

        Cadastro novoCadastro = new Cadastro();
        novoCadastro.setCpf(cadastro.getCpf());
        novoCadastro.setNome(cadastro.getNome());
        novoCadastro.setSobrenome(cadastro.getSobrenome());
        novoCadastro.setCidade(cadastro.getCidade());
        novoCadastro.setBairro(cadastro.getBairro());
        novoCadastro.setNomeDoParenteProximo(cadastro.getNomeDoParenteProximo());
        novoCadastro.setMoraSozinho(cadastro.isMoraSozinho());
        novoCadastro.setTemPet(cadastro.isTemPet());
        novoCadastro.setIdade(cadastro.getIdade());
        novoCadastro.setDataDoCadastro(retornarDataAtual());

        cadastroRepository.save(novoCadastro);

    }
    public List<Cadastro> exibirListaCadastro () {
        Iterable<Cadastro> listaCadastros = cadastroRepository.findAll();
        return (List<Cadastro>) listaCadastros;
    }

    public LocalDate retornarDataAtual(){
        LocalDate data = LocalDate.now();
        return data;
    }

    public List<Cadastro> exibirListaMoraSozinho () {
        Iterable<Cadastro> listaCadastros = cadastroRepository.exibirListaMoraSozinho();
        return (List<Cadastro>) listaCadastros;
    }

    public List<Cadastro> exibirListaTemPet() {
        Iterable<Cadastro> listaCadastros = cadastroRepository.exibirListaTemPet();
        return (List<Cadastro>) listaCadastros;
    }

}

/*
@Query("SELECT u FROM User u WHERE u.status = 1")
Collection<User> findAllActiveUsers();

 */