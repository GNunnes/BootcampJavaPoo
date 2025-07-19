public abstract class Conteudo {

    protected String titulo;
    protected String descricao;

    // Método abstrato que as subclasses vão implementar para calcular XP
    public abstract double calcularXP();

    // Getters e Setters (Encapsulamento)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
