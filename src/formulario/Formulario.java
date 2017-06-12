package formulario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import negocio.Pessoa;

public class Formulario {

    public static List<Pessoa> lista = new ArrayList<>();
     
        
    static Scanner in = new Scanner(System.in);
   
    public static void main(String[] args) {
        int x = 0;
        try {
        while(x != 3) {
        
        
            
        exibirMenu();
        x = in.nextInt();
        escolherOpcao(x);
        }
        } catch (Exception ex) {
            System.err.println("Digite um número da próxima vez!");
        }
    }
    
    
    
    public static void exibirMenu() {
        System.out.println("==============================");
        System.out.println("1) Registrar nova pessoa.");
        System.out.println("2) Ver todos os registros.");
        System.out.println("3) Sair.");
        System.out.println("Digite a opção desejada.");
        System.out.println("==============================");       
    }
    
    public static void escolherOpcao(int x) {
       
        switch(x) {
            case 1:
                registrarPessoa();
                break;
                
            case 2:
                mostrarLista();
                break;
              
            default:
                System.out.println("opção invalida");
        }
    }
    public static void registrarPessoa() {
        
        in.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();
        in.nextLine();
        System.out.print("Digite a cidade em que nasceu: ");
        String cidade = in.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpf = in.nextLine();
        System.out.print("Digite seu email: ");
        String email = in.nextLine();
        System.out.print("Digite sua profissão: ");
        String profissao = in.nextLine();
        
        Pessoa pessoa = new Pessoa(nome, idade, cidade, cpf, email, profissao);
        lista.add(pessoa);  
         
    }
    
    public static void mostrarLista() {
        for (Pessoa pessoa: lista)
            System.out.println(pessoa.imprimirPessoa());
        
        System.out.println(lista.size());
    }
    
}
