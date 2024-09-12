/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Prato;
import Connections.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eduu_
 */
public class PratoDAO {
    public ArrayList<Prato> lerBanco() {

        Connection con = DBConnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Prato> pratos = new ArrayList<>();
//teste
        try {
            stmt = con.prepareStatement("SELECT * FROM Prato");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Prato prato = new Prato();
                prato.setId(rs.getInt("id"));
                prato.setName(rs.getString("nome"));
                prato.setChef(rs.getString("chef"));              
                pratos.add(prato);
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível ler a tabela Prato");
        } finally {
            DBConnection.closeConnection(con, stmt, rs);
        }
        return pratos;
    }

    public void inserirBanco(Prato p) {
        Connection con = DBConnection.getConnection();
        PreparedStatement stmt = null;
        try {
//            stmt = con.prepareStatement("INSERT INTO Prato (ID, nome, chef) VALUES (?, ?, ?)");
            stmt = con.prepareStatement("INSERT INTO Prato (nome, chef) VALUES ( ?, ?)");
//            stmt.setInt(1, p.getId());
            stmt.setString(1, p.getName());
            stmt.setString(2, p.getChef());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na tabela Prato");
        } finally {
            DBConnection.closeConnection(con, stmt);
        }

    }

    public void atualizarBanco(Prato p) {
        Connection con = DBConnection.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Prato SET  nome = ?, chef = ? WHERE id = ?");

            stmt.setString(1, p.getName());
            stmt.setString(2, p.getChef());
            stmt.setInt(3, p.getId());
            stmt.executeUpdate();
           
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar na tabela Contato");
        } finally {
            DBConnection.closeConnection(con, stmt);
            
        }
        
     

    
}
    public void deletarNoBanco(Prato p) {
        Connection con = DBConnection.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" DELETE FROM Prato WHERE id = ? AND chef = ?");
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getChef());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao deletar na tabela Contato");
        } finally {
            DBConnection.closeConnection(con, stmt);
        }

    }
}
