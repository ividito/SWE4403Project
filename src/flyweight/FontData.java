

//Flyweight for fonts
public class FontData{
    private final Font font;
    private final FontMetric metric;

    public FontData(Font font){
        this.font = font;
    }

    public Font getFont(){
        return this.font;
    }

    public void setFont(Font newFont){
        this.font = newFont;
    }

    public void setMetric(FontMetric metric){
        this.metric = metric;
    }

    public FontMetric getMetric(){
        return this.metric;
    }
}
