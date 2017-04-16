package ui;

public class DocDisplay extends DisplayBase{

    private JFrame parent;
    private JEditorPane area;
    private ArrayList<Facade> observers = new ArrayList<Facade>();

    public DocDisplay(JFrame parent){
        this.parent = parent;
        draw();
    }

    public void add(Component c){
        parent.add(c);
        //chain of responsibility to implement UI element addition
    }

    public void draw(int x, int y){
        //make JEditorPane and add it to the JFrame
        area = new JEditorPane(x,y);
        parent.add(area, BORDERLAYOUT_Center);
    }

    public JEditorPane getArea(){
        return area;
    }

    public void displayModel(){
        //display model based on its representation (notably, for each char display char in font specified)
    }

    public void attach(Facade model){
        observers.add(model);
    }

    public void detach(Facade model){
        observers.remove(model);
    }

    public void notify(){
        for(Facade model : observers){
            model.update();
        }
    }
}
