



public class DocBuilder{

    private DocComponent root; //root of the object being acted upon
    private DocBuilder(DocComponent root){
        this.root = root;
    }
    private DocBuilder instance;

    public DocBuilder getInstance(DocComponent root){
        if (instance==null){
            instance = new DocBuilder(root);
        }
        else this.root = root; //TODO does this even work
        return instance;
    }

    public Row buildRow(){
//TODO
    }

    public DocRoot buildDoc(){
//TODO
    }

    public Character buildChar(){
//TODO
    }
}
