package controller;

import java.util.List;

public class OperationFactory {
    public static Operation create(String name, String output, List<Attribute> input) {
        return new Operation(name,output,input);
    }
}
