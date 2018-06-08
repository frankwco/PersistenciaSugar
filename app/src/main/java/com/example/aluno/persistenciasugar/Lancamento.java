package com.example.aluno.persistenciasugar;

import com.orm.SugarRecord;

/**
 * Created by aluno on 08/06/18.
 */

public class Lancamento extends SugarRecord {

    private String descricao;
    private Double valor;
    private String tipo;

    public Lancamento(){
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
