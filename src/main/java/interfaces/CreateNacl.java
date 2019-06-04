package interfaces;

import java.io.IOException;
import java.util.Map;

public interface CreateNacl {
    public void create(Map<Integer, String> shopBase, Double sum) throws IOException, ClassNotFoundException;
}
