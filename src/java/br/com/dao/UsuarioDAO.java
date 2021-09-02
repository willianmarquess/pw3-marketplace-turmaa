/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.model.Usuario;
import br.com.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willi
 */
public class UsuarioDAO {
    private Connection con;
    
    public UsuarioDAO(){
        try {
            this.con = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Problemas ao conectar com"
                    + " o banco de dados"+e.getMessage());
        }
    }
    
    public boolean cadastrar(Usuario usuario){
        PreparedStatement stmt = null;
        String sql = "insert into usuario(emai_usuario, senha_usuario, tipo_usuario, status_usuario) values (?, ?, ?, ?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getEmailUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getTipoUsuario());
            stmt.setBoolean(4, usuario.isStatusUsuario());
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao cadastrar"+e.getMessage());
            return false;
        }finally{
            try {
                
            } catch (Exception e) {
            }
        }
    }
    
    public List<Usuario> listarTodos(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from usuario";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setEmailUsuario(rs.getString("email_usuario"));
                usuario.setSenhaUsuario(rs.getString("senha_usuario"));
                usuario.setStatusUsuario(rs.getBoolean("status_usuario"));
                usuario.setTipoUsuario(rs.getString("tipo_usuario"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
        }
        return usuarios;
    }
}
