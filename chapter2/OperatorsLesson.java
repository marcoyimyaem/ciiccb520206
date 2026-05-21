package chapter2;

import chapter1.Toy;

public class OperatorsLesson {
    public static void main(String[] args) {
        int a = +10;
        int b = 5;
        boolean isEating = false;
        System.out.println();
        // a = +a++; ✅
        System.out.println(--a + a++);//11 -- a + a ++ or --a+a++✅ 
        System.out.println(a);
        b++;
        // ++b++ or --b-- ❌
        --a;//10
        System.out.println(a);
        System.out.println(-a);
        System.out.println(!!!!isEating);
        // !(!(!(!isEating)))
        System.out.println(5/2);
        System.out.println(5%2);
        System.out.println(8>>1);
        //0000 1000 -> 0000  0100
        System.out.println(3<<1);
        //0000 0011 -> 0000 0110
        System.out.println(16>>>2);
        // 0000 0100
        // 0001 0000 -> 0000 0100
        System.out.println("1<2 = "+(1<2));
        System.out.println("1>2 = "+(1>2));
        System.out.println("2<1 = "+(2<1));
        System.out.println("2>1 = "+(2>1));
        System.out.println("1<1 = "+(1<1));
        System.out.println("2>2 = "+(2>2));
        System.out.println("1<1 = "+(1<1));
        System.out.println("2>2 = "+(2>2));
        System.out.println("1<=1 = "+(1<=1));
        System.out.println("2>=2 = "+(2>=2));
        
        System.out.println("1==1 = "+(1==1));
        System.out.println("2==2 = "+(2==2));
        System.out.println("1!=1 = "+(1!=1));
        System.out.println("2!=2 = "+(2!=2));
        System.out.println("2!=1 = "+(2!=1));
        System.out.println("1!=2 = "+(1!=2));
        System.out.println(1+1.0); // 1(double) + 1.0 -> 1.0 + 1.0
        short b1 = 10;// byte+short+char = int
        short b2 = 11;// byte+short+char = int
        // char b3 = b1+b2;
        short b4 = b1;
        System.out.println(b1+b2);
        int x2 = 1;
        long l2 = 33;
        long l3 = x2*l2; //int l3 = x2*l2;
        // System.out.println(true==1);


    }
}
