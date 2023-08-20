package com.example;

public class AppClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setRenda(3000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
    }
}
