class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Pair<Integer, Integer>> st = new LinkedList<>();

        int max = 0;

        for(int i = 0; i < heights.length; i++){

            int idx = i;

            while(st.size() > 0 && st.peek().getKey() >= heights[i]){
                Pair<Integer, Integer> p = st.pop();

                idx = p.getValue();

                int area = p.getKey()*(i - idx);

                max = Math.max(max, area);
            }

            st.push(new Pair<>(heights[i], idx));
        }

        while(st.size() > 0){
            Pair<Integer, Integer> p = st.pop();

            max = Math.max(max, p.getKey()*(heights.length - p.getValue()));
        }

        return max;


    }
}
