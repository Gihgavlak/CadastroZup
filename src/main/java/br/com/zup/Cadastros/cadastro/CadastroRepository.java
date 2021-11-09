package br.com.zup.Cadastros.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CadastroRepository extends JpaRepository<Cadastro, String> {
    @Query( value = "select * from cadastros where mora_sozinho=true",nativeQuery = true)
    public List<Cadastro> exibirListaMoraSozinho ();

    @Query( value = "select * from cadastros where tem_pet=true",nativeQuery = true)
    public List<Cadastro> exibirListaTemPet ();
}
