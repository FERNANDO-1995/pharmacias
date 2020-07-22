/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmacia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Conexao {

    public int id;
    Connection c;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost/pharmacia"; // conectar o indereço com a base de dados.

   public Connection conectar() {
        try {
            c = DriverManager.getConnection(url, "root", ""); //conctar a base dados no servidor.

        } catch (ClassCastException cce) {
            JOptionPane.showMessageDialog(null, cce);// faz o erro com a bds.

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);// mostra o erro do sqle
        }
        return c;
    }
    /* public Connection conectar() {
         //System.out.println("Conectando ao banco...");
       try {
       Class.forName("com.mysql.jdbc.Driver");
       c =  DriverManager.getConnection("jdbc:mysql://192.168.100.3/pharmacia","pharmacia","pharmacia");
      // System.out.println("Conectado.");
        //c =  DriverManager.getConnection("jdbc:mysql://localhost/pharmacia","root","");
           

       } catch (ClassNotFoundException ex) {
    //System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
    } catch(SQLException e) {
    System.out.println(e);
    throw new RuntimeException(e);
    }
        return c;
    }*/
public long diferenciadia(String data) {
        LocalDate agora = LocalDate.now();
        LocalDate futuro = LocalDate.parse(data);
        long diferenciadata = ChronoUnit.DAYS.between(agora, futuro);
        return diferenciadata;
    }
    public int cadastrar_dado(String sql) {
        int a = 0;
        try (PreparedStatement ps = this.c.prepareStatement(sql)) {
            a = ps.executeUpdate();
            ps.close();
            this.c.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return a;
    }

    public ResultSet buscar(String sql) {

        try (PreparedStatement ps = this.c.prepareStatement(sql)) {
            rs = ps.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return rs;
    }

    public static boolean Write( String Texto) {
        try {
            FileWriter arq = new FileWriter("texto.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
     public static boolean WriteCargo( String Texto) {
        try {
            FileWriter arq = new FileWriter("cargo.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public static boolean WriteNome( String Texto) {
        try {
            FileWriter arq = new FileWriter("textonome.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

        public static String Reads() {
        String Conteudo = "";
        try {
            FileReader arq = new FileReader("C:\\Program Files\\system\\system.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String Linha = "";
            try {
                Linha = lerArq.readLine();
                while (Linha != null) {
                    Conteudo = Linha;
                    Linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException e) {
                Conteudo = "ERRO: NAO FOI POSSIVEL LER O AQRUIVO!";
            }
        } catch (FileNotFoundException ex) {
            Conteudo = "Erro: Arquivo nao encontrado!";
        }
        if (Conteudo.contains("ERRO")) {
            return "";
        } else {
            return Conteudo;
        }

    }
        
    public static String Read() {
        String Conteudo = "";
        try {
            FileReader arq = new FileReader("texto.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String Linha = "";
            try {
                Linha = lerArq.readLine();
                while (Linha != null) {
                    Conteudo = Linha;
                    Linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException e) {
                Conteudo = "ERRO: NAO FOI POSSIVEL LER O AQRUIVO!";
            }
        } catch (FileNotFoundException ex) {
            Conteudo = "Erro: Arquivo nao encontrado!";
        }
        if (Conteudo.contains("ERRO")) {
            return "";
        } else {
            return Conteudo;
        }

    }
    
    public static String ReadNome() {
        String Conteudo = "";
        try {
            FileReader arq = new FileReader("textonome.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String Linha = "";
            try {
                Linha = lerArq.readLine();
                while (Linha != null) {
                    Conteudo = Linha;
                    Linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException e) {
                Conteudo = "ERRO: NAO FOI POSSIVEL LER O AQRUIVO!";
            }
        } catch (FileNotFoundException ex) {
            Conteudo = "Erro: Arquivo nao encontrado!";
        }
        if (Conteudo.contains("ERRO")) {
            return "";
        } else {
            return Conteudo;
        }

    }
    
    public static String ReadCargo() {
        String Conteudo = "";
        try {
            FileReader arq = new FileReader("cargo.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String Linha = "";
            try {
                Linha = lerArq.readLine();
                while (Linha != null) {
                    Conteudo = Linha;
                    Linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException e) {
                Conteudo = "ERRO: NAO FOI POSSIVEL LER O AQRUIVO!";
            }
        } catch (FileNotFoundException ex) {
            Conteudo = "Erro: Arquivo nao encontrado!";
        }
        if (Conteudo.contains("ERRO")) {
            return "";
        } else {
            return Conteudo;
        }

    }
}
