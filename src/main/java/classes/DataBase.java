package classes;

import interfaces.Shopble;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class DataBase implements Shopble, Serializable {
    private Map<Integer, String> shopBase = new HashMap<Integer, String>();
    private File file = new File("ShopBase.txt");

    public DataBase() throws IOException, ClassNotFoundException {
        shopBase.put(1,"Океан");
        shopBase.put(2,"Жар Птица");
        shopBase.put(3,"ДНС");
        toFile();

    }


    public void add(String name) {
        Integer maxId = null;
        final Set<Map.Entry<Integer, String>> mapValues = shopBase.entrySet();
        final int maplength = mapValues.size();
        final Map.Entry<Integer,String>[] test = new Map.Entry[maplength];
        mapValues.toArray(test);


        if (test[maplength-1].getKey() == null){
            maxId = 1;
        } else {
            maxId = (Integer) test[maplength-1].getKey() +1; // получение последнего ключа из коллекции Map
        }
        shopBase.put(maxId, name);
        System.out.println("Новый магазин успешно добавлен");


    }

    public void rename(Integer id, String name) {
        if (shopBase.containsKey((Object) id)){
            shopBase.replace(id, name);
            System.out.println("Магазин успешно переименован");
        }


    }

    public void delete(Integer id) {
        if (shopBase.containsKey((Object) id)){
            shopBase.remove((Object) id);
            System.out.println("Магазин успешно удален!");
        }
    }

    @Override
    public int getCountShop() {
        return shopBase.size();
    }

    @Override
    public void getDetail(String name) {
        if (shopBase.containsValue((Object) name)){
            System.out.println(shopBase.get((Object) name));
        }
    }

    @Override
    public void getAll() {
        System.out.println(shopBase.entrySet());
    }

    @Override
    public void toFile() {

        try {
            if (!file.exists()){
                OutputStream out =  new FileOutputStream(file);
                ObjectOutputStream obs = new ObjectOutputStream(out);
                obs.writeObject(shopBase);
                out.close();
                obs.close();
                System.out.println("Файл " + file.getName() + " создан. Расположен по адресу " + file.getAbsoluteFile());
            }// else {
              //  System.out.println("Файл " + file.getName() +" уже существует");
          //  }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readFile() throws IOException, ClassNotFoundException {


        InputStream inStr = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(inStr);
        Object obj = ois.readObject();
        System.out.println(obj.toString() + "\n");
        ois.close();
        inStr.close();
    }

    @Override
    public Map<Integer, String> toMap() throws IOException, ClassNotFoundException {
        InputStream ins = new FileInputStream(file);
        ObjectInputStream obs = new ObjectInputStream(ins);

        return (Map<Integer, String>) obs.readObject();
    }
 }
