# Valid_Mountain_Array.java

## First try to understand what exactly is a Mountain Array

#### We are given an array of integers and a range, we need to find whether the subarray which falls in this range has values in the form of a mountain or not. All values of the subarray are said to be in the form of a mountain if either all values are increasing or decreasing or first increasing and then decreasing. 
More formally a subarray [a1, a2, a3 … aN] is said to be in form of a mountain if there exist an integer K, 1 <= K <= N such that, 
a1 <= a2 <= a3 .. <= aK >= a(K+1) >= a(K+2) …. >= aN 

![image](https://user-images.githubusercontent.com/70264806/119131121-b1ed3a00-ba56-11eb-8be0-69a986632797.png)
