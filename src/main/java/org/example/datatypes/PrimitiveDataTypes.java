package org.example.datatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // 1. Ստեղծել 2 փոփոխական(byte a եւ byte b ),  վերագրել կամայական արժեքներ եւ տպել console -ում

        byte a = 7, b = 10;
        System.out.println(a + "\n" + b);

        // 2. Ստեղծել 2 փոփոխական(short c եւ short d ),  վերագրել կամայական արժեքներ եւ տպել console -ում

        short c = 300, d = 700;
        System.out.println(c + "\n" + d);

        // 3. Ստեղծել 2 փոփոխական(int e եւ int f ),  վերագրել կամայական արժեքներ եւ տպել console -ում

        int e = 4000, f = 12345;
        System.out.println(e + "\n" + f);

        // 4. Ստեղծել 2 փոփոխական(long g եւ long h ),  վերագրել կամայական արժեքներ եւ տպել console -ում

        long g = 70000000l, h = 56998887l;
        System.out.println(g + "\n" +  h);

        // 5. Տպել  byte, short, int եւ long  Max & Min  արժեքները;

        System.out.println("byte min = -128" + "\nbyte max = 127" + "\nshort min = -32,768" + "\nshort max = 32,767"+ "\nint min = -2147483648" + "\nint max = 2147483647" + "\nlong min = -9223372036854775808" + "\nlong max = 9223372036854775807");

        // 6. Ստեղծել 2 փոփոխական(float j եւ float k ),  վերագրել կամայական արժեքներ եւ տպել console -ում

        float j = 16.4f, k = 98.11f;
        System.out.println(j + "\n" + k);

        // 7․ Ստեղծել 2 փոփոխական(double l եւ double m ), վերագրել կամայական արժեքներ եւ տպել console - ում

        double l = 124.6567, m = 9898.323213;
        System.out.println(l + "\n" + m);

        // 8.Տպել float եւ double  Max & Min  արժեքները;

        System.out.println("float min = 1.4e-045" + "\nfloat max = 3.4+038" + "\ndouble min = 4.9e-324" + "\ndouble max = 1.8e+308");

        // 9 Հետեւյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
        //    իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?

        float fl = 12.345f, fff = 3456.091f;
        double dou = 34.567839023, ddd = 8923.1234857;

        // 10. Ստեղծել 2 փոփոխական(char n եւ char o ), վերագրել կամայական արժեքներ եւ տպել   console -ում.

        char n = 'n', o = 'o';
        System.out.println(n + "\n" + o);

        // 11.1 Տպել char s = 77;  եւ char w = 109;  արժեքները;
        char s = 77;  //M
        char w = 109; //m
        System.out.println(s + "\n" +w);

        // 11.2 Վերագրել  char t-ին 9  թիվ արժեքը (Առանց այս եղանակի char t = '9';)

        char t = 0x0039;
        System.out.println(t);

        // 12. Ստեղծել 2 փոփոխական(boolean p եւ boolean q ), վերագրել կամայական արժեքներ եւ տպել console -ում

        boolean p = false;
        boolean q = true;
        System.out.println(p + "\n" + q);

        // 13. Ի՞նչ կտպի կոդի այս հատվածը եւ ինչու՞։

        //int year = 201l;
        //System.out.println(year);
        // java: incompatible types: possible lossy conversion from long to int, կքցի exception, քանի որ int վերագրում ենք long առանց cas անելու։

        // 14. Ստեղծել int aa  = 7 եւ long bb փոփոխականներ, կատարել Cast գործողություն  aa -> bbb  եւ տպել console -ում

        int aa = 7;
        long bb = aa;
        System.out.println(bb);

        // 15.  Ստեղծել int myInt  = 7 եւ double myDouble փոփոխականներ, կատարել Cast գործողություն  myInt -> myDouble  եւ տպել console -ում


        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myInt);

        // 16. Ստեղծել double dd = 9.78d եւ int ii փոփոխականներ, կատարել Cast գործողություն  dd -> ii  եւ տպել console -ում.

        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(ii);

        // 17. Ստեղծել int ff = 9999 եւ byte gg փոփոխականներ, կատարել Cast գործողություն  ff -> gg  եւ տպել console -ում.

        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);

        // 18.  Գտնել սխալը  եւ ուղղել.

//                long max = 3123456789; // վերջում պետքա L ինի default - ը double
//                double d = 1000_.00; // _ սա պետքա չլիներ
//                char i = 'i';
//                char j = 'j';
//                char ij = i + j; // char - ի մեջ, միայն մեկ սիմվոլ
//                int 7a = 8; // variable - ը չի կարող թվով սկսվել
//                long h = h + 8; // տառ չի կարող լինել
//                int n,m = 11; m = n; // Variable 'n' might not have been initialized

    }
}