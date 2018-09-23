package primary.array;

public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+", ");
        }
    }
    public static void moveZeroes(int[] nums) {
        //一快一慢两指针
        for(int low = 0, high = 0; high < nums.length; high++){
            if(nums[high] != 0){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
            }
        }
    }
}
