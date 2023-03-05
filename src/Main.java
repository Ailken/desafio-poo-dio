import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDesricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDesricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("desccrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAilken = new Dev();
        devAilken.setNome("Ailken");
        devAilken.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ailken" + devAilken.getConteudosInscritos());
        devAilken.progredir();
        devAilken.progredir();
        System.out.println("- ");
        System.out.println("Conteúdos Inscritos Ailken" + devAilken.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ailken" + devAilken.getConteudosConcluidos());
        System.out.println("XP: " + devAilken.calcularTotalXp());

        System.out.println("--------");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rafael" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("- ");
        System.out.println("Conteúdos inscritos Rafael" + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael" + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXp());


    }
}