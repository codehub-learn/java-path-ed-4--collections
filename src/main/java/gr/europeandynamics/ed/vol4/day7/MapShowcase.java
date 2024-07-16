/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author mcjoh
 */
public class MapShowcase {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        
        map.put("Git", "Version Control System");
        map.put("Java", "Programming Language");
        map.put("C++", "Programming Language");
        map.put("Git", "Version Control System 2");
        System.out.println(map);
        map.remove("Git");
        System.out.println(map);     
    } 
}
