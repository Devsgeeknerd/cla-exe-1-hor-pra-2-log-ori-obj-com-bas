package br.com.devsgeeknerd.contascorrentes.classes;

public abstract class ContaCorrente {
  protected String agencia;
  protected String numeroConta;
  protected double saldo;

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public ContaCorrente(String agencia, String numeroConta, double saldoInicial) {
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.saldo = saldoInicial;
  }

  public abstract void depositar(double quantia);

  public void sacar(double quantia) {
    if (quantia <= saldo) {
      saldo -= quantia;
      System.out.println("Saque  realizado com sucesso. Saldo atual: " + saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }
}
