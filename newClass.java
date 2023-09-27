package test04;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class newClass {

    public static void main(String[] args) {

        List <Integer> l = Arrays.asList(2,4,5,6,3);
       int value = l.stream()
                    .filter(n-> n%2 ==0)
                    .map(n-> n*2)
                    .reduce(0, (a,b)-> a+b);

        System.out.println(value);
        
    }

}