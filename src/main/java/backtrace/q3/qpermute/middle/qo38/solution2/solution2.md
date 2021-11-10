方法二：下一个排列
思路及解法

我们可以这样思考：当我们已知了当前的一个排列，我们能不能快速得到字典序中下一个更大的排列呢？

答案是肯定的，参见「31. 下一个排列的官方题解」，当我们已知了当前的一个排列，我们可以在 O(n) 的时间内计算出字典序下一个中更大的排列。这与 C++ 中的 next_permutation 函数功能相同。

具体地，我们首先对给定的字符串中的字符进行排序，即可得到当前字符串的第一个排列，然后我们不断地计算当前字符串的字典序中下一个更大的排列，直到不存在更大的排列为止即可。

这个方案的优秀之处在于，我们得到的所有排列都不可能重复，这样我们就无需进行去重的操作。同时因为无需使用回溯法，没有栈的开销，算法时间复杂度的常数较小。

代码

C++JavaC#JavaScriptGolangC

class Solution {
public String[] permutation(String s) {
List<String> ret = new ArrayList<String>();
char[] arr = s.toCharArray();
Arrays.sort(arr);
do {
ret.add(new String(arr));
} while (nextPermutation(arr));
int size = ret.size();
String[] retArr = new String[size];
for (int i = 0; i < size; i++) {
retArr[i] = ret.get(i);
}
return retArr;
}

    public boolean nextPermutation(char[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = arr.length - 1;
        while (j >= 0 && arr[i] >= arr[j]) {
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i + 1);
        return true;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(char[] arr, int start) {
        int left = start, right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
复杂度分析

时间复杂度：O(n×n!)，其中 nn 为给定字符串的长度。我们需要 O(nlogn) 的时间得到第一个排列，nextPermutation 函数的时间复杂度为 O(n)，我们至多执行该函数 O(n!) 次，
因此总时间复杂度为 O(n×n!+nlogn)=O(n×n!)。

空间复杂度：O(1)。注意返回值不计入空间复杂度。
