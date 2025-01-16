/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Juet {
    int age;
    String name;
    
    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }
    
    String getName() {
        return this.name;
    }

}

public class Main {
    public static void main(String[] args) {
        Juet m1 = new Juet();
        m1.setName("ShubhSingh");
        m1.setAge(20);

        System.out.println(m1.getName());
        System.out.println(m1.getAge());
    }
}

