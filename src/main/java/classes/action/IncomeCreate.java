package classes.action;

import interfaces.CreateNacl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class IncomeCreate implements CreateNacl {
    private Map<Integer, Double> naclIncome = new HashMap<>();

    @Override
    public void create(Map<Integer, String> shopBase, Double sum) throws IOException, ClassNotFoundException {
        System.out.println("Создать накладную -> Выручка");

        System.out.println("|-------------------------------------|");
        System.out.println("|Номер|-------Магазин-------|--Сумма--|");
        System.out.println("|-------------------------------------|");
        for (Map.Entry<Integer, String> entry : shopBase.entrySet()){
            addSum(entry.getKey(), sum);
            System.out.format( "|%-5d|%-21s| %-8s|\n", entry.getKey(), entry.getValue(), naclIncome.get(entry.getKey()));
            System.out.println("|-----|---------------------|---------|");
        }
    }

    public void addSum(Integer key ,Double sum){
        naclIncome.put(key, sum);
    }
}
