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
public class Cidade {
    private int idCidade;
    private String nomeCidade;
    private String siglaEstadoCidade;
    
    public Cidade(){}

    public Cidade(int idCidade, String nomeCidade, String siglaEstadoCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.siglaEstadoCidade = siglaEstadoCidade;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSiglaEstadoCidade() {
        return siglaEstadoCidade;
    }

    public void setSiglaEstadoCidade(String siglaEstadoCidade) {
        this.siglaEstadoCidade = siglaEstadoCidade;
    } 
}
