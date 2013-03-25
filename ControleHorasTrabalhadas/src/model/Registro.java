package model;

import java.sql.Date;

public class Registro {

    private Integer id;
    private Date data;
    private Integer entrada;
    private Integer saidaAlmoco;
    private Integer voltaAlmoco;
    private Integer saida;
    private Integer totalTrabalhado;
    private Integer totalCalculado;
    private Integer horaExtra;
    private Integer saidas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getSaidaAlmoco() {
        return saidaAlmoco;
    }

    public void setSaidaAlmoco(Integer saidaAlmoco) {
        this.saidaAlmoco = saidaAlmoco;
    }

    public Integer getVoltaAlmoco() {
        return voltaAlmoco;
    }

    public void setVoltaAlmoco(Integer voltaAlmoco) {
        this.voltaAlmoco = voltaAlmoco;
    }

    public Integer getSaida() {
        return saida;
    }

    public void setSaida(Integer saida) {
        this.saida = saida;
    }

    public Integer getTotalTrabalhado() {
        return totalTrabalhado;
    }

    public void setTotalTrabalhado(Integer totalTrabalhado) {
        this.totalTrabalhado = totalTrabalhado;
    }

    public Integer getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Integer horaExtra) {
        this.horaExtra = horaExtra;
    }

    public Integer getSaidas() {
        return saidas;
    }

    public void setSaidas(Integer saidas) {
        this.saidas = saidas;
    }

    public Integer getTotalCalculado() {
        return totalCalculado;
    }

    public void setTotalCalculado(Integer totalCalculado) {
        this.totalCalculado = totalCalculado;
    }
}
