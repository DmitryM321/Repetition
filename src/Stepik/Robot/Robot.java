package Robot;

public class Robot {
    private static Direction direction; // создаем поле энама
    private int x; // поле начальное по оси Х
    private int y; // поле начальное по оси У

    public Robot(Direction direction, int x, int y) { // создаем конструктор
        Robot.direction = direction; // направление робота
        this.x = x; // текущая точка по оси х
        this.y = y; // текущая точка по оси у
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0); // новый объект Robot с заданным положением и направлением
        int toX = 3; // точка на оси х куда надо попасть
        int toY = 0; // точка на оси у куда надо попасть
        moveRobot(robot, toX, toY); // вызов метода куда мы передаем robot(направление и текущее положение) и 2
                                    // точки направлнеия
        System.out.println(robot.getX()); // Вывод координат робота после выполнения метода
        System.out.println(robot.getY()); // Вывод координат робота после выполнения метода
    }

    public static void moveRobot(Robot robot, int toX, int toY) { // создание метода
        int currentX = robot.getX(); // создание переменной текущей точки по оси х
        int currentY = robot.getY(); // создание переменной текущей точки по оси у

        while (currentX != toX || currentY != toY) { // пока текущее положение не равно заданному по осям х и у
            if (currentX < toX) { // если по оси х текущее меньше заданного
                while (robot.getDirection() != Direction.RIGHT) { // пока положение робота не равно направо
                    robot.turnRight(); // робот совершает поворот направо
                }
                robot.stepForward(); // делается шаг
                currentX++; // текущее значение увеличивается на 1
            } else if (currentX > toX) { // если текущее положение больше заданного
                while (robot.getDirection() != Direction.LEFT) { // // пока положение робота не равно налево
                    robot.turnRight(); // робот совершает поворот налево
                }
                robot.stepForward(); // делается шаг
                currentX--; // текущее значение уменьшается на 1
            } else if (currentY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentY++;
            } else if (currentY > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentY--;
            }
        }
    }

    private Direction getDirection() { // возвращает текущее направление робота.
        return this.direction;
    }

    public int getX() { // возвращает начальное положение по оси х
        return x;
    }

    public int getY() { // возвращает начальное положение по оси х
        return y;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
    }
}
