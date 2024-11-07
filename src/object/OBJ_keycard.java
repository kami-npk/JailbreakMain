package object;
import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_keycard extends SuperObject{
    public OBJ_keycard(){
        name = "keycard";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/keycard.png"));
        }catch(IOException e){
            e.printStackTrace();    
        }
        
    }
}
