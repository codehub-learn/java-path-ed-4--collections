/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author mcjoh
 */
public class Customer implements Comparable<Customer>{
    
    private Integer id; // wrapping/boxing
    private String name;
    private Integer age; // nulls, methods provided, collections -> no primitive values, only boxing version
    private List<String> orderIds;

    public Customer(Integer id) {
        this.id = id;
    }
    
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Customer(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        return Objects.equals(this.id, other.id);
    }

    

    @Override
    // natural order
    // positive -> left is bigger
    // negative -> right is bigger
    // zero -> equal
    public int compareTo(Customer o) {
        return this.name.compareTo(o.getName());
//        return this.age.compareTo(o.getAge()); // Integer
          //return this.age - o.getAge(); // int
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
}
