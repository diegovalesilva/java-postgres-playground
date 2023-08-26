package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) {
        new AppBd();
    }

    public AppBd(){
        try(var conn = getConnection()) {
            //carregarDriverJDBC();
            listarEstados(conn);
            localizarEstado(conn, "PR");
        }catch (SQLException e) {
            System.err.println("Não foi possível conectar no banco de dados." + e.getMessage()); 
        }
    }

    private void localizarEstado(Connection conn, String uf) {
        try{
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            statement.setString(1,uf);
            var result = statement.executeQuery();
            if(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        }catch(SQLException e){
            System.err.println("Não foi possível executar a consulta no banco de dados." + e.getMessage());
        }
        
    }

    private void listarEstados(Connection conn) {
        
        try{
            
            System.out.println("Conexão com o banco realizada com sucesso.");

            var statement = conn.createStatement();
            var result = statement.executeQuery("SELECT * FROM estado");

            while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }

        } catch (SQLException e) {
            
            System.err.println("Não foi possível executar a consulta no banco de dados." + e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    /*
        private void carregarDriverJDBC() {
            try {
                Class.forName("org.postgresql.Driver");

            } catch (ClassNotFoundException e) {
                System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados!" + e.getMessage());
            }
        }
    */
}