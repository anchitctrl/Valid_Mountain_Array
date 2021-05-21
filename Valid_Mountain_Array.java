class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
        {
            return false;
        }
       
        int i=1;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                continue;
            }
            if(arr[i]<arr[i-1])
            {
                break;
            }
            if(arr[i]==arr[i-1])
            {
                return false;
            }
        }
        if(i==arr.length || i==1)
        {
            return false;
        }
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]>=arr[j-1])
            {
                return false;
            }
        }
        return true;
    }
}
