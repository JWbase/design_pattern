package disignpattern.decorationpattern;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public abstract String getDescription();
}
