package classes.projeto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Curso_intensivo {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal;
    private Set<Programadores> devsInscritos;
    private Set<Detalhamento> detalhamento;

    public Curso_intensivo() {
        this.dataFinal = this.dataInicial.plusDays(45L);
        this.devsInscritos = new HashSet();
        this.detalhamento = new LinkedHashSet();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Programadores> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Programadores> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Detalhamento> getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(Set<Detalhamento> detalhamento) {
        this.detalhamento = detalhamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso_intensivo that = (Curso_intensivo) o;
        return Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao) && Objects.equals(dataInicial, that.dataInicial) && Objects.equals(dataFinal, that.dataFinal) && Objects.equals(devsInscritos, that.devsInscritos) && Objects.equals(detalhamento, that.detalhamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, detalhamento);
    }

    /*
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Bootcamp bootcamp = (Bootcamp)o;
            return Objects.equals(this.nome, bootcamp.nome) && Objects.equals(this.descricao, bootcamp.descricao) && Objects.equals(this.dataInicial, bootcamp.dataInicial) && Objects.equals(this.dataFinal, bootcamp.dataFinal) && Objects.equals(this.devsInscritos, bootcamp.devsInscritos) && Objects.equals(this.conteudos, bootcamp.conteudos);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.descricao, this.dataInicial, this.dataFinal, this.devsInscritos, this.conteudos});
    }*/
}
