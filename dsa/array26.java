class Solution {
    public int removeDuplicates(int[] nums) {

        int x=nums[0];
        int y=nums[nums.length-1];
        int z=1;
        for(int i=1;i<nums.length;i++){
            
            if(x==nums[i]){
          

                for(int j=i;j<nums.length;j++){
                    nums[j-1]=nums[j];
                }
                i--;
             x=nums[i];
              
            }
         
            else{    x=nums[i];}
                // z++;
                if(y==nums[i]){
                     break;
            
            
            }
        }
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                z++;
            }
        }

    return z;
        
    }
}