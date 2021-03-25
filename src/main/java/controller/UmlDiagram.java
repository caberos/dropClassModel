package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class UmlDiagram {
    private List<ClassModel> classes;

    public UmlDiagram() {
        this.classes = new ArrayList<>();
    }

    public void dropClass(ClassModel classModel) {
        classes.add(classModel);
    }

    public List<ClassModel> getClasses() {
        return classes;
    }

    public List<String> saveDiagramClass() {
        List<String> res = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        Gson gson = new Gson();
        for (ClassModel model : classes) {
            gson=new GsonBuilder().setPrettyPrinting().create();
            res.add(gson.toJson(model));
        }
        return res;
    }
}
