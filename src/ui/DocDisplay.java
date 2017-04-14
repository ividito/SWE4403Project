

public class DocDisplay extends DisplayBase{

    private JFrame parent;

    public DocDisplay(JFrame parent){
        this.parent = parent;
    }

    public void add(Component c){
        parent.add(c);
        //chain of responsibility to implement UI element addition
    }



}
