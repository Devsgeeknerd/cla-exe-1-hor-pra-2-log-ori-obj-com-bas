package br.com.devsgeeknerd.contascorrentes.classes;

public class ContaCorrenteSimples extends ContaCorrente {
  public ContaCorrenteSimples(String agencia, String numeroConta, double saldoInicial) {
    super(agencia, numeroConta, saldoInicial);
  }

  @Override
  public void depositar(double quantia) {
    saldo += quantia;
    System.out.println("Deposito realizado com sucesso. Saldo atual: " + saldo);
  }
}
