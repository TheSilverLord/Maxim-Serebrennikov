import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Albino extends Rabbit implements IBehaviour
{
    public Image image;

    public Albino()
    {
        try
        {
            image = ImageIO.read(new File("Albino.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public Albino(int x, int y)
    {
        try
        {
            image = ImageIO.read(new File("Albino.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
