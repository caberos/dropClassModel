package controller;

import java.util.List;

public class Operation {
    private String name;
    private String outputType;
    private List<Attribute> inputVariables;

    public Operation(String name, String outputType,
                     List<Attribute> inputVariables) {
        this.name = name;
        this.outputType = outputType;
        this.inputVariables = inputVariables;
    }

    public String getName() {
        return name;
    }

    public String getOutputType() {
        return outputType;
    }

    public List<Attribute> getInputVariables() {
        return inputVariables;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public void setInputVariables(List<Attribute> inputVariables) {
        this.inputVariables = inputVariables;
    }
}
