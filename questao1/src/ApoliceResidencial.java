public class ApoliceResidencial extends Apolice {
    public ApoliceResidencial(String segurado, double valorImovel) { super(segurado, valorImovel); }
    public String getLinhaProduto() { return "Residencial"; }
    public double calcularPremioMensal() { return valorBase * 0.015 / 12; }
    public String getDocumentosExigidos() { return "Escritura ou contrato de locação"; }
}