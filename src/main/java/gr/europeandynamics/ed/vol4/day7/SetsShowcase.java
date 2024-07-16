/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author mcjoh
 */
public class SetsShowcase {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        
        System.out.println(set);
        
        System.out.println(set.contains("a"));
        
        // LinkedHashSet (insertion order), TreeSet (ordering, natural order)
    }
}
