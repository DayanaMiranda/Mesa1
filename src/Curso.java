public abstract class Curso {
    private String nomeDoCurso;
    private int cargaHoraria;
    private int valorHora;
    private int duracaoCurso;
    private int valorTotal;


    public Curso(String nomeDoCurso, int cargaHoraria, int valorHora, int duracaoCurso, int valorTotal) {
        this.nomeDoCurso = nomeDoCurso;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.duracaoCurso = duracaoCurso;
        this.valorTotal = valorTotal;
    }


    public int calcularValorTotal() {
        valorTotal = cargaHoraria * valorHora * duracaoCurso;
        return valorTotal;
    }
}
