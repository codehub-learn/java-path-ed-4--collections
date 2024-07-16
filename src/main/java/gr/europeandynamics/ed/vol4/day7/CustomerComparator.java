/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.Comparator;

/**
 *
 * @author mcjoh
 */
public class CustomerComparator implements Comparator<Customer> {

    // 50, Nikolaos             25, Manolis
    // 50, Athina               50, Athina
    // 25, Manolis              50, Nikolaos
    // 80, Ioannis              80, Ioannis
    @Override
    public int compare(Customer c1, Customer c2) {
        // x > 0, x = 0, x < 0
        int ageResult = c1.getAge().compareTo(c2.getAge());
        if (ageResult != 0) {
            return ageResult;
        }
        return c1.getName().compareTo(c2.getName());
    }
}
