/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package students;

import java.util.ArrayList;
import org.jdom.Document;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Home
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student();
        String expResult = "fgjhbj";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroup method, of class Student.
     */
    @Test
    public void testGetGroup() {
        System.out.println("getGroup");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStrGroup method, of class Student.
     */
    @Test
    public void testGetStrGroup() {
        System.out.println("getStrGroup");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getStrGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class Student.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getRating();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStrRating method, of class Student.
     */
    @Test
    public void testGetStrRating() {
        System.out.println("getStrRating");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getStrRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirsName method, of class Student.
     */
    @Test
    public void testSetFirsName() {
        System.out.println("setFirsName");
        String firstName = "";
        Student instance = new Student();
        instance.setFirsName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Student instance = new Student();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStrGroup method, of class Student.
     */
    @Test
    public void testSetStrGroup() {
        System.out.println("setStrGroup");
        String group = "";
        Student instance = new Student();
        instance.setStrGroup(group);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Student.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        double rating = 0.0;
        Student instance = new Student();
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStrRating method, of class Student.
     */
    @Test
    public void testSetStrRating() {
        System.out.println("setStrRating");
        String rating = "";
        Student instance = new Student();
        instance.setStrRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Student.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String eMail = "";
        Student instance = new Student();
        instance.setEmail(eMail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCreator method, of class Student.
     */
    @Test
    public void testListCreator() throws Exception {
        System.out.println("listCreator");
        Document doc = null;
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = Student.listCreator(doc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of documentCreate method, of class Student.
     */
    @Test
    public void testDocumentCreate() {
        System.out.println("documentCreate");
        ArrayList<Student> studentArray = null;
        Document expResult = null;
        Document result = Student.documentCreate(studentArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveDocument method, of class Student.
     */
    @Test
    public void testSaveDocument() {
        System.out.println("saveDocument");
        String fileName = "";
        Document doc = null;
        boolean expResult = false;
        boolean result = Student.saveDocument(fileName, doc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FindByName method, of class Student.
     */
    @Test
    public void testFindByName() {
        System.out.println("FindByName");
        String name = "";
        ArrayList<Student> studentArray = null;
        Student instance = new Student();
        Student expResult = null;
        Student result = instance.FindByName(name, studentArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
