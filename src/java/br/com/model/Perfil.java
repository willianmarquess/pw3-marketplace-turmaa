/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author willi
 */
public class Perfil {
    private int idPerfil;
    private String nomePerfil;
    private String rgPerfil;
    private String cpfPerfil;
    private String enderecoPerfil;
    private String cepPerfil;
    private String datanascPerfil;
    private String telefonePerfil;
    private boolean statusPerfil;
    private Usuario usuarioPerfil;
    private Cidade cidadeUsuario;
    
    public Perfil(){}

    public Perfil(int idPerfil, String nomePerfil, String rgPerfil, String cpfPerfil, String enderecoPerfil, String cepPerfil, String datanascPerfil, String telefonePerfil, boolean statusPerfil, Usuario usuarioPerfil, Cidade cidadeUsuario) {
        this.idPerfil = idPerfil;
        this.nomePerfil = nomePerfil;
        this.rgPerfil = rgPerfil;
        this.cpfPerfil = cpfPerfil;
        this.enderecoPerfil = enderecoPerfil;
        this.cepPerfil = cepPerfil;
        this.datanascPerfil = datanascPerfil;
        this.telefonePerfil = telefonePerfil;
        this.statusPerfil = statusPerfil;
        this.usuarioPerfil = usuarioPerfil;
        this.cidadeUsuario = cidadeUsuario;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public String getRgPerfil() {
        return rgPerfil;
    }

    public void setRgPerfil(String rgPerfil) {
        this.rgPerfil = rgPerfil;
    }

    public String getCpfPerfil() {
        return cpfPerfil;
    }

    public void setCpfPerfil(String cpfPerfil) {
        this.cpfPerfil = cpfPerfil;
    }

    public String getEnderecoPerfil() {
        return enderecoPerfil;
    }

    public void setEnderecoPerfil(String enderecoPerfil) {
        this.enderecoPerfil = enderecoPerfil;
    }

    public String getCepPerfil() {
        return cepPerfil;
    }

    public void setCepPerfil(String cepPerfil) {
        this.cepPerfil = cepPerfil;
    }

    public String getDatanascPerfil() {
        return datanascPerfil;
    }

    public void setDatanascPerfil(String datanascPerfil) {
        this.datanascPerfil = datanascPerfil;
    }

    public String getTelefonePerfil() {
        return telefonePerfil;
    }

    public void setTelefonePerfil(String telefonePerfil) {
        this.telefonePerfil = telefonePerfil;
    }

    public boolean isStatusPerfil() {
        return statusPerfil;
    }

    public void setStatusPerfil(boolean statusPerfil) {
        this.statusPerfil = statusPerfil;
    }

    public Usuario getUsuarioPerfil() {
        return usuarioPerfil;
    }

    public void setUsuarioPerfil(Usuario usuarioPerfil) {
        this.usuarioPerfil = usuarioPerfil;
    }

    public Cidade getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(Cidade cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }
    
}
