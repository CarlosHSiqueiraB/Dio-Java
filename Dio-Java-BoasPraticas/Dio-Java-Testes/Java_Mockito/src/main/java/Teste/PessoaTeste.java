package Teste;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PessoaTeste {

    private String nome;

    private String documento;

    private LocalDate nascimento;

    private DadosLocalizacaoTeste endereco;

    public PessoaTeste(final String nome, final String documento, final LocalDate nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    public void adicionaDadosDeEndereco(DadosLocalizacaoTeste dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacaoTeste getEndereco() {
        return endereco;
    }

    public boolean ehMaiorDeIdade() {
        return ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()) > 18L;
    }
}