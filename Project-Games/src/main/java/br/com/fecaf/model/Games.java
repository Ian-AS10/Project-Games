package br.com.fecaf.model;

import java.time.LocalDate;

public class Games {
    private int id;
    private String titulo, desenvolvedora, plataforma, status, tempoJogo, platina, tempoPlatina;
    private double nota;
    private java.time.LocalDate dataInicio, dataTermino;

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTempoJogo() {
        return tempoJogo;
    }

    public void setTempoJogo(String tempoJogo) {
        this.tempoJogo = tempoJogo;
    }

    public String getPlatina() {
        return platina;
    }

    public void setPlatina(String platina) {
        this.platina = platina;
    }

    public String getTempoPlatina() {
        return tempoPlatina;
    }

    public void setTempoPlatina(String tempoPlatina) {
        this.tempoPlatina = tempoPlatina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    //Metodo ToString
    @Override
    public String toString () {
        return "Games{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", desenvolvedora='" + desenvolvedora + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", status='" + status + '\'' +
                ", tempoJogo='" + tempoJogo + '\'' +
                ", platina='" + platina + '\'' +
                ", tempoPlatina='" + tempoPlatina + '\'' +
                ", nota=" + nota +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                '}';
    }
}



