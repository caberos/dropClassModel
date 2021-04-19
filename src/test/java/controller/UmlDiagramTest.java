package controller;

import com.google.gson.Gson;
import junit.framework.TestCase;

public class UmlDiagramTest extends TestCase {

    public void testSaveDiagramClass() {
        ClassModel classModel1 = new ClassModel("test1");
        ClassModel classModel2 = new ClassModel("test2");
        Attribute nameAttribute = new Attribute("name","String");
        Attribute nameType = new Attribute("type","String");
        Attribute nameAttribute1 = new Attribute("name","String");
        Attribute nameType1 = new Attribute("type","String");
        classModel1.addAttribute(nameAttribute);
        classModel1.addAttribute(nameType);
        classModel2.addAttribute(nameAttribute1);
        classModel2.addAttribute(nameType1);
        UmlDiagram uml = new UmlDiagram();
        uml.dropClass(classModel1);
        uml.dropClass(classModel2);
        System.out.println(uml.saveDiagramClass());
        String expected = "[{'className': 'test1',\n" +
                "  'attributes': [{\n" +
                "      'name': 'name',\n" +
                "      'type': 'String'},{\n" +
                "      'name': 'type',\n" +
                "      'type': 'String'}],\n" +
                "  'operations': []}, {\n" +
                "  'className': 'test2',\n" +
                "  'attributes': [{\n" +
                "      'name': 'name',\n" +
                "      'type': 'String'},{\n" +
                "      'name': 'type',\n" +
                "      'type': 'String'}],\n" +
                "  'operations': []}]\n" ;
//        Gson gson= new Gson();
//
//        assertEquals(gson.toJson(expected),uml.saveDiagramClass());
    }
}