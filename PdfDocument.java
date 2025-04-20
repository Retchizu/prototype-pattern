public class PdfDocument implements Document {
  private String fileName;
  private String author;
  private int pageCount;
  private String name;

  public PdfDocument(String fileName, String author, int pageCount) {
    this.fileName = fileName;
    this.author = author;
    this.pageCount = pageCount;
    System.out.println("Creating a PDF Document prototype.");
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Document clone() {
    try {
      return (PdfDocument) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Clone not supported", e);
    }
  }

  @Override
  public void open() {
    System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
  }

  @Override
  public String getType() {
    return "PDF";
  }

}
