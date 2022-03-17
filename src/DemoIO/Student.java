/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoIO;

import java.io.Serializable;

/**
 *
 * @author JosCongQuy
 */
class Student implements Serializable{

    public Student(String name, double id) {
        this.name = name;
        this.id = id;
    }
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    double id;
}
