package Robot;

public class SimpleRobotConnection implements RobotConnection {
    private int x;
    private int y;

    public SimpleRobotConnection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRobotTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void close() {
        // Логика закрытия соединения
    }
}

  class SimpleRobotConnectionManager implements RobotConnectionManager {
    private int x;
    private int y;

    public SimpleRobotConnectionManager(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public RobotConnection getConnection() {
        return new SimpleRobotConnection(x, y);
    }
}

  class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) {
        super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}