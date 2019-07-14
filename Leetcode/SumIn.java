/*Given an array of integers, return indices of the two
numbers such that they add up to a specific target.

You may assume that each input would have exactly
one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

import java.util.Arrays;
import java.util.HashMap;
public class SumIn {

//brute force way to do it with O(n^2)
public  int[] sumTwo(int num[], int target){
 for(int i = 0; i<num.length-1;i++){
     for(int j = i+1;j<num.length;j++){
         if(num[i]+num[j] == target){
             return new int [] {i,j};
         }
     }
 }

    return new int [] {-1,-1};
}

//new way to do it with O(n)
public static int[] sumThree(int num[], int target) {
    HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
    for(int i = 0;i<num.length;i++){
        if(hm.containsKey(target - num[i])) {
            return new int[]{hm.get(target-num[i]),i};
        }
        hm.put(num[i],i);
    }
    return new int[] {-1,-1};
}

    public static void main(String[] args){
SumIn sumIn = new SumIn();
        int [] result = sumIn.sumTwo(new int[] {2,7,11,15},22);
        System.out.println(Arrays.toString(result));

        int[] result1 = sumThree(new int [] {2,7,16,15},23);
        System.out.println(Arrays.toString(result1));

    }
}
