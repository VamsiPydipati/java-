public class Main{

    // search the target index 
    
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,8,9,12,66};
        int target =8;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for(int index=0;index< arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;

    }

}