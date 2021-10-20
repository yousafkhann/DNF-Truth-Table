public class Table {

    //member variable
    public static String DNF = "";


    //constructors
    //different constructors depending on number of variables
        public void table(boolean a, boolean b, boolean c, boolean d)
        {
            System.out.print(a + "\t" + b + "\t" + c + "\t" + d + "\t");
            System.out.println(myExpression(a,b,c,d));
            if(myExpression(a,b,c,d))
            {
                form(a,b,c,d);
            }

        }
        
        public void table(boolean a, boolean b, boolean c)
        {
            System.out.print(a + "\t" + b + "\t" + c + "\t");
            System.out.println(myExpression(a,b,c));
            if(myExpression(a,b,c))
            {
                form(a,b,c);
            }

        }
        
        public void table(boolean a, boolean b)
        {
            System.out.print(a + "\t" + b + "\t" );
            System.out.println(myExpression(a,b));
            if(myExpression(a,b))
            {
                form(a,b);
            }

        }

    //methods
    //different methods with different parameters to accomodate for different number of variables.


        public static boolean myExpression(boolean a, boolean b, boolean c, boolean d)
        {
            return !(a && b && !c) && (b && d);
        }

        public static boolean myExpression(boolean a, boolean b, boolean c)
        {
            return !(a && b && !c) && (b && c);//insert expression here
        }

        public static boolean myExpression(boolean a, boolean b)
        {
            return !(a && b) && (a && b);//insert expression here
        }



        public static void form(boolean a, boolean b, boolean c, boolean d)
        {
            String x="a";
            String y="b";
            String z="c";
            String q="d";
            
            if(!a)
            {
                x="!a";
            }
            if(!b)
            {
                y="!b";
            }
            if(!c)
            {
                z="!c";
            }
            if(!d)
            {
                q="!d";
            }
            DNF = DNF + (x + "&&" + y + "&&" + z + "&&" + q +" ||");
        }

        public static void form(boolean a, boolean b, boolean c)
        {
            String x="a";
            String y="b";
            String z="c";
           
            
            if(!a)
            {
                x="!a";
            }
            if(!b)
            {
                y="!b";
            }
            if(!c)
            {
                z="!c";
            }
            
            DNF = DNF + (x + "&&" + y + "&&" + z + "||");
        }

        public static void form(boolean a, boolean b)
        {
            String x="a";
            String y="b";
            
           
            
            if(!a)
            {
                x="!a";
            }
            if(!b)
            {
                y="!b";
            }
            
            
            DNF = DNF + (x + "&&" + y + "||");
        }

        public void fourVariables()
        {
            System.out.println("a       "+ "b       "+ "c       "+"d        "+"Result       ");
            table(true, true, true, true);
            table(true, true, true, false);
            table(true, true, false, true);
            table(true, true, false, false);
            table(true, false, true, true);
            table(true, false, true, false);
            table(true, false, false, true);
            table(true, false, false, false);
            table(false, true, true, true);
            table(false, true, true, false);
            table(false, true, false, true);
            table(false, true, false, false);
            table(false, false, true, true);
            table(false, false, true, false);
            table(false, false, false, true);
            table(false, false, false, false);
            System.out.println(DNF);
        }

        public void threeVariables()
        {
            System.out.println("a       "+ "b       "+ "c       "+"Result       ");
            table(true, true, true);
            table(true, true, false);
            table(true, false, true);
            table(true, false, false);
            table(false, true, true);
            table(false, true, false);
            table(false, false, true);
            System.out.println(DNF);
        }

        public void twoVariables()
        {
            System.out.println("a       "+ "b       "+"Result       ");
            table(true, true);
            table(true, false);
            table(false, true);
            table(false, false);
            System.out.println(DNF);
        }
}

