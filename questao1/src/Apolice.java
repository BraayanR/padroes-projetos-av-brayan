public abstract class Apolice {
    protected final String segurado;
    protected final double valorBase;

    public Apolice(String segurado, double valorBase) {
        this.segurado = segurado;
        this.valorBase = valorBase;
    }

    public abstract String getLinhaProduto();
    public abstract double calcularPremioMensal();
    public abstract String getDocumentosExigidos();

    public String getSegurado() { return segurado; }
}
