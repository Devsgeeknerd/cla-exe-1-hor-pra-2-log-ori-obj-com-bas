package br.com.devsgeeknerd.contascorrentes.classes;

public class ContaCorrenteGold extends ContaCorrente {
  public ContaCorrenteGold(String agencia, String numeroConta, double saldoInicial) {
    super(agencia, numeroConta, saldoInicial);
  }

  @override
  public void depositar(double quantia) {
    saldo += quantia * 3;
    System.out.println("Deposito realizado com sucesso. Saldo Atual: " + saldo);
  }
}
