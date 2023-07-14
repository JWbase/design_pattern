package disignpattern.strategy.robot;

public class Fly implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("날아서 이동");
    }
}
