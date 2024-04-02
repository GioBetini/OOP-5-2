package Model;

public class Conta {

    private int agencia;
    private int codigo;
    private float saldo;
    private float limite;

    public Conta() {
        super();
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void Deposita(float valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException();
        } else {
            saldo += valor;
            System.out.println("Depósito efetuado com sucesso!\nSeu novo saldo é: R$" + saldo);
        }
    }

    public void Saque(float valor) throws IllegalArgumentException {
        if (valor > saldo+limite) {
            throw new IllegalArgumentException();
        } else {
            if (valor > saldo){
                limite = saldo - valor + limite;
                saldo = 0;
                System.out.println("Saque efetuado com sucesso!\nSeu novo saldo é: R$" + saldo+"\nCom o limite atual de: R$"+limite);
            } else {
                saldo -= valor;
                System.out.println("Saque efetuado com sucesso!\nSeu novo saldo é: R$" + saldo+"\nCom o limite atual de: R$"+limite);
            }
        }
    }

}
