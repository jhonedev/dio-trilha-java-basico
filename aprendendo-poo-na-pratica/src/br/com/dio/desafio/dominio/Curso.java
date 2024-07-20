package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //atributos -> Uma boa prática os atributos estarem private
    private int cargaHoraria;

    //construtor
    public Curso() {

    }

    //metodos
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString
    @Override 
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    

}
