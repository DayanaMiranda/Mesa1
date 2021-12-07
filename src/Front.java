public class Front extends Curso {
    private String nomeDoCurso = "FrontEnd";
    private int cargaHoraria = 16;
    private int valorHora = 1000;
    private int duracaoCurso = 2;
    private int valorTotal;

    public Front(String nomeDoCurso, int cargaHoraria, int valorHora, int duracaoCurso, int valorTotal, String nomeDoCurso1, int cargaHoraria1, int valorHora1, int duracaoCurso1, int valorTotal1) {
        super(nomeDoCurso, cargaHoraria, valorHora, duracaoCurso, valorTotal);
        this.nomeDoCurso = nomeDoCurso1;
        this.cargaHoraria = cargaHoraria1;
        this.valorHora = valorHora1;
        this.duracaoCurso = duracaoCurso1;
        this.valorTotal = valorTotal1;
    }
}

