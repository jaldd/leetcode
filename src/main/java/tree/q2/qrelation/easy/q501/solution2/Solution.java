package tree.q2.qrelation.easy.q501.solution2;

import tree.q1.qtraversal.TreeNode;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> res = new ArrayList<>();
    int base, count, maxCount;

    public int[] findMode(TreeNode root) {

        TreeNode cur = root, pre = null;
        while (cur != null) {
            if (cur.left == null) {
                update(cur);
                cur = cur.right;
                continue;
            }
            pre = cur.left;


        }


        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    public void update(TreeNode o) {

        if (base == o.val) {
            count++;
        } else {
            base = o.val;
            count = 1;
        }
        if (count == maxCount) {
            res.add(o.val);
        }
        if (count > maxCount) {
            res.clear();
            res.add(o.val);
            maxCount = count;
        }


    }

    public static void main(String[] args) {
        System.out.println(URLDecoder.decode("%5B%7B%22firstPostName%22%3A%22%E8%81%8C%E5%91%98%22%2C%22postionslevel%22%3A%22GLRY%22%2C%22nation%22%3A%2201%22%2C%22departmentId%22%3A%22B2000004711%22%2C%22orgcode%22%3A%22B2000004711%22%2C%22sex%22%3A%222%22%2C%22mobile%22%3A%2213940839810%22%2C%22postionStatus%22%3A%22ZG%22%2C%22identityCard%22%3A%22150207199002024727%22%2C%22employeeNo%22%3A%22B1000030671%22%2C%22layout%22%3A%22LWPQ%22%2C%22companyId%22%3A%22A1000001226%22%2C%22isDeleted%22%3A%220%22%2C%22firstPostNo%22%3A%2201010Y01%22%2C%22sideline%22%3A%5B%7B%22dwcode%22%3A%22A1000001226%22%2C%22gwcode%22%3A%22ceshi%22%2C%22gwname%22%3A%22%E6%B5%8B%E8%AF%95%E8%A7%92%E8%89%B2%22%2C%22id%22%3A%22B1000030671%22%2C%22depcode%22%3A%22B2000004711%22%2C%22status%22%3A%22%E5%BC%93%E7%88%B1%E4%BA%91%22%7D%5D%2C%22isDisabled%22%3A%220%22%2C%22email%22%3A%221198084656%40qq.com%22%2C%22username%22%3A%22%E5%BC%93%E7%88%B1%E4%BA%91%22%7D%5D"));
    }
}