
public class RabbitFactory implements AbstractFactory
{
    @Override
    public Ordinary_Rabbit createOrdinary()
    {
        return new Ordinary_Rabbit();
    }

    @Override
    public Ordinary_Rabbit createOrdinary(int x, int y)
    {
        return new Ordinary_Rabbit(x, y);
    }

    @Override
    public Albino createAlbino()
    {
        return new Albino();
    }

    @Override
    public Albino createAlbino(int x, int y)
    {
        return new Albino(x, y);
    }
}
