//director class for building a document model

public class DocConstructor{

    private DocBuilder builder = DocBuilder.getInstance();
    public DocConstructor(){}
    private DocRoot root;


    public void constructNew(String docName){ //TODO type?
        docName = docName+=".swe";
        //etc
    }
}
