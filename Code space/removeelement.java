import java.util.Arrays;
class Solution{
	public int removeelement(int[]nums,int val){
		int k=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
	}
}
class removeelement{
	public static void main(String args[]){
		int[] nums={10,30,40,20,10,50,10};
		int val=10;
		Solution ob=new Solution();
		int k=ob.removeelement(nums,val);
		System.out.println(k);
		System.out.println(Arrays.toString(nums));
	}
}
