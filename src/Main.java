import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


class car {
    void start (int a) {
        System.out.println("car Start");
    }
    public void end (int a) {
        System.out.println("car End");

    }
}

class vehicle extends car {
    void honk () {
        System.out.println("honk");
    }

    void start(int a) {
        System.out.println("Vehicle start");
    }

    public void end (float a){
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args) {
        int number = 1234;
        String a = "1234";

        System.out.println(number/2);
    }
}

