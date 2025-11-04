public class Program {

   
    public static <T extends Number & Comparable<T>> T findMinimum(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 3, 45, 2, 18};
        Double[] doubleArray = {12.5, 7.3, 9.8, 15.6};

        System.out.println("Minimum Integer: " + findMinimum(intArray));
        System.out.println("Minimum Double: " + findMinimum(doubleArray));
    }
}
