public class Driver{
    //Yousaf Khan
    //this program has all its methods and definitions in the Table.java class
    /*Step 1: Go to Java class, and define one of the 3 "myExpression" methods with the propositional 
    equation you are trying to solve. There are three methods to allow for 2, 3, and 4 variables in 
    the expression*/
    /*Step 2: Just create a new table object, and pick either of the twoVariables(), threeVariables(), 
    or fourVariables() methods. Java will take care of the rest :)*/
    //You can run it as many times as you want, everything resets.


    public static void main (String args[])
        {
            System.out.println("Hello World");
            Table bc = new Table ();

            bc.fourVariables();
            Table.DNF = "";


        }

}