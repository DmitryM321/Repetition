package Stepik;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Loggers {
    public static void main(String[] args) {
        configureLogging();
        Logger logger = Logger.getLogger(Loggers.class.getName());
        logger.info("Hello, World!"); // пример вывода сообщения в лог
    }
private static void configureLogging() {
    Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
    loggerA.setLevel(Level.ALL); // принимает сообщения всех уровней

    Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
    loggerB.setLevel(Level.WARNING); // принимает только сообщения уровня WARNING и серьезнее

    Logger loggerC = Logger.getLogger("org.stepic.java");
    loggerC.setUseParentHandlers(false); // отключаем передачу сообщений родительским обработчикам

    Handler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.ALL); // логгер C выводит все сообщения в консоль

    Formatter xmlFormatter = new XMLFormatter();
    consoleHandler.setFormatter(xmlFormatter); // форматируем сообщения в формат XML

    loggerC.addHandler(consoleHandler); // добавляем обработчик к логгеру C
}
}