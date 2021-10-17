package control;

import java.io.IOException;
import java.util.List;

public interface IGeneralManager<T> {
    List<T> findAll();
    void saveList(T t) throws IOException;
    void removeByIndex(int index) throws IOException;
    void updateByIndex(int index, T t) throws IOException;
    T searchById(String id);
    T searchByName(String name);
    void showAllList();
}
