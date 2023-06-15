import java.util.Objects;

public class Participante {
    String nome;
    int saldoDePontos;

    public Participante(String nome) {
        this (nome, 0);
    }

    public Participante(String nome, int saldoDePontos) {
        Objects.requireNonNull(nome,"Não pode ser nome nulo");

        if(saldoDePontos<0){
            throw new IllegalArgumentException("O Saldo inicial não pode ser menor que zero");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }
}
