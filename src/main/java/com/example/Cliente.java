package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public Cliente(){
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;
    }
    
    public Cliente(double renda, char sexo){
        this();//Chama o construtor da própria classe
        setRenda(renda);
        this.sexo = sexo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else
            System.out.println("Não é um sexo válido");    
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda){
        if(renda >= 0)
            this.renda = renda;
        else
            System.out.println("O valor deve ser positivo");
    }
}