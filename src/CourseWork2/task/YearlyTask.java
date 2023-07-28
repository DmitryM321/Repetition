package CourseWork2.task;

import CourseWork2.enums.Type;
import CourseWork2.exeption.IncorrectArgumentExeption;

import java.time.LocalDateTime;

public class YearlyTask extends Task{

    public YearlyTask(String title, Type type, String description, LocalDateTime dataTime) throws IncorrectArgumentExeption{
        super(title, type, description, dataTime);
    }
}
