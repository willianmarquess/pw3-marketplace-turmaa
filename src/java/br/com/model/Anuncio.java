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
public class Anuncio {
    private int idAnuncio;
    private String tituloAnuncio;
    private String descricaoAnuncio;
    private double precoAnuncio;
    private String fotoAnuncio;
    private boolean statusAnuncio;
    private Perfil perfilAnuncio;
    
    public Anuncio(){}

    public Anuncio(int idAnuncio, String tituloAnuncio, String descricaoAnuncio, double precoAnuncio, String fotoAnuncio, boolean statusAnuncio, Perfil perfilAnuncio) {
        this.idAnuncio = idAnuncio;
        this.tituloAnuncio = tituloAnuncio;
        this.descricaoAnuncio = descricaoAnuncio;
        this.precoAnuncio = precoAnuncio;
        this.fotoAnuncio = fotoAnuncio;
        this.statusAnuncio = statusAnuncio;
        this.perfilAnuncio = perfilAnuncio;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getTituloAnuncio() {
        return tituloAnuncio;
    }

    public void setTituloAnuncio(String tituloAnuncio) {
        this.tituloAnuncio = tituloAnuncio;
    }

    public String getDescricaoAnuncio() {
        return descricaoAnuncio;
    }

    public void setDescricaoAnuncio(String descricaoAnuncio) {
        this.descricaoAnuncio = descricaoAnuncio;
    }

    public double getPrecoAnuncio() {
        return precoAnuncio;
    }

    public void setPrecoAnuncio(double precoAnuncio) {
        this.precoAnuncio = precoAnuncio;
    }

    public String getFotoAnuncio() {
        return fotoAnuncio;
    }

    public void setFotoAnuncio(String fotoAnuncio) {
        this.fotoAnuncio = fotoAnuncio;
    }

    public boolean isStatusAnuncio() {
        return statusAnuncio;
    }

    public void setStatusAnuncio(boolean statusAnuncio) {
        this.statusAnuncio = statusAnuncio;
    }

    public Perfil getPerfilAnuncio() {
        return perfilAnuncio;
    }

    public void setPerfilAnuncio(Perfil perfilAnuncio) {
        this.perfilAnuncio = perfilAnuncio;
    }

}
