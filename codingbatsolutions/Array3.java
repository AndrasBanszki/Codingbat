    /**
     * Codingbat solutions.
     * @author Bánszki András <andras.banszki@gmail.com>
     */
package codingbatsolutions;

public class Array3 {

    /**
    Array-3 > maxSpan 

    Consider the leftmost and righmost appearances of some value in an array. 
    We'll say that the "span" is the number of elements between the two 
    inclusive. A single value has a span of 1. Returns the largest span found in
    the given array. (Efficiency is not a priority.)

    maxSpan([1, 2, 1, 1, 3]) → 4
    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    */
    public int maxSpan(int[] nums) {
      int maxSpan = 0;
      if( nums.length < 1){
        return 0;
      } else {
        int span=0;
        int j = 0;
        for(int i = nums.length-1; i >= 0; i--){

          for(j = 0; nums[i] != nums[j]; j++){

          }

          span = i - j + 1;
          if(span > maxSpan)
            maxSpan = span;


        }
      }
      return maxSpan;
    }

    /**
    Array-3 > fix34 

    Return an array that contains exactly the same numbers as the given array, 
    but rearranged so that every 3 is immediately followed by a 4. Do not move 
    the 3's, but every other number may move. The array contains the same number
    of 3's and 4's, every 3 has a number after it that is not a 3, 
    and a 3 appears in the array before any 4.

    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
    */
    public int[] fix34(int[] nums) {

      int change = 0;
      int j = nums.length-1;

      for(int i = nums.length-1; i >= 0 ; i--){
        if(nums[i] == 3 && nums[i+1] != 4){
            for( ;  j > 0 && nums[j] != 4  ; j--){
                }
                    change = nums[i+1];
                    nums[i+1] = nums[j];
                  nums[j] = change;
            if(j-1 == i + 1){
              j=i;
            }

        }
      }
      return nums;

    }

    /**
    Array-3 > fix45 

    (This is a slightly harder version of the fix34 problem.) Return an array 
    that contains exactly the same numbers as the given array, but rearranged so
    that every 4 is immediately followed by a 5. Do not move the 4's, but every
    other number may move. The array contains the same number of 4's and 5's, 
    and every 4 has a number after it that is not a 4. In this version, 5's may 
    appear anywhere in the original array.

    fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
    fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
    fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
    */
    public int[] fix45(int[] nums) {

      int change = 0;
      int j = nums.length-1;

      for(int i = nums.length-1; i >= 0 ; i--){
        if(nums[i] == 4 && nums[i+1] != 5){
            for( ;  j > 0 && nums[j] != 5  ; j--){
                }
                    change = nums[i+1];
                    nums[i+1] = nums[j];
                  nums[j] = change;
            if(j-1 == i + 1){
              j=i;
            }

        }
      }
      return nums;

    }

    /**
    Array-3 > canBalance 

    Given a non-empty array, return true if there is a place to split the array 
    so that the sum of the numbers on one side is equal to the sum of the 
    numbers on the other side.

    canBalance([1, 1, 1, 2, 1]) → true
    canBalance([2, 1, 1, 2, 1]) → false
    canBalance([10, 10]) → true
    */
    public boolean canBalance(int[] nums) {

      int i = 0;
      int j = nums.length-1;

      int leftSum = nums[0];
      int rightSum = nums[j];

      if(nums.length < 2)
        return false;

      while(i + 1 != j ){
        if(leftSum >= rightSum){
          j--;
          rightSum += nums[j];
        } else {
          i++;
          leftSum += nums[i];
        }

      }

      return leftSum == rightSum;
    }

    /**
    Array-3 > linearIn 

    Given two arrays of ints sorted in increasing order, outer and inner, return
    true if all of the numbers in inner appear in outer. The best solution makes
    only a single "linear" pass of both arrays, taking advantage of the fact 
    that both arrays are already in sorted order.

    linearIn([1, 2, 4, 6], [2, 4]) → true
    linearIn([1, 2, 4, 6], [2, 3, 4]) → false
    linearIn([1, 2, 4, 4, 6], [2, 4]) → true
    */
    public boolean linearIn(int[] outer, int[] inner) {
      boolean lin = false;

      int i = 0, j = 0, inEnd = inner.length - 1, outerEnd = outer.length - 1;

      if(inEnd < 0)
        return true;

      while( i <= outerEnd  ){

        if( j == inEnd && outer[i] == inner[j]){
          return true;
        }
        if(outer[i] == inner[j]){
          j++;
        } else{
          i++;
        }
      }

      return false;
    }

    /**
    Array-3 > squareUp 

    Given n>=0, create an array length n*n with the following pattern, shown 
    here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3
    groups).

    squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    squareUp(2) → [0, 1, 2, 1]
    squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    */
    public int[] squareUp(int n) {
      int[] m = new int[n*n];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          if(i+j+1 < n ){
            m[i*n + j] = 0;
          }else {
            m[i*n + j]=n-j;
          }

        }
      }

      return m;
    }

    /**
    Array-3 > seriesUp 

    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 
    1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of
    the array will be 1 + 2 + 3 ... + n, which is known to sum to 
    exactly n*(n + 1)/2.

    seriesUp(3) → [1, 1, 2, 1, 2, 3]
    seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
    seriesUp(2) → [1, 1, 2]
    */
    public int[] seriesUp(int n) {
      int[] series = new int[n*(n+1) / 2];
      int i = 0, j = 0, k = 0;

      for(i =0; i < n; i++){
        for( j = 0; j <= i; j++){
          series[ k ] = j + 1;
          k++;
        }
      }

      return series;
    }

    /**
    Array-3 > maxMirror 

    We'll say that a "mirror" section in an array is a group of contiguous 
    elements such that somewhere in the array, the same group appears in reverse
    order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} 
    is length 3 (the {1, 2, 3} part). Return the size of the largest mirror 
    section found in the given array.

    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
    maxMirror([1, 2, 1, 4]) → 3
    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
    */
    public int maxMirror(int[] nums) {
      int matched = 0;
      int find = 0;
      int max = 0;
      int mirror = 0;
      for(int i = nums.length-1; i >= 0; i--){


        for(int j = 0; j <= i; j++){
          mirror = 0;
          while( j + mirror <= i && i - mirror >= 0 && nums[i - mirror] == nums[j + mirror] ){
              mirror++;
            }
          if(mirror > max){
            max = mirror;
          }  
        }    
      }
      return max;
    }

    /**
    Array-3 > countClumps 

    Say that a "clump" in an array is a series of 2 or more adjacent elements of
    the same value. Return the number of clumps in the given array.

    countClumps([1, 2, 2, 3, 4, 4]) → 2
    countClumps([1, 1, 2, 1, 1]) → 2
    countClumps([1, 1, 1, 1, 1]) → 1
    */
    public int countClumps(int[] nums) {
      boolean match = false;
      int count = 0;
      for(int i = nums.length-1; i > 0; i--){
        if(nums[i] == nums[i-1] && !match  ){
          count++;
          match = true;
        } else if(nums[i] != nums[i-1]){
          match = false;
        }

      }

      return count;
    }

}
