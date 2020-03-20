public interface AbstractFactory
{
    Ordinary_Rabbit createOrdinary();
    Ordinary_Rabbit createOrdinary(int x, int y);

    Albino createAlbino();
    Albino createAlbino(int x, int y);
}
