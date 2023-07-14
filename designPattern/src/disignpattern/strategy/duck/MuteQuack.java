package disignpattern.strategy.duck;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("나는 아무소리도 못내");
    }
}
