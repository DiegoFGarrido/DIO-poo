package classes.projeto;

import java.util.*;

public class Programadores {

    private String nome;
    private Set<Detalhamento> conteudosInscritos = new LinkedHashSet();
    private Set<Detalhamento> conteudosConcluidos = new LinkedHashSet();

    public Programadores(){
    }

    public void inscreverBootcamp(Curso_intensivo cursoIntensivo) {
        this.conteudosInscritos.addAll(cursoIntensivo.getDetalhamento());
        cursoIntensivo.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Detalhamento> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add((Detalhamento) conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calcularTotalXp() {
        Iterator<Detalhamento> iterator = this.conteudosConcluidos.iterator();

        double soma;
        double next;
        for(soma = 0.0; iterator.hasNext(); soma += next) {
            next = ((Detalhamento)iterator.next()).calcularXp();
        }

        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Detalhamento> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Detalhamento> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Detalhamento> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Detalhamento> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programadores that = (Programadores) o;
        return Objects.equals(nome, that.nome) && Objects.equals(conteudosInscritos, that.conteudosInscritos) && Objects.equals(conteudosConcluidos, that.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
