package projetojava;

import Banco.Conta;
import Cadastro.Pessoa;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProjetoJava {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa ("paulo",25,1200,123432);
        Conta conta1 = new Conta(pessoa1,123,123456);
        System.out.println("Nome: " + conta1.getTitular().getNome());
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Agência: " + conta1.getAgencia());
        System.out.println("Saldo inicial: " + conta1.getSaldo());


        conta1.depositar(500);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());


        conta1.sacar(200);
        System.out.println("Saldo após saque: " + conta1.getSaldo());


        conta1.sacar(400);
        System.out.println("Saldo final: " + conta1.getSaldo());
    }

}






