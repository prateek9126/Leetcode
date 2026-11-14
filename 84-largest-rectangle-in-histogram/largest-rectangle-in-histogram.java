/*class Solution {
    public int largestRectangleArea(int[] heights) {
        int a=0;
        int b=0;
        int c=0;
        if(heights.length==1){
            return heights[0];
        }
        for(int i=0;i<heights.length-1;i++){
            if(heights[i]+heights[i+1]>a){
                a=heights[i]+heights[i+1];
                b=heights[i];
                c=heights[i+1];
            }
        }
        int k=Math.min(b,c);
        if(k==0){
            int p=Math.max(b,c);
            return p;
        }
        return k*2;
    }
}*/

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        // Loop up to n (treating index n as a virtual bar of height 0 to flush the stack)
        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            // Whenever the current bar is shorter than the bar at the top of the stack,
            // we found the right boundary for the bar on top of the stack.
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                
                // If stack is empty, this bar could extend all the way to index 0
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}