package disignpattern.strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("나는 못 날아");
    }
}
