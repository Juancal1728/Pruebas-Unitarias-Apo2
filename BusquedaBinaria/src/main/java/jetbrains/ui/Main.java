package jetbrains.ui;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 3, 5, 5, 5, 7, 9, 12};
        int valueToFind = 5;

        boolean found = binarySearch(values, valueToFind);

        if (found) {
            int position = searchFirst(values, valueToFind);

            System.out.print("The value " + valueToFind + " was found at positions: ");

            int left = position;
            while (left >= 0 && values[left] == valueToFind) {
                System.out.print(left + " ");
                left--;
            }

            int right = position + 1;
            while (right < values.length && values[right] == valueToFind) {
                System.out.print(right + " ");
                right++;
            }
        } else {
            System.out.println("The value " + valueToFind + " was not found.");
        }
    }

    public static boolean binarySearch(int[] values, int value) {
        int inicial = 0;
        int end = values.length - 1;
        while (inicial <= end) {
            int med = (inicial + end) / 2;
            if (values[med] == value) {
                return true;
            } else if (values[med] < value) {
                inicial = med + 1;
            } else {
                end = med - 1;
            }
        }
        return false;
    }

    public static int searchFirst(int[] values, int value) {
        int inicial = 0;
        int end = values.length - 1;

        while (inicial <= end) {
            int med = (inicial + end) / 2;
            if (values[med] == value) {
                while (med > 0 && values[med - 1] == value) {
                    med--;
                }
                return med;
            } else if (values[med] < value) {
                inicial = med + 1;
            } else {
                end = med - 1;
            }
        }
        return -1;
    }
}