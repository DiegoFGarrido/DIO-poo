package classes.projeto;//package br.com.dio.desafio.dominio;

public class Atividades extends Detalhamento {


        private int cargaHoraria;

        public double calcularXp() {
            return 10.0 * (double)this.cargaHoraria;
        }

        public Atividades() {
        }

        public int getCargaHoraria() {
            return this.cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        public String toString() {
            String var10000 = this.getTitulo();
            return "classes.projeto.Atividades{titulo='" + var10000 + "', descricao='" + this.getDescricao() + "', cargaHoraria=" + this.cargaHoraria + "}";
        }

    }
