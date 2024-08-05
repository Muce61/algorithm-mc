package day02;

/**
 * @Description
 * @Author muse
 * @Date 2024/08/05
 **/
public class Test {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 3, 3, 3, 2, 2, 4, 4};
        int[] numTwo = {1, 1, 4, 3, 3, 3, 2, 2, 4, 4, 2};
        change(123124, 10);
        oddNumber();
        findRightOne(12310);
        findTwoODDNumber(num);
        findKW(numTwo, 2, 3);
    }

    public static void change(int a, int b) {
        System.out.println("交换前： " + a + " " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("交换后： " + a + " " + b);
    }

    public static void oddNumber() {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }

        System.out.println(res);
    }

    public static void findRightOne(int num) {
        num = num & (~num + 1);
        System.out.println(num);
    }

    public static void findTwoODDNumber(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num ^= arr[i];
        }

        int numOne = num & (~num + 1);
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & numOne) == 0) {
                res ^= arr[i];
            }
        }

        System.out.println(res + " , " + (res ^ num));
    }

    public static void findKW(int[] arr, int k, int w) {
        int[] nums = new int[32];
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                nums[i] += (num >> i) & 1;
            }
        }

        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((nums[i] % w) != 0) {
                res |= (1 << i);
            }
        }

        System.out.println(res);
    }
}
