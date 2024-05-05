public class Saque {
    private double sacar;
    private double saldo;
    
    public Saque(double sacar, double saldo) {
        this.sacar = sacar;
        this.saldo = saldo;
    }

    public double getSacar() {
        return sacar;
    }
    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacado(){
        System.out.println("Valor do saque é de " + sacar + "R$");
    }
}