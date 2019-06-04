package classes;

import classes.action.IncomeCreate;

import java.io.IOException;

public class Income extends Nacl {
    public Income() throws IOException, ClassNotFoundException {
        createNacl = new IncomeCreate();
    }
}
