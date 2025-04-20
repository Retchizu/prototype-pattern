public class SpreadsheetDocument implements Document {
  private String spreadSheetName;
  private int rowCount;
  private int columnCount;

  public SpreadsheetDocument(String spreadSheetName, int rowCount, int columnCount) {
    this.spreadSheetName = spreadSheetName;
    this.rowCount = rowCount;
    this.columnCount = columnCount;
    System.out.println("Creating a Spreadsheet Document prototype.");
  }

  public String getSpreadSheetName() {
    return spreadSheetName;
  }

  public void setSpreadSheetName(String spreadSheetName) {
    this.spreadSheetName = spreadSheetName;
  }

  public int getRowCount() {
    return rowCount;
  }

  public void setRowCount(int rowCount) {
    this.rowCount = rowCount;
  }

  public int getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(int columnCount) {
    this.columnCount = columnCount;
  }

  @Override
  public Document clone() {
    try {
      return (SpreadsheetDocument) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Clone not supported", e);
    }
  }

  @Override
  public void open() {
    System.out.println(
        "Opening Spreadsheet Document: " + spreadSheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    System.out.println(
        "Type: " + getType() + ", Name: " + spreadSheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
  }

  @Override
  public String getType() {
    return "Spreadsheet";
  }

}
