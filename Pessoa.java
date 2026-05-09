package orientacao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Pessoa {
    // atributos, características da classe//
    String nome;
    int idade;
    double altura;

    public static void main(String[] args) {
        // criando o objeto
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite seu nome:  " + "\n");
        p1.nome = ler.nextLine();
        System.out.println("Digite sua idade:  " + "\n");
        p1.idade = ler.nextInt();
        System.out.println("Digite sua altura: " + "\n");
        p1.altura = ler.nextDouble();
        //chamando metodo//


        //metodo de apresentacao
        System.out.println(p1.nome+"\n"+p1.idade+"\n"+p1.altura);

    }


}




