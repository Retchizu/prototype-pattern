public class DocumentRegistry {

  private PdfDocument pdfDocument;
  private TextDocument textDocument;
  private SpreadsheetDocument spreadsheetDocument;

  public DocumentRegistry(PdfDocument pdfDocument, TextDocument textDocument, SpreadsheetDocument spreadsheetDocument) {
    this.pdfDocument = pdfDocument;
    this.textDocument = textDocument;
    this.spreadsheetDocument = spreadsheetDocument;
  }

  public PdfDocument createPdfCopy() {
    return (PdfDocument) pdfDocument.clone();
  }

  public TextDocument createTextCopy() {
    return (TextDocument) textDocument.clone();
  }

  public SpreadsheetDocument createSheetCopy() {
    return (SpreadsheetDocument) spreadsheetDocument.clone();
  }
}