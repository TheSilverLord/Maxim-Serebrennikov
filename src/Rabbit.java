import java.awt.image.BufferedImage;

public abstract class Rabbit implements IBehaviour
{
    int x;
    int y;
    long birthtime;
    int ID;
    int orientation;
    char type;

    public abstract BufferedImage getImage();
    public abstract void setBirthtime(long time);
    public abstract void setID(int id);
    public abstract long getLifetime();
}
