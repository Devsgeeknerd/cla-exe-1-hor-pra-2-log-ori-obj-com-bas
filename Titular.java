package br.com.devsgeeknerd.contascorrentes.classes;

public class Titular {
  private String nome;
  private String sobrenome;
  private int idade;
  private String cpf;
  private ContaCorrente conta;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public ContaCorrente getConta() {
    return conta;
  }

  public void setConta(ContaCorrente conta) {
    this.conta = conta;
  }

  public Titular(String nome, String sobrenome, int idade, String cpf, ContaCorrente conta) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.cpf = cpf;
    this.conta = conta;
  }

  public void depositar(double quantia) {
    conta.depositar(quantia);
  }

  public void sacar(double quantia) {
    conta.sacar(quantia);
  }
}
