/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.Comparator;

/**
 *
 * @author Home
 */
public class SortComparator implements Comparator<Student> {

    @Override
    public int compare(Student obj1, Student obj2) {

        double rating1 = obj1.getRating();
        double rating2 = obj2.getRating();

        if (rating1 > rating2) {
            return 1;
        } else if (rating1 < rating2) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SortComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student p1, Student p2) {
        return p1.getFirstName().compareTo(p2.getFirstName());
    }

}
