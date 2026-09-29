public class EmissorAuto extends EmissorApolice {
    protected Apolice criarApolice(String s, double v) { return new ApoliceAuto(s, v); }
}