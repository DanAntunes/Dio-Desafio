public class ContaPoupanca extends Conta {
  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  public void adicionarJuros(double taxa) {
    double juros = getSaldo() * taxa;
    depositar(juros);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupança ===");
    super.imprimirInfosComuns();
  }
}
