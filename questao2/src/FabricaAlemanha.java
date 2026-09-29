public class FabricaAlemanha implements FabricaMarketplace {
    public DocumentoFiscal criarDocumentoFiscal() { return new VatInvoice(); }
    public Pagamento criarPagamento() { return new SepaDirectDebit(); }
    public Etiqueta criarEtiqueta() { return new EtiquetaDeutschePost(); }
}