import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ordinary_Rabbit extends Rabbit implements IBehaviour
{
    public Image image;

    public Ordinary_Rabbit()
    {
        try
        {
            image = ImageIO.read(new File("Ordinary.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public Ordinary_Rabbit(int x, int y)
    {
        try
        {
            image = ImageIO.read(new File("Ordinary.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
