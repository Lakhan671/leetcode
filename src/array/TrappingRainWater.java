package array;

public class TrappingRainWater {

    public  static  int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        int max = height[0];
        int maxIndex = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }

        int water = 0;

        int leftMax = height[0];
        for (int i = 0; i < maxIndex; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            } else {
                water += leftMax - height[i];
            }
        }

        int rightMax = height[height.length - 1];
        for (int i = height.length - 1; i > maxIndex; i--) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            } else {
                water += rightMax - height[i];
            }
        }

        return water;
    }

    public static void main(String[] args) {
      int[]a=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }
}
//23:16