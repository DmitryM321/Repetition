package Robot;

public class Robot {
public static void main(String[] args) {
    //начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
    // В метод передано: toX == 3, toY == 0;
}
public static void moveRobot(Robot robot, int toX, int toY) {


    robot.stepForward(); // your implementation here
}

    public Direction getDirection() {
        return Direction.UP;
        // текущее направление взгляда
    }

    public int getX() {
        return 0;
        // текущая координата X
    }

    public int getY() {
        return 0;
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}

