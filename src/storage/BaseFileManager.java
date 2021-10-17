package storage;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public abstract class BaseFileManager<T>  {
    abstract void writeList(List<T> list) ;
    abstract List<T> readList() ;
}
