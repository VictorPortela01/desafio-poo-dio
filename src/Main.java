import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jose"+devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos inscritos Jose"+devJose.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Jose"+devJose.getConteudosConcluidos());
        System.out.println("----------");
        System.out.println("XP:" + devJose.calcularTotalXp());
        
        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Victor:"+ devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Victor:"+ devVictor.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Victor:"+ devVictor.getConteudosConcluidos());
        System.out.println("XP:" + devVictor.calcularTotalXp());


        

    }    
}