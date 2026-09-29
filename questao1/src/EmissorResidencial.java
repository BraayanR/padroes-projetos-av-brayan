public class EmissorResidencial extends EmissorApolice {
    protected Apolice criarApolice(String s, double v) { return new ApoliceResidencial(s, v); }
}