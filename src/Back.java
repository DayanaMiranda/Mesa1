public class Back extends Curso {
    private String nomeDoCurso = "BackEnd";
    private int cargaHoraria = 20;
    private int valorHora = 900;
    private int duracaoCurso = 2;
    private int valorTotal;

    public Back(String nomeDoCurso, int cargaHoraria, int valorHora, int duracaoCurso, int valorTotal, String nomeDoCurso1, int cargaHoraria1, int valorHora1, int duracaoCurso1, int valorTotal1) {
        super(nomeDoCurso, cargaHoraria, valorHora, duracaoCurso, valorTotal);
        this.nomeDoCurso = nomeDoCurso1;
        this.cargaHoraria = cargaHoraria1;
        this.valorHora = valorHora1;
        this.duracaoCurso = duracaoCurso1;
        this.valorTotal = valorTotal1;
    }

    @Override
    public int calcularValorTotal() {
        return super.calcularValorTotal();
    }
}
