package classes;

import interfaces.CorrNacl;
import interfaces.CreateNacl;
import interfaces.ViewNacl;

import java.io.IOException;
import java.util.Map;

public abstract class Nacl {
    CreateNacl createNacl;
    CorrNacl corrNacl;
    ViewNacl viewNacl;


    public void createNaclPerform(Map<Integer, String> shopBase, Double sum) throws IOException, ClassNotFoundException {
        createNacl.create(shopBase, sum);
    }

}
