package CourseWork2.task;

import CourseWork2.enums.Type;
import CourseWork2.exeption.IncorrectArgumentExeption;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task{
        public DailyTask(String title, Type type, String description, LocalDateTime dataTime) throws IncorrectArgumentExeption {
            super(title, type, description, dataTime);
        }
        
      @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.isEqual(getDataTime().toLocalDate()) 
        || localDate.isAfter(getDataTime().toLocalDate());
    }
}