public class ProcessedDocument {
  public static void main(String[] args) {
      PdfDocument pdf = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
      TextDocument text = new TextDocument("meeting_notes.txt", "UTF-8", 250);
      SpreadsheetDocument sheet = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);

      DocumentRegistry registry = new DocumentRegistry(pdf, text, sheet);

      PdfDocument pdfClone = registry.createPdfCopy();
      TextDocument textClone = registry.createTextCopy();
      SpreadsheetDocument sheetClone = registry.createSheetCopy();

      System.out.println();
      pdfClone.open();
      System.out.println();
      textClone.open();
      System.out.println();
      sheetClone.open();
  }
}