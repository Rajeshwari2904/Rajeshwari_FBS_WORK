package com.sort.mergesort;

public class MainApp {

    static int[] arr = {10, 30, 20, 5, 2};
    
    public static void main(String[] args)
    {
        MainApp app = new MainApp();
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Sorted Array: ");
        
        app.sort(arr, left, right);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void sort(int[] arr, int left, int right) {

        if (left<right)
        {
            int mid = left+(right-left)/2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            mergeSort(arr, left, mid, right);
        }
    }

    public void mergeSort(int[] arr, int left, int mid, int right)
    {

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int leftctr = 0; leftctr < leftSize; leftctr++) 
        {
            leftArray[leftctr] = arr[left + leftctr];
        }

        for (int rightctr = 0; rightctr < rightSize; rightctr++)
        {
            rightArray[rightctr] = arr[mid + 1 + rightctr];
        }

        int leftctr = 0;
        int rightctr = 0;
        
        
        
        int mergectr = left;

        while (leftctr < leftSize && rightctr < rightSize) 
        {

            if (leftArray[leftctr] <= rightArray[rightctr]) 
            {
                arr[mergectr] = leftArray[leftctr];
                leftctr++;
            } 
            else
            {
                arr[mergectr] = rightArray[rightctr];
                rightctr++;
            }
            mergectr++;
        }

        while (leftctr < leftSize)
        {
            arr[mergectr] = leftArray[leftctr];
            leftctr++;
            mergectr++;
        }

        while (rightctr < rightSize)
        {
            arr[mergectr] = rightArray[rightctr];
            rightctr++;
            mergectr++;
        }
    }
}
