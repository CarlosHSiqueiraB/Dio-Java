package com.estudos.primeirospassos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Essa é a classe criada para trabalhar com o conteiner e eliminar a necessidade de usar new
// Ele pensa da seguinte forma: quando inicializar, ele cria um componente calculadora, que terá como dependencia o objeto calculadora, e ele vai executar o método_ que chama a calculadora
@Component
public class MyApp implements CommandLineRunner {
    @Autowired // Isso aqui é quem realiza a injeção e dependência: O equivalente a new = Calculadora();
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: "+ calculadora.somar(3,5));
    }
}
