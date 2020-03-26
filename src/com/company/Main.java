package com.company;

public class Main {
    public static void bubble(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                }
            }
        }

    }

    public static void add(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int k = i - 1;
            while (k >= 0 && data[k] > tmp) {
                data[k + 1] = data[k];
                k--;
            }
            data[k + 1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {5,3,2,4,1};

        add(array);
        for(int i : array){
            System.out.print(i);
        }
    }
}
