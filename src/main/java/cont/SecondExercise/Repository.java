package cont.SecondExercise;

import java.util.ArrayList;
import java.util.List;

public class Repository <T> {
    List<T> list;

    public Repository() {
        this.list = new ArrayList<>();
    }
    public void add(T t) {
        list.add(t);
    }
    public void remove(int id) {
        list.remove(id);
    }
    public T serach(int id) {
        return list.get(id);
    }
    public List<T> getList() {
        return list;
    }
}
