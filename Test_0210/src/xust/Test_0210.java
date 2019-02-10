package xust;

/*
1. 密钥格式化
给定一个密钥字符串S，只包含字母，数字以及 '-'（破折号）。N 个 '-' 将字符串分成了 N+1 组。给定一个数字 K，重新格式化字符串，除了第一个分组以外，
每个分组要包含 K 个字符，第一个分组至少要包含 1 个字符。两个分组之间用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。

示例 1：
输入：S = "5F3Z-2e-9-w", K = 4
输出："5F3Z-2E9W"
解释：字符串 S 被分成了两个部分，每部分 4 个字符；
     注意，两个额外的破折号需要删掉。
     
示例 2：
输入：S = "2-5g-3-J", K = 2
输出："2-5G-3J"
解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
 
提示:
S 的长度不超过 12,000，K 为正整数
S 只包含字母数字（a-z，A-Z，0-9）以及破折号'-'
S 非空
 */
//public class Test_0210 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String S = "5F3Z-2e-9-w";
//		int K = 4;
//		System.out.println(So.licenseKeyFormatting2(S, K));
//	}
//}
//class Solution {
//    public String licenseKeyFormatting1(String S, int K) {
//        String res = "";
//        for(int i=S.length()-1; i>=0; i--){
//        	if(S.charAt(i) != '-'){
//        		if(res == "" || (res.length()+1) % (K+1) != 0){
//        			if('a'<=S.charAt(i) && S.charAt(i) <='z'){
//        				res = String.valueOf(Character.toUpperCase(S.charAt(i))) + res;
//        			}
//        			else{
//        				res = String.valueOf(S.charAt(i)) + res;
//        			}
//            	}
//        		else{
//        			res="-"+res;
//        			i++;
//        		}
//        	}
//        }
//        return res;
//    }
//    public String licenseKeyFormatting2(String S, int K) {
//    	S = S.toUpperCase().replace("-","");
//    	StringBuilder s = new StringBuilder(S);
//    	for(int i=S.length()-K; i>0; i-=K){
//    		s.insert(i,"-");
//    	}
//    	return String.valueOf(s);
//    }
//}
/*
2. 最大连续1的个数
 给定一个二进制数组， 计算其中最大连续1的个数。

示例 1:
输入: [1,1,0,1,1,1]
输出: 3
解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
注意：
输入的数组只包含 0 和1。
输入数组的长度是正整数，且不超过 10,000。
 */
//public class Test_0210 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {1,1,0,1,1,1};
//		System.out.println(So.findMaxConsecutiveOnes(nums));
//	}
//}
//class Solution {
//    public int findMaxConsecutiveOnes(int[] nums) {
//    	int max = 0;
//    	int temp = 0;
//    	for(int i=0; i<nums.length; i++){
//    		if(nums[i] == 1){
//    			temp++;
//    		}
//    		else{
//    			max = Math.max(temp, max);
//    			temp = 0;
//    		}
//    	}
//    	max = Math.max(temp, max);
//    	return max;
//    }
//}
/*
3. 构造矩形
作为一位web开发者， 懂得怎样去规划一个页面的尺寸是很重要的。 现给定一个具体的矩形页面面积，你的任务是设计一个长度为 L 和宽度为 W 且满足以下要求的矩形的页面。要求：
1. 你设计的矩形页面必须等于给定的目标面积。
2. 宽度 W 不应大于长度 L，换言之，要求 L >= W 。
3. 长度 L 和宽度 W 之间的差距应当尽可能小。
你需要按顺序输出你设计的页面的长度 L 和宽度 W。
示例：
输入: 4
输出: [2, 2]
解释: 目标面积是 4， 所有可能的构造方案有 [1,4], [2,2], [4,1]。
但是根据要求2，[1,4] 不符合要求; 根据要求3，[2,2] 比 [4,1] 更能符合要求. 所以输出长度 L 为 2， 宽度 W 为 2。
说明:
给定的面积不大于 10,000,000 且为正整数。
你设计的页面的长度和宽度必须都是正整数。
 */
public class Test_0210 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int area = 2;
		int[] nums = So.constructRectangle(area);
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]+" ");
		}
	}
}
class Solution {
    public int[] constructRectangle(int area) {
    	int[] nums={area/(int) Math.sqrt(area),(int)Math.sqrt(area)};
        while(nums[0] * nums[1] != area){
        	nums[1]-=1;
        	nums[0]=area/nums[1];
        }
        return nums;
    }
}