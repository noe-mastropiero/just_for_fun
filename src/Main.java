import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        functions fun = new functions();
        List <Integer> list = new ArrayList<>(10);
        int[] numeros = new int[]{0,5,1,10,9,2,11,8,15,20,4};
        fun.comparadorDeArrays();
       // for(int q=0; q<numeros.length;q++){System.out.print(numeros[q]+", ");}
    }
}