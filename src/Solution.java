public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length * 2];
        int index = 0;

        for (int i = 0; i < answer.length; i++) {
            if (i == nums.length){
                index = 0;
            }

            answer[i] = nums[index];
            //System.out.println(nums[index]);
            index++;
        }

        return answer;
    }
}
