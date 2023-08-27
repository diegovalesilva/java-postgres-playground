package com.example;

import com.example.model.Cliente;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1980);
        
        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1981);

        if(cliente1.getAnoNascimento() == cliente2.getAnoNascimento()){
            System.out.println("Os clientes nasceram no mesmo ano.");
            System.out.println("O ano de nascimento dos clientes é "+cliente1.getAnoNascimento());
        }else{
            System.out.println("Os clientes nasceram em anos diferentes.");
            System.out.println("O ano de nascimento do cliente 1 é "+cliente1.getAnoNascimento());
            System.out.println("O ano de nascimento do cliente 2 é "+cliente2.getAnoNascimento());
        }
    }
}
