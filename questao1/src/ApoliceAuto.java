public class ApoliceAuto extends Apolice {
    public ApoliceAuto(String segurado, double valorVeiculo) { super(segurado, valorVeiculo); }
    public String getLinhaProduto() { return "Auto"; }
    public double calcularPremioMensal() { return valorBase * 0.08 / 12; }
    public String getDocumentosExigidos() { return "CNH e CRLV"; }
}