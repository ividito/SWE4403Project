
import java.util.Map;

public class FlyweightPool{

    private Map<Font,FontData> fontMap;// = new Map<Font,FontData>();

    public FontData getFontData(Font font){
        if (fontMap.containsKey(font)){
            return fontMap.get(font);
        }
        else{
            fontMap.put(font, new FontData(font));
            return fontMap.get(font);
        }
    }
}
