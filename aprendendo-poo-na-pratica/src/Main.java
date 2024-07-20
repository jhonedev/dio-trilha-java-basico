import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Descrição curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Python");
        cursoPython.setDescricao("Descrição curso Python");
        cursoPython.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJavaDeveloper = new Bootcamp();
        bootcampJavaDeveloper.setNome("Bootcamp Java Developer");
        bootcampJavaDeveloper.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJavaDeveloper.getConteudos().add(cursoJava);
        bootcampJavaDeveloper.getConteudos().add(cursoPython);
        bootcampJavaDeveloper.getConteudos().add(mentoriaJava);

        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoriaJava);
        System.out.println("------------------------------------------------");

        Dev devJonathan = new Dev();
        devJonathan.setNome("Jonathan");
        devJonathan.inscreverBootcamp(bootcampJavaDeveloper);
        System.out.println("Conteúdos inscritos de Jonathan: " + devJonathan.getConteudosInscritos());
        devJonathan.progredir();
        devJonathan.progredir();

        System.out.println("------------------------------------------------");

        System.out.println("Conteúdos inscritos de Jonathan não concluídos: " + devJonathan.getConteudosInscritos());
        System.out.println("Contéudos concluídos de Jonathan: " + devJonathan.getConteudosConcluidos());
        System.out.println("XP: " + devJonathan.calcularTotalXp());
        
        System.out.println("------------------------------------------------");

        Dev devMaikao = new Dev();
        devMaikao.setNome("Maikao");
        devMaikao.inscreverBootcamp(bootcampJavaDeveloper);
        System.out.println("Conteúdos inscritos de Maikao: " + devMaikao.getConteudosInscritos());
        devMaikao.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos de Maikao não concluídos: " + devMaikao.getConteudosInscritos());
        System.out.println("Contéudos concluídos de Maikao: " + devMaikao.getConteudosConcluidos());
        System.out.println("XP: " +devMaikao.calcularTotalXp());

    }
}
