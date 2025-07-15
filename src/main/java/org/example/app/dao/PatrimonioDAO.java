package org.example.app.dao;

import org.example.app.database.DataBaseConnection;
import org.example.app.model.Patrimonio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatrimonioDAO {

    public void cadastrar(Patrimonio p) {
        String sql = "INSERT INTO patrimonios (numero_patrimonio, numero_serie, nome_item, codigo_item, tipo, preco, loja, setor, data_compra, estado_conservacao, observacoes) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DataBaseConnection.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNumeroPatrimonio());
            stmt.setString(2, p.getNumeroSerie());
            stmt.setString(3, p.getNomeItem());
            stmt.setString(4, p.getCodigoItem());
            stmt.setString(5, p.getTipo());
            stmt.setDouble(6, p.getPreco());
            stmt.setString(7, p.getLoja());
            stmt.setString(8, p.getSetor());
            stmt.setString(9, p.getDataCompra());
            stmt.setString(10, p.getEstadoConservacao());
            stmt.setString(11, p.getObservacoes());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar patrimônio: " + e.getMessage());
        }
    }

    public List<Patrimonio> listar() {
        List<Patrimonio> lista = new ArrayList<>();
        String sql = "SELECT * FROM patrimonios";

        try (Connection conn = DataBaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Patrimonio(
                        rs.getInt("id"),
                        rs.getString("numero_patrimonio"),
                        rs.getString("numero_serie"),
                        rs.getString("nome_item"),
                        rs.getString("codigo_item"),
                        rs.getString("tipo"),
                        rs.getDouble("preco"),
                        rs.getString("loja"),
                        rs.getString("setor"),
                        rs.getString("data_compra"),
                        rs.getString("estado_conservacao"),
                        rs.getString("observacoes")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar patrimônios: " + e.getMessage());
        }
        return lista;
    }
}
