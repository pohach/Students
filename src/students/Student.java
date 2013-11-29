/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.io.*;
import java.util.*;
import org.jdom.*;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author Home
 */
public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private double rating;
    private String eMail;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getGroup() {
        return this.group;
    }

    public String getStrGroup() {
        int g = this.group;
        String strG = Integer.toString(g);
        return strG;
    }

    public double getRating() {
        return this.rating;
    }

    public String getStrRating() {
        double r = this.rating;
        String strR = Double.toString(r);
        return strR;
    }

    public String getEmail() {
        return this.eMail;
    }

    public void setFirsName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStrGroup(String group) {

        this.group = Integer.valueOf(group);
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setStrRating(String rating) {
        this.rating = Double.valueOf(rating);
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + group + " " + rating + " " + eMail;
    }
    

    public Student() {
    }

    public Student(String firstName, String lastName, int group, double rating, String eMail) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.rating = rating;
        this.eMail = eMail;
    }

    public static ArrayList<Student> listCreator(Document doc)
            throws JDOMException, IOException {

        Element root = doc.getRootElement();
        List studElem = root.getChildren();
        Iterator studentIterator = studElem.iterator();
        ArrayList<Student> studentArray = new ArrayList<Student>();

        while (studentIterator.hasNext()) {
            Element studentElement = (Element) studentIterator.next();

            Student student = new Student();

            student.setFirsName(studentElement.getAttributeValue("firstName"));
            student.setLastName(studentElement.getAttributeValue("lastName"));
            student.setStrGroup(studentElement.getAttributeValue("group"));
            student.setStrRating(studentElement.getAttributeValue("rating"));
            student.setEmail(studentElement.getAttributeValue("eMail"));

            studentArray.add(student);

        }
        return studentArray;
    }

    public static Document documentCreate(ArrayList<Student> studentArray) {
        Element root = new Element("newStudents");
        Iterator<Student> studentIterator = studentArray.iterator();
        while (studentIterator.hasNext()) {

            Student student = studentIterator.next();
            Element studentElement = new Element("student");

            studentElement.setAttribute("firstName", student.getFirstName());
            studentElement.setAttribute("lastName", student.getLastName());
            studentElement.setAttribute("group", student.getStrGroup());
            studentElement.setAttribute("rating", student.getStrRating());
            studentElement.setAttribute("eMail", student.getEmail());
            root.addContent(studentElement);
        }
        return new Document(root);
    }

    public static boolean saveDocument(String fileName, Document doc) {
        boolean complete = true;
        XMLOutputter outputter = new XMLOutputter();
        try {
            outputter.output(doc, new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            complete = false;

        } catch (IOException e) {
            e.printStackTrace();
            complete = false;
        }
        return complete;
    }

    public Student FindByName(String name, ArrayList<Student> studentArray) {
        boolean exist = false;
       // ArrayList<Student> studentArray = new ArrayList<Student>();
        Iterator<Student> studentIterator = studentArray.iterator();
        studentArray.size();
        
         for (Student st : studentArray) 
             {
                 if((st.getFirstName().trim()).equals(name))
                    return st;
             }

      return null;
    }
    
}


