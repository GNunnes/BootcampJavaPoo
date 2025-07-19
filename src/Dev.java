import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    // Método para inscrever o Dev em um Bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Adiciona todos os conteúdos do Bootcamp na lista de inscritos do Dev
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // Adiciona o Dev na lista de inscritos do Bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    // Método para o Dev progredir no Bootcamp: finaliza o primeiro conteúdo inscrito
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    // Método para calcular XP total dos conteúdos concluídos
    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
