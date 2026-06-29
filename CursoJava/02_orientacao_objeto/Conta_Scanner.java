public class Conta_Scanner {
    double saldo = 500.0;
    double verificarSaldo(){
        return saldo;
    }


    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Sauqe de R%" + valor + "Realizado!");
        }else{
            System.out.println("Saldo insuficiente para que o saque de R$" +  valor);
        }
    }
}
