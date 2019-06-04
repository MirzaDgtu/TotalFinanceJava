package interfaces;

import java.io.IOException;
import java.util.Map;

public interface Shopble {
    public void add(String name);
    public void rename(Integer id, String name);
    public void delete(Integer id);
    public void getDetail(String name);
    public void getAll();
    public void toFile();
    public void readFile() throws IOException, ClassNotFoundException;
    public Map<Integer, String> toMap() throws IOException, ClassNotFoundException;

}
