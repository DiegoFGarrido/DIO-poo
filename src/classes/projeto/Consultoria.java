package classes.projeto;
//package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Consultoria extends Detalhamento {
    private LocalDate data;

    public double calcularXp() {
        return 30.0;
    }

    public Consultoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        String var10000 = this.getTitulo();
        return "classes.projeto.Consultoria{titulo='" + var10000 + "', descricao='" + this.getDescricao() + "', data=" + this.data + "}";
    }
}
