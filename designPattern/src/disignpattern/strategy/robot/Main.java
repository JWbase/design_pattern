package disignpattern.strategy.robot;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(new Run());
        robot.move();
        robot.setMoveStrategy(new Fly());
        robot.move();
    }
}
