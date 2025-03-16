package org.example;

public class ConexaoTennantMS {

    private ConexaoTennantMS() {};
    private static ConexaoTennantMS instance = new ConexaoTennantMS();
    public static ConexaoTennantMS getInstance() {
        return instance;
    }

    private String nomeUsuario;
    private String produtoUsuario;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getProdutoUsuario() {
        return produtoUsuario;
    }

    public void setProdutoUsuario(String produtoUsuario) {
        this.produtoUsuario = produtoUsuario;
    }

    public void getProdutoUsuario(String produtoUsuario) {
        this.produtoUsuario = produtoUsuario;
    }
}