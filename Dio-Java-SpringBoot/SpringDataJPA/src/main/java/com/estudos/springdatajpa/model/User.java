package com.estudos.springdatajpa.model;
import jakarta.persistence.*; //Na versão que eu estou, é o jakarta, e não o javax

@Entity //Toda Entidade de JPA precisa ser chamada de Entity aqui, e precisa ter um ID
@Table(name = "users") //Sempre Setar a tabela
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Aqui adiciono uma estratégia pro banco realizar com meu ID, falando que devo sempre ter um ID correspondente ao meu usuário
    @Column(name = "User_id") // Aqui falo que o nome da minha coluna id, é esse que foi colocado
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 30, nullable = false)
    private String usernome;
    @Column(length = 100, nullable = false)
    private String password;

    public String getUsernome() {
        return usernome;
    }

    public void setUsernome(String usernome) {
        this.usernome = usernome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", usernome='" + usernome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
