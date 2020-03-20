import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class Habitat
{
    public static void createGUI()
    {
        Image image;
        try
        {
            image = ImageIO.read(new File("Habitat.jpg"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Rabbits Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Rabbits are fucking hard and fast", JLabel.CENTER);
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(1280, 720));

        frame.pack();
        frame.setVisible(true);
    }

    public static void Update()
    {
        AbstractFactory factory = new RabbitFactory();
        Albino a = factory.createAlbino();
        Ordinary_Rabbit o = factory.createOrdinary();

    }
}
