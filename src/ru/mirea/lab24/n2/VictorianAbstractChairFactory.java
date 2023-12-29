package ru.mirea.lab24.n2;

class VictorianAbstractChairFactory implements AbstractChairFactory {
    @Override
    public void sitOn()
    {
        System.out.println("Сел на стул викторианской эпохи");
    }
}
class MultifunctionalAbstractChairFactory implements AbstractChairFactory {
    @Override
    public void sitOn() {
        System.out.println("Сел на многофункциональный стул");
    }
}
class MagicAbstractChairFactory implements AbstractChairFactory {
    @Override
    public void sitOn() {
        System.out.println("Сел на волшебный стул");
    }
}
class VictorianChairFactory extends ChairFactory {
    @Override
    AbstractChairFactory createChair() {
        return new VictorianAbstractChairFactory();
    }
}

class MultifunctionalChairFactory extends ChairFactory {
    @Override
    AbstractChairFactory createChair() {
        return new MultifunctionalAbstractChairFactory();
    }
}

class MagicChairFactory extends ChairFactory {
    @Override
    AbstractChairFactory createChair() {
        return new MagicAbstractChairFactory();
    }
}