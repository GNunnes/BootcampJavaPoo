import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Aprenda Java na prática");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JavaScript");
        cursoJS.setDescricao("Aprenda JavaScript do básico");
        cursoJS.setCargaHoraria(4);

        // Criando Mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Tire dúvidas sobre Java");
        mentoriaJava.setData(LocalDate.now());

        // Criando Bootcamp e adicionando conteúdos
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoriaJava);

        // Criando Dev Camila e inscrevendo no bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP total Camila: " + devCamila.calcularTotalXp());

        System.out.println("---------------------------------");

        // Criando Dev João e inscrevendo também
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP total João: " + devJoao.calcularTotalXp());
    }
}
