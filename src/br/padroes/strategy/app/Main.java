package br.padroes.strategy.app;

import br.padroes.strategy.model.Disciplina;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.Geometrica;
import br.padroes.strategy.strategy.MediaStrategy;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Ajusta Locale para mostrar vírgula como separador decimal (opcional)
        Locale.setDefault(new Locale("pt", "BR"));

        // TESTE 1: Média Aritmética
        System.out.println("=== MÉDIA ARITMÉTICA ===");
        MediaStrategy estrategiaAritmetica = new Aritmetica();
        Disciplina d = new Disciplina(estrategiaAritmetica);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());

        // TESTE 2: Média Geométrica (troca de estratégia em tempo de execução)
        System.out.println("=== MÉDIA GEOMÉTRICA ===");
        d.setEstrategia(new Geometrica());
        d.calcularMedia();
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}
