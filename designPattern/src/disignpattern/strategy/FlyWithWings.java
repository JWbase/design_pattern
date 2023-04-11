package disignpattern.strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("나는 날개가 있어");
    }
}
