/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Offering
{
	abstract int getPrice();
	abstract String getName();
}

class Coffee extends Offering{
    int  getPrice(){
        return 30;
    }
    String getName(){
        return "Coffee";
    }
}

abstract class Decorator extends Offering
{
	Offering offering;
}

class Rum extends Decorator{
    Rum(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return (offering.getName() + " with rum ");
    }
    int  getPrice(){
        return (offering.getPrice() + 50);
    }
}

class Test{
    public static void main(String args[]){
        Offering offering = new Coffee();
        offering = new Rum(offering);
        offering = new Rum(offering);
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}

















