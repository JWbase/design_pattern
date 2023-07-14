package disignpattern.strategy.duck;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("고무 소리 꾁꾁");
    }
}
