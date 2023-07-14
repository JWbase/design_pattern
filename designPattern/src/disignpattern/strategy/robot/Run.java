package disignpattern.strategy.robot;

public class Run implements MoveStrategy{

    @Override
    public void move() {
        System.out.println("뛰어서 이동");
    }
}
