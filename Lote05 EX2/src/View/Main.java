package View;

import Model.Conta;

public class Main {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        c1.setAgencia(1);
        c1.setCodigo(0001);
        c1.setLimite(100);
        c1.setSaldo(500);



       try {
        c1.Deposita(20);
        //c1.Deposita(-10); //comentário para testar apenas Saque acima do limite + saldo
        c1.Saque(100);
        c1.Saque(1000);
       } catch (IllegalArgumentException e) {
            System.err.println("Insira um valor válido");
       }

    }
}
