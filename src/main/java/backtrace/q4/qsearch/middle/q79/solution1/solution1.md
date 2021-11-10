方法一：回溯
思路与算法

设函数 check(i,j,k) 表示判断以网格的 (i,j) 位置出发，能否搜索到单词 word[k..]，其中 word[k..] 表示字符串 word 从第 kk 个字符开始的后缀子串。
如果能搜索到，则返回 true，反之返回 false。函数 check(i,j,k) 的执行步骤如下：

如果 board[i][j] / s[k]，当前字符不匹配，直接返回false。
如果当前已经访问到字符串的末尾，且对应字符依然匹配，此时直接返回 true。
否则，遍历当前位置的所有相邻位置。如果从某个相邻位置出发，能够搜索到子串 word[k+1..]，则返回 true，否则返回 false。
这样，我们对每一个位置 (i,j) 都调用函数 check(i,j,0) 进行检查：只要有一处返回 true，就说明网格中能够找到相应的单词，否则说明不能找到。

为了防止重复遍历相同的位置，需要额外维护一个与 board 等大的 visited 数组，用于标识每个位置是否被访问过。每次遍历相邻位置时，需要跳过已经被访问的位置。

代码

C++JavaPython3JavaScriptGolangC

class Solution {
public boolean exist(char[][] board, String word) {
int h = board.length, w = board[0].length;
boolean[][] visited = new boolean[h][w];
for (int i = 0; i < h; i++) {
for (int j = 0; j < w; j++) {
boolean flag = check(board, visited, i, j, word, 0);
if (flag) {
return true;
}
}
}
return false;
}

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}
复杂度分析

时间复杂度：一个非常宽松的上界为 O(MN⋅3 3^L)，其中 M, NM,N 为网格的长度与宽度，L 为字符串 word 的长度。在每次调用函数 check 时，除了第一次可以进入 4 个分支以外，
其余时间我们最多会进入 3 个分支（因为每个位置只能使用一次，所以走过来的分支没法走回去）。由于单词长为 L，故 check(i,j,0) 的时间复杂度为 O(3^L)，
而我们要执行 O(MN) 次检查。然而，由于剪枝的存在，我们在遇到不匹配或已访问的字符时会提前退出，终止递归流程。因此，实际的时间复杂度会远远小于 Θ(MN⋅3 3^L)。

空间复杂度：O(MN)。我们额外开辟了 O(MN) 的 visited 数组，同时栈的深度最大为 O(min(L,MN))。
