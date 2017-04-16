

public class ScrollDecorator extends Decorator{

    public ScrollDecorator(DisplayBase target){
        this.target = target;
    }

    public void draw(){
        target.draw();
        addedFunction();
    }

    public final DisplayBase revoke(){ //revoke decoration
        return target;
    }

    private void addedFunction(){
        JScrollPane scrollBar = new JScrollPane(target.getArea(),JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        target.add(scrollBar);
    }
}
