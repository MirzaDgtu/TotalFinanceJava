package classes.action;

import interfaces.CreateNacl;

import java.io.IOException;
import java.util.Map;

public class ExpensesCreate implements CreateNacl {

    @Override
    public void create(Map<Integer, String> shopBase, Double sum) throws IOException, ClassNotFoundException {
        System.out.println("Накладная Расходы");

    }
}
