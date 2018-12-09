import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class Main {

    public static class Solution {

        public boolean isSubtree(TreeNode s, TreeNode t) {
            return isEqual(s, t) || (s != null && (isSubtree(s.left, t) || isSubtree(s.right, t)));
        }

        private boolean isEqual(TreeNode s, TreeNode t) {
            if (t == null && s == null) {
                return true;
            }
            if (t == null || s == null) {
                return false;
            }
            return s.val == t.val && isEqual(s.left, t.left) && isEqual(s.right, t.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
