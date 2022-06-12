import java.util.Arrays;


class Scratch {
    public static void main(String[] args) {
        double[] a = {5.0, 9.0, 4.0, 0.0, 6.0, 5.0, 0.0, 3.0};
        System.out.println(Arrays.toString(sort1(a)));
        System.out.println(Arrays.toString(sort2(a)));
    }

    // в начало
    public static double[] sort1(double[] arr) {
        int count = 0;
        double[] answer = new double[arr.length];
        for (double v : arr) {
            if (v == 0) count++;
        }

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer[i + count - k] = arr[i];
            else k++;
        }
        return answer;
    }

    // в конец
    public static double[] sort2(double[] arr) {
        double[] answer = new double[arr.length];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                k++;
                continue;
            }
            answer[i-k] = arr[i];
        }
        return answer;
    }
}