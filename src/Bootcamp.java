import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();
    private final Set<Dev> devsInscritos = new LinkedHashSet<>();

    // Getters e setters

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

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
