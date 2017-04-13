//encapsulates the entire model

public class Facade{

    private DocRoot root;
    private String docName;
    private DocConstructor director = new DocConstructor(root);

    public void loadDocument(String filename){
        //load the document from the file
        this.docName = filename;
    }

    public void saveDocument(){
        if(this.docName==null){
            //get the user to name the document
        }
        //save document to docName
    }
}
