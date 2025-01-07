import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SecondLargestElement {

    public static void main(String[] args) {
        int arr[] = {20, 10, 60, 45};

        int temp, size;

        size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("2nd large number is - " + arr[size-2]);
    }





}
