public class Checkout {
    private final FabricaMarketplace fabrica;

    public Checkout(FabricaMarketplace fabrica) { this.fabrica = fabrica; }

    public void finalizarPedido(String pais) {
        DocumentoFiscal doc = fabrica.criarDocumentoFiscal();
        Pagamento pag = fabrica.criarPagamento();
        Etiqueta et = fabrica.criarEtiqueta();
        System.out.println("=== Relatório do pedido (" + pais + ") ===");
        System.out.println("Documento fiscal: " + doc.descrever());
        System.out.println("Pagamento: " + pag.descrever());
        System.out.println("Etiqueta: " + et.descrever());
        System.out.println();
    }
}