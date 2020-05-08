package com.alex.sort;

public class SortUtils {

    public static void main(String[] args) {
        int[] data = {10, 8, 9, 100, 2098, 0, 1, 10000};
//        int[] data2 = bubbleSort(data);
//        for (int a : data2) {
//            System.out.println("a = " + a);
//        }

        quickSort(data, 0, data.length - 1);
        for (int a : data) {
            System.out.println("a = " + a);
        }
    }

    /**
     * 冒泡排序
     * 重复地走访过要排序的数列，每次比较相邻两个元素，如果它们的顺序错误就把它们交换过来，越大的元素会经由交换慢慢“浮”到数列的尾端。
     *
     * @param attr
     * @return 分两层遍历， 第一层是需要遍历的长度，（从数组的长度-1倒序开始）
     * 第二层是从第一个元素开始与相邻的元素比较大小
     */
    public static int[] bubbleSort(int[] attr) {
        int tempValue;
        for (int i = attr.length - 1; i > 0; i--) {//每次需要排序的长度
            for (int j = 0; j < i; j++) {
                if (attr[j] > attr[j + 1]) {
                    tempValue = attr[j];
                    attr[j] = attr[j + 1];
                    attr[j + 1] = tempValue;
                }
            }
        }
        return attr;
    }

    public static void quickSort(int[] attr, int low, int high) {
        if (low < high) {
            int index = getIndex(attr, low, high);
            quickSort(attr, 0, index - 1);
            quickSort(attr, index + 1, high);
        }
    }

    /**
     * 快速排序
     *
     * @param attr
     * @param low
     * @param high
     * @return
     */

    public static int getIndex(int[] attr, int low, int high) {
        // 基准数据
        int temp = attr[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && attr[high] >= temp) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            attr[low] = attr[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && attr[low] <= temp) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            attr[high] = attr[low];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        attr[low] = temp;
        // 返回tmp的正确位置
        return low;
    }

}
