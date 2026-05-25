package Teste;

import com.estudos.ApiDosCorreios;
import com.estudos.CadastrarPessoa;
import com.estudos.DadosLocalizacao;
import com.estudos.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks //Somos obrigados a mockar no exemplo a cima, e injetar esse mock na classe alvo
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Tiros", "Rua 1", "Portão laranja", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("3813183")).thenReturn(dadosLocalizacao);
       Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Alves", "565657", LocalDate.now(), "3813183");

        Assertions.assertEquals("Alves", pessoa.getNome());
        Assertions.assertEquals("565657", pessoa.getDocumento());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
    }
}