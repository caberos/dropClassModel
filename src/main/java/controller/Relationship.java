package controller;

public class Relationship {
    private ClassModel classRelationShip;
    private String type;

    public ClassModel getClassRelationShip() {
        return classRelationShip;
    }

    public void setClassRelationShip(ClassModel classRelationShip) {
        this.classRelationShip = classRelationShip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Relationship(ClassModel classRelationShip, String type) {
        this.classRelationShip = classRelationShip;
        this.type = type;
    }
}
