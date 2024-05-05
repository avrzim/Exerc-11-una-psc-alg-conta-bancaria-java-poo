class Deposito {
    private double saldo;
    private double depositar;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getDepositar() {
        return depositar;
    }
    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public Deposito(double saldo, double depositar) {
        this.saldo = saldo;
        this.depositar = depositar;
    }

    public void depositado(){
        System.out.println("Você depositou " + depositar + "R$");
    }
}