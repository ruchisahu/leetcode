/*78. Subsets
     Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
import java.util.*;
    class Subsets {
    public static List<List<Integer>> subsets(int[] list)
    {
        Arrays.sort(list);
        List<List<Integer>> ps = new ArrayList<List<Integer>>();
  ps.add(new ArrayList<Integer>());   // add the empty set
 
  // for every item in the original list
  for (Integer item : list) {
    List<List<Integer>> newPs = new ArrayList<List<Integer>>();
 
    for (List<Integer> subset : ps) {
      // copy all of the current powerset's subsets
      newPs.add(subset);
 
      // plus the subsets appended with the current item
      List<Integer> newSubset = new ArrayList<Integer>(subset);
      newSubset.add(item);
      newPs.add(newSubset);
    }
 
    // powerset is now powerset of list.subList(0, list.indexOf(item)+1)
    ps = newPs;
  }
  return ps;
}
    
    public static void main(String[] arg)
    {
        int[] a={1,2,3};
        System.out.println(subsets(a));
    }
}