package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_notebed2 extends SuperObject{
    public OBJ_notebed2(){
        name = "NoteBed";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/NoteBed_1.png"));
        }catch(IOException e){
            e.printStackTrace();    
        }
        
    }
}
