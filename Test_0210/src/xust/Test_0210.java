package xust;

/*
1. ��Կ��ʽ��
����һ����Կ�ַ���S��ֻ������ĸ�������Լ� '-'�����ۺţ���N �� '-' ���ַ����ֳ��� N+1 �顣����һ������ K�����¸�ʽ���ַ��������˵�һ���������⣬
ÿ������Ҫ���� K ���ַ�����һ����������Ҫ���� 1 ���ַ�����������֮���� '-'�����ۺţ����������ҽ����е�Сд��ĸת��Ϊ��д��ĸ��
�����ǿ��ַ��� S ������ K���������������Ĺ�����и�ʽ����

ʾ�� 1��
���룺S = "5F3Z-2e-9-w", K = 4
�����"5F3Z-2E9W"
���ͣ��ַ��� S ���ֳ����������֣�ÿ���� 4 ���ַ���
     ע�⣬������������ۺ���Ҫɾ����
     
ʾ�� 2��
���룺S = "2-5g-3-J", K = 2
�����"2-5G-3J"
���ͣ��ַ��� S ���ֳ��� 3 �����֣�����ǰ��Ĺ�����������һ���ֵ��ַ��������ڸ��������������ಿ�ֽ�Ϊ 2 ���ַ���
 
��ʾ:
S �ĳ��Ȳ����� 12,000��K Ϊ������
S ֻ������ĸ���֣�a-z��A-Z��0-9���Լ����ۺ�'-'
S �ǿ�
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
2. �������1�ĸ���
 ����һ�����������飬 ���������������1�ĸ�����

ʾ�� 1:
����: [1,1,0,1,1,1]
���: 3
����: ��ͷ����λ��������λ��������1�������������1�ĸ����� 3.
ע�⣺
���������ֻ���� 0 ��1��
��������ĳ��������������Ҳ����� 10,000��
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
3. �������
��Ϊһλweb�����ߣ� ��������ȥ�滮һ��ҳ��ĳߴ��Ǻ���Ҫ�ġ� �ָ���һ������ľ���ҳ�������������������һ������Ϊ L �Ϳ��Ϊ W ����������Ҫ��ľ��ε�ҳ�档Ҫ��
1. ����Ƶľ���ҳ�������ڸ�����Ŀ�������
2. ��� W ��Ӧ���ڳ��� L������֮��Ҫ�� L >= W ��
3. ���� L �Ϳ�� W ֮��Ĳ��Ӧ��������С��
����Ҫ��˳���������Ƶ�ҳ��ĳ��� L �Ϳ�� W��
ʾ����
����: 4
���: [2, 2]
����: Ŀ������� 4�� ���п��ܵĹ��췽���� [1,4], [2,2], [4,1]��
���Ǹ���Ҫ��2��[1,4] ������Ҫ��; ����Ҫ��3��[2,2] �� [4,1] ���ܷ���Ҫ��. ����������� L Ϊ 2�� ��� W Ϊ 2��
˵��:
��������������� 10,000,000 ��Ϊ��������
����Ƶ�ҳ��ĳ��ȺͿ�ȱ��붼����������
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