import java.sql.SQLOutput;
import java.util.HashSet;

public class Proxy {
    public static int calculator(double[] array){
        int count = 0;
        int result = 0;
        if (array != null){
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] == array[j]){
                        count++;
                    }
                    if (j == array.length -1 && count == 0){
                        result++;
                    }
                }
                count=0;
            }
        } else System.out.println("Array is empty");
        return result;
    }

    public static int calculator1(double[] array){
        int result = 0;
        if (array != null){
            HashSet<Double> hashSet = new HashSet<>();
            for (double v : array) {
                System.out.println(v);
                hashSet.add(v);
            }
            return hashSet.size();
        } else System.out.println("Array is empty");
        return result;
    }
}
