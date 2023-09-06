package contacorrente;
import java.util.Scanner;

public class ContaCorrente {
    
    public static void menu(){
        System.out.println("Seja bem vindo!");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1- Abrir conta");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Encerrar conta");
    }
    
    public static void main(String[] args) {
        //abertura de uma conta 
        Conta p1 = new Conta();
        p1.setNumConta(0001);
        p1.setDono("Bruno");
        p1.abrirConta("cc");
        
        //abertura de outra conta
        Conta p2 = new Conta();
        p2.setNumConta(0002);
        p2.setDono("Creuza");
        p2.abrirConta("cp");

        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        p2.fecharConta();
        
        //visualizar as contas abertas
        p1.estadoAtual();
        p2.estadoAtual();
        
        
    }
}