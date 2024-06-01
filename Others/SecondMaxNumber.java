

public class SecondMaxNumber {
    public static void main(String[] args) {
        int array1[] = { 19, 18, 13, 21, 15, 21, 11, 21 };
        int SecondMax = Integer.MIN_VALUE;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    int swap = array1[i];
                    array1[i] = array1[j];
                    array1[j] = swap;
                }
            }
        }
        System.out.print("{");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }
        System.out.print("}");
        System.out.println();
        Max = array1[array1.length - 1];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > SecondMax && array1[i] < Max) {
                SecondMax = array1[i];
            }
        }
        System.out.println("Second Max no is :- " + SecondMax);
    }
}
