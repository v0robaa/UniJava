package ru.mirea.lab24.n2;

public class main {
    public static void main(String[] args)
    {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();

        Client client = new Client();
        AbstractChairFactory victorianChair = victorianChairFactory.createChair();
        client.Sit(victorianChair);

        AbstractChairFactory multifunctionalChair = multifunctionalChairFactory.createChair();
        client.Sit(multifunctionalChair);

        AbstractChairFactory magicChair = magicChairFactory.createChair();
        client.Sit(magicChair);
    }
}
