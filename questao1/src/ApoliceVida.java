public class ApoliceVida extends Apolice {
    public ApoliceVida(String segurado, double capital) { super(segurado, capital); }
    public String getLinhaProduto() { return "Vida"; }
    public double calcularPremioMensal() { return valorBase * 0.03 / 12; }
    public String getDocumentosExigidos() { return "Documento de identidade e CPF"; }
}