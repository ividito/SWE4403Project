package model;

//requires that the document be converted to its XML String format in order to be saved as Memento

public class DocumentMemento implements Memento<String> {
  private String documentState;

  public DocumentMemento(String document) {
    this.documentState = document;
  }

  @Override
  public String getState() {
    return documentState;
  }

  @Override
  public void setState(String state) {
    documentState = state;
  }
}
