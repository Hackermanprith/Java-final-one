package Sortingsalgorithms.datastucts.java;

public class insertationshort {
    public static void main(String[]args){
        int arr[] = {8,7,2,43};
        int temp = 0;
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    }

