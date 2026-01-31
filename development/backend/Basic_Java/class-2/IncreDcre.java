class IncreDcre {
    public static void main(String[] args) {
        int a = 2;
        // int b =5;
        // System.out.println(a );
        // a ++; //post increment
        // System.out.println( "Post Incre = " + a);

        // ++b; //pre increment
        // System.out.println("Pre incre "+ b);

        a--;
        System.out.println("Post Dccre = " + a);

        // --b;
        // System.out.println("Pre Decre = " + b);
        // System.out.println("Pre Decre = " + b--);
        // System.out.println("Pre Decre = " + b);

        // int a = 12;
        // int b = 5;
        // System.out.println(a++);
        // //In post inc value used for computing the res and then increment
        // System.out.println(a);
        // a++;
        // System.out.println(a ++ + b);
        // System.out.println(a);


        // Decrement

        int d = 90;
        int c = 2;
        System.out.println(d--);
        System.out.println(d-- + c);

        //It can be used origional value not previous value 
        
        //pre Decrement  is used update value after print a new value 
        // System.out.println(--d);
        // System.out.println(d + --c);

        //Relational Operator 
        // int a = 12, b= 15, c = 10;
        // System.out.println("a == b " + ( a == b));  //f
        // System.out.println("a == c " + ( a == c));  //t
        // System.out.println("a != b " + ( a != b));   //t
        // System.out.println(" a > b " + (a > b));     //f
        // System.out.println(" a >= c " + (a >= c));  //t
        // System.out.println(" a <= c " + (a <= c));  //t

        //Logical Op 

        // boolean a = true,  b = false;

        // System.out.println(" a && b " + ( a &&b));
        // System.out.println(" a ||b " + ( a || b));
        // System.out.println("! ( a &&  b) " + !( a&& b));


        //Assignment OP
        // int a = 3;
        // int b = 4;
        // a += b;
        // System.out.println("Addtion =" + a);
        // System.out.println("Subtraction =" + (a -= b));
        // System.out.println("Multiplication =" + (a *= b));
        // System.out.println("Division =" + (a /= b));
        // System.out.println(a += 5);
        // System.out.println(a);
        // System.out.println("Modulos =" + (a %= b));

        //Ternary OP 
        // int a = 20 , b = 30;
        // int x = (a > b ) ? 100: 200;
        // System.out.println(x);
        // int x2 = (a < b ) ? 100: 200;
        // System.out.println(x2);

        // new op 
        // IncreDcre d = new IncreDcre();
        // d.m1();







    }
    public void m1() {
        System.out.println("This is crated by new keyword . ");
    }
}
