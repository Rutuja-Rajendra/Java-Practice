package Array;

public class RotateArrayByOne {
    public static void main(String[] args) {
        
        // 5 1 2 3 4

        int[] numbers = {1,2,3,4,5};

        int num = numbers[numbers.length - 1];

        for(int i = numbers.length - 1; i > 0; i--){ // 4 3 2 1 0
            numbers[i] = numbers[i - 1]; // 5 1 2 3 4
        }
        numbers[0] = num;// 5
    }
}
