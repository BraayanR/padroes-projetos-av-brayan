public class FabricaBrasil implements FabricaMarketplace {
    public DocumentoFiscal criarDocumentoFiscal() { return new NFe(); }
    public Pagamento criarPagamento() { return new Pix(); }
    public Etiqueta criarEtiqueta() { return new EtiquetaCorreios(); }
}