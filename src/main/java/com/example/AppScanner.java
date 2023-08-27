package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class AppScanner {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o Sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0)); 
        
        System.out.println("Digite a Renda: ");
        cliente.setRenda(scanner.nextDouble());
        
        scanner.nextLine();//Colocar entre tipos de dados diferentes

        System.out.println("Digite a Ano de nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt()); 

        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Ano Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());

    }
}
