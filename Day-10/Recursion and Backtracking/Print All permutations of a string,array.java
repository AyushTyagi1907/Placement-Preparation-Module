class Solution {
    List<List<Integer>> master = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> rest = new ArrayList<>();
        for (int i : nums) {
            rest.add(i);
        }
        List<Integer> list = new ArrayList<>();
        permute(rest, list);
        return master;
    }
    
    private void permute(List<Integer> rest, List<Integer> list) {
        if (rest.isEmpty()) {
            List<Integer> copy = new ArrayList<>(list);
            master.add(copy);
            return;
        }
        for (int i = 0; i < rest.size(); i++) {
            Integer curr = rest.get(i);
            rest.remove(i);
            list.add(curr);
            permute(rest, list);
            rest.add(i, curr);
            list.remove(list.size() - 1);
        }
    }
}
