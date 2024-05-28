package br.com.devsgeeknerd.contascorrentes.classes;

import br.com.devsgeeknerd.contascorrentes.classes.ContaCorrente;
import br.com.devsgeeknerd.contascorrentes.classes.ContaCorrenteSimples;
import br.com.devsgeeknerd.contascorrentes.classes.ContaCorrenteFlex;
import br.com.devsgeeknerd.contascorrentes.classes.ContaCorrenteGold;
import br.com.devsgeeknerd.contascorrentes.classes.Titular;

public class Programa {
  public static void programa(String[] args) {
    ContaCorrente contaSimples = new ContaCorrenteSimples("001", "123456-7", 1000.0);
    ContaCorrente contaFlex = new ContaCorrenteFlex("001", "985246-3", 2000.0);
    ContaCorrente contaGold = new ContaCorrenteGold("001", "113479-1", 3000.0);

    Titular titular1 = new Titular("José", "Oliveira", 30, "132.456.789-00", contaSimples);
    Titular titular2 = new Titular("Maria", "Souza", 22, "654.111.090-33", contaFlex);
    Titular titular3 = new Titular("João", "Batista", 38, "333.978.123-44", contaGold);

    titular1.depositar(100);
    titular1.sacar(30);

    titular2.depositar(150);
    titular2.sacar(59);

    titular3.depositar(458);
    titular3.sacar(126);
  }
}
