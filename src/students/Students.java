/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.*;
import org.jdom.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import org.jdom.input.SAXBuilder;

/**
 *
 * @author Home
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
 /*
         ArrayList<Student>studentArray = new ArrayList<Student>();

   
     
         studentArray .add( new Student("Yura","Lusenko",144,21.4,"yprik@mail.ru")   );
         // validate( ArrayList, validator);
         studentArray .add( new Student("Ruslan","Fostii",244,10.4,"yprik@mail.ru"));
         studentArray .add( new Student("Zasil","Kushniruk",344,22.4,"yprik@mail.ru"));
         studentArray .add( new Student("Viktor","Kolibaba",444,23.4,"yprik@mail.ru"));
         studentArray .add( new Student("Biktor","Kolibaba",444,23.4,"yprik@mail.ru"));
         studentArray .add( new Student("Xiktor","Kolibaba",444,23.4,"yprik@mail.ru"));
         */
        

        try {

            SAXBuilder builder = new SAXBuilder();

            Document document = builder.build("studentsnew.xml");

            ArrayList<Student> studentArray = Student.listCreator(document);
            String name = "Viktor";
            Student st  =new Student();
            
          
             System.out.println(st.FindByName(name,studentArray));
             
            // }
                
           //  }
          
          //  for (Student st : studentArray) {
            //    System.out.println(st);
                
            //}
         //   Collections.sort(studentArray, new SortComparator());
           // for (Student p : studentArray) {
             //   System.out.println(p.getRating());

         //   }
            /*
             Collections.sort(studentArray,new SortComparatorByName()); 
             for (Student p : studentArray) {
             System.out.println(p.firstName);                                               
             }
             */
            Document doc = Student.documentCreate(studentArray);
            if (Student.saveDocument("studentsnew.xml", doc)) {
                System.out.println("created");
            } else {
                System.out.println("unCreated");
            }

        } catch (IOException e) {

            e.printStackTrace();

        } catch (JDOMException e) {

            e.printStackTrace();

        }

    }

}
