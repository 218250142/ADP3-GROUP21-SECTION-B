package za.ac.cput.constructor;

/* Program.java
   Author: Nawaaz Amien (219099839)
   Date: 10 April 2022
 */

public class Program {

    private String name;
    private int A,B;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    @Override
    public String toString(){
        return "Programs{"+"name="+name+",A="+A+",B="+B+'}';
    }
}
