package br.com.zup.Cadastros.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @PutMapping
    public void cadastrarPessoa(@RequestBody Cadastro novoCadastro){
        cadastroService.cadastrarPessoa(novoCadastro);
    }
    @GetMapping
    public List<Cadastro> exibirListaCadastro(){
        return cadastroService.exibirListaCadastro();

    }

    @RequestMapping("/moraSozinho")
    @GetMapping
    public List<Cadastro> exibirListaMoraSozinho(){
        return cadastroService.exibirListaMoraSozinho();

    }

    @RequestMapping("/temPet")
    @GetMapping
    public List<Cadastro> exibirListaTemPet(){
        return cadastroService.exibirListaTemPet();

    }



    /*
    todo  1 - crie um metodo para cadastrar uma pessoa.
      Para um cadastro todo os campos são obrigatórios EXCETO o campo dataDoCadastro que deve ser preenchido pelo proprio sistema e o client não deve saber da existencia desse campo
     todo 2 - Faça um metodo que retorna a lista inteira de cadastros ou filtrado por cadastros que moram sozinhos, que tem pet ou por idade.
     nessa lista deve ser retornado apenas os campos ID, NOME e SOBRENOME.
     todo 3 - faça um metodo para DELETAR um cadastro por id.
     todo 4 - faça um metodo que retorna TODOS os dados de um usuario pesquisado pelo ID.
     */

}
