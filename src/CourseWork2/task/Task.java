package CourseWork2.task;

import CourseWork2.enums.Type;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    private static int idGenerator = 0;
    private String title;
    private Type type;
    private int id;
    private String description;
    private LocalDateTime dataTime;

    public Task(String title, Type type, String description, LocalDateTime dataTime) {
        this.title = title;
        this.type = type;
        this.id = idGenerator++;
        this.description = description;
        this.dataTime = dataTime;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Task.idGenerator = idGenerator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && Objects.equals(type, task.type) && Objects.equals(dataTime, task.dataTime) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, id, dataTime, description);
    }

    @Override
    public String toString() {
        return "Задача: " + title +
                ", type: " + type +
                ", id: " + id +
                ", dataTime " + dataTime +
                ", описание " + description;
    }
}
