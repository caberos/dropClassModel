package controller;

import java.util.ArrayList;
import java.util.List;

public class ClassModel {
    private String className;
    private List<Attribute> attributes;
    private List<Operation> operations;
    private Relationship relationship;

    public ClassModel(String className) {
        this.className = className;
        attributes = new ArrayList<>();
        operations = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public Relationship getRelation() {
        return relationship;
    }

    public void setRelation(Relationship relation) {
        this.relationship = relation;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public void addAttribute(Attribute attribute) {
        attributes.add(attribute);
    }
}
