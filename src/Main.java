import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

interface LambdaAdd{
    int add(int a, int b);
}

interface LambdaPrint{
    void print();
}

interface PrintName{
    void PrintName(String name);
}

public class Main {
    public static void main(String[] args) {
        // 람다식은 하나의 메서드만 있는 인터페이스(함수형 인터페이스)에서만 사용할 수 있음.
        LambdaAdd lambdaAdd = (c, d) -> c + d;
        System.out.println(lambdaAdd.add(24,37));

        LambdaPrint lambdaPrint = () -> System.out.println("파라미터 없을 때 사용");
        lambdaPrint.print();

        // 변수가 인터페이스의 매개변수와 같지 않아도 됨.
        PrintName printName = (a) -> System.out.println("이름은 : " + a);
        printName.PrintName("김재형");
    }
}

