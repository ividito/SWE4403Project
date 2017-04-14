package ui;

public abstract class Decorator implements DisplayBase{

    public Decorator(DisplayBase target){
        this.target = target;
    }

    public void draw(){
        target.draw();
    }

    public final DisplayBase revoke(){ //revoke decoration
        return target;
    }
}
