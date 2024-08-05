package day02;

import java.util.Random;

public class AlgorithmGenerator {
    // 生成随机数据
   public static int[] generateRandomData(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(100);
        }
        return data;
    }
}

