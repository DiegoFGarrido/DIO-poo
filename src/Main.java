/*
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;*/
import classes.projeto.Atividades;
import classes.projeto.Consultoria;
import classes.projeto.Curso_intensivo;
import classes.projeto.Programadores;

import java.time.LocalDate;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Atividades atividades1 = new Atividades();
        atividades1.setTitulo("curso java");
        atividades1.setDescricao("descrição curso java");
        atividades1.setCargaHoraria(8);

        Atividades atividades2 = new Atividades();
        atividades2.setTitulo("curso js");
        atividades2.setDescricao("descrição curso js");
        atividades2.setCargaHoraria(4);

        Consultoria consultoria = new Consultoria();
        consultoria.setTitulo("mentoria de java");
        consultoria.setDescricao("descrição mentoria java");
        consultoria.setData(LocalDate.now());
/*
        System.out.println(atividades1);
        System.out.println(atividades2);
        System.out.println(consultoria);
*/


        Curso_intensivo bootcamp = new Curso_intensivo();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getDetalhamento().add(atividades1);
        bootcamp.getDetalhamento().add(atividades2);
        bootcamp.getDetalhamento().add(consultoria);


        Programadores devCarol = new Programadores();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carol:" + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carol:" + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carol:" + devCarol.getConteudosConcluidos());
        System.out.println("XP:" + devCarol.calcularTotalXp());
        System.out.println("-------");


        Programadores devDiego = new Programadores();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Diego:" + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Diego:" + devDiego.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Diego:" + devDiego.getConteudosConcluidos());
        System.out.println("XP:" + devDiego.calcularTotalXp());



    }
}