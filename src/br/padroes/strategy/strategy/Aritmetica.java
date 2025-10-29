package br.padroes.strategy.strategy;

/**
 * Média aritmética: (p1 + p2) / 2
 * Critério de aprovação: média >= 5.0
 */
public class Aritmetica implements MediaStrategy {

    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2.0;
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= 5.0 ? "Aprovado" : "Reprovado";
    }
}
