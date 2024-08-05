package day01;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/02
 **/
public class Test {
    public static void main(String[] args) {
        int dataSize = 100;
        int[] data = AlgorithmGenerator.generateRandomData(dataSize);
        System.out.println("原数组: " + Arrays.toString(data));
        // 记录开始时间
        long startTime = System.nanoTime();
        // 调用算法
        int[] ints = test(data);

        // 记录结束时间
        long endTime = System.nanoTime();

        // 计算并输出执行时间
        long duration = endTime - startTime;

        System.out.println("排序后: " + Arrays.toString(ints));
        System.out.println("执行时间: " + duration);
    }

    public static int[] test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        return arr;
    }

    public static boolean binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left < right) {
            mid = (left + right) >> 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                left = mid - 1;
            } else if (arr[mid] < num) {
                right = mid + 1;
            }
        }

        return false;
    }
}
