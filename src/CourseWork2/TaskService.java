package CourseWork2;

import CourseWork2.exeption.TaskNotFoundExeption;
import CourseWork2.task.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<Integer, Task> taskMap;
    private Collection<Task> removesTask;
    
    public TaskService() {
        this.taskMap = new HashMap<Integer, Task>();
        this.removesTask = new ArrayList<>();
    }

    public   void add(Task task){
    taskMap.put(task.getId(), task);
    }

    public void remove(int id) throws TaskNotFoundExeption {
        if (taskMap.containsKey(id)) {
            Task removedTask = taskMap.get(id);
            taskMap.remove(id);
            removesTask.add(removedTask);
        } else {
            throw new TaskNotFoundExeption();
        }
    }
    public Collection<Task> getAllByDay(LocalDateTime localDateTime){
        ArrayList<Task> list = new ArrayList();
        for (Task task : taskMap.values()) {
            if (task.getDataTime().toLocalDate().equals(localDateTime.toLocalDate())) {
                list.add(task);
            }
        }
        return list;
    }
    public Collection<Task> getRemovedasks(){
         
        return removesTask;
    }
    public Task updateDiscription(int id, String description){
        if (taskMap.containsKey(id)) {
            Task task = taskMap.get(id);
            task.setDescription(description);
            return task;
        }
        return null;
    }

    @Override
    public String toString() {
        return "TaskService [taskMap=" + taskMap + ", removesTask=" + removesTask + "]";
    }

    
}
            
 