package Sortingsalgorithms.datastucts.java;

public class bst {
    public static void main(String[]args){
        int [] arr = {4,564,567,12456,9999};
        int index = search(arr,9999,0,arr.length-1);
        System.out.println(index);
        dice("",69);


    }
    public static int search(int []arr,int target,int s,int e){
        int mid = s + (e -s)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            search(arr,target,0,mid-1);
        }
            return  search(arr,target,mid+1,e);
    }

    static void dice(String p ,int target){
        if(target == 0){
            System.out.println(p);
        }
        for(int i = 1;i <= 6&&i<=target;i++){
            dice(p+i,target-i);
        }

    }
    public static int search2(int[]arr,int target,int start,int end){
        int middle = start + (end-start)/2;
        if(start > end){
            return  -1;
        }
        if(arr[middle] == target){
            return middle;
        }
        else if(target < middle){
            search2(arr, target,0,middle-1);
        }
        return  search(arr,target,middle+1,end);
    }
}
