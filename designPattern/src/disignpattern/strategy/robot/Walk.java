package disignpattern.strategy.robot;

public class Walk implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("걸어서 이동");
    }
}
