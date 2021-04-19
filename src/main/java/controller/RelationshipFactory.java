package controller;

public class RelationshipFactory {
    public static Relationship create(ClassModel relationShip, String name) {
        return new Relationship(relationShip,name);
    }
}
