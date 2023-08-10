package Robot;

public class Robot {
    private Direction direction;
    private int x;
    private int y;

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        int toX = 3;
        int toY = 0;
        moveRobot(robot, toX, toY);
        System.out.println(robot.getX()); // Вывод координат робота после выполнения метода
        System.out.println(robot.getY());

    }   

    public static void moveRobot(Robot robot, int toX, int toY) {
     while (robot.getX() != toX || robot.getY() != toY){
        if (robot.getX() < toX){

        }

     }

    public static Direction getDirection(Direction up) {
        return Direction;
        // текущее направление взгляда
    }

    public int getX() {
        return x;
        // текущая координата X
    }

    public int getY() {
        return y;
        // текущая координата Y
    }

    public void turnLeft() {

        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        if (Direction == Direction.RIGHT) {
            x = x + 1;
        }
        if (Direction == Direction.UP) {
            y = y + 1;
        }

        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
