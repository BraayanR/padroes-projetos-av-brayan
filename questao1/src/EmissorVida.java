public class EmissorVida extends EmissorApolice {
    protected Apolice criarApolice(String s, double v) { return new ApoliceVida(s, v); }
}