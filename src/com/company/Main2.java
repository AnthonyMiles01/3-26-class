package com.company;

public class Main2 {
    public static void main(String[] args) {
        int[] datas = {2, 123, 3213412, 231, 1};

        bubbleSort(datas);
        for (int i : datas) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        int result = linearSearch(datas, 2);
        System.out.println(result);
        System.out.println();
        int binaryResult = binarySearch(datas, 231);
        System.out.print(binaryResult);
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    public static int linearSearch(int[] array, int value) {
        int index = 0;
        for (int faq : array) {
            if (value == faq) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left < right) {
            mid =(left+right)/2;
            if(value>array[mid]){
                left = mid;
            }else if(value<array[mid]){
                right = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }


}
