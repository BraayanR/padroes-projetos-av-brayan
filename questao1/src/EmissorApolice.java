public abstract class EmissorApolice {
    protected abstract Apolice criarApolice(String segurado, double valorBase);

    public final void emitir(String segurado, double valorBase) {
        Apolice apolice = criarApolice(segurado, valorBase);
        double premio = apolice.calcularPremioMensal();
        System.out.println("=== Resumo da Apólice ===");
        System.out.println("Linha de produto: " + apolice.getLinhaProduto());
        System.out.println("Segurado: " + apolice.getSegurado());
        System.out.printf("Prêmio mensal: R$ %.2f%n", premio);
        System.out.println("Documentos: " + apolice.getDocumentosExigidos());
        System.out.println();
    }
}