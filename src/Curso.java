public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return cargaHoraria * 10d;
    }

    // Getter e Setter para cargaHoraria
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}