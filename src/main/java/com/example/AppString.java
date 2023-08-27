package com.example;

import com.example.model.Cliente;

public class AppString {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.setNome("Diego Vale");
        String vetorNome[] = cliente.getNome().split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);
        
        System.out.println("1° Caractere do nome: " + cliente.getNome().charAt(0));

        System.out.println("Nome: " + cliente.getNome());
    }
}
