package w3resource;

import java.util.Arrays;

public class ArrayEx {
    public void reverseArray( int[] inputArray){
                System.out.println("Original array : "+ Arrays.toString(inputArray));
        for(int i = 0; i < inputArray.length / 2; i++)
        {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = temp;
        }
        System.out.println("Array after reversal : "+Arrays.toString(inputArray));
    }
    }

