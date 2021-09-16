两个指针，left 和 right，从两个方向去遍历。

那么什么时候从左到右，什么时候从右到左呢？根据下边的代码的更新规则，我们可以知道

Java

max_left = Math.max(max_left, height[i - 1]);
height [ left - 1] 是可能成为 max_left 的变量， 同理，height [ right + 1 ] 是可能成为 right_max 的变量。

只要保证 height [ left - 1 ] < height [ right + 1 ] ，那么 max_left 就一定小于 max_right。

因为 max_left 是由 height [ left - 1] 更新过来的，而 height [ left - 1 ] 是小于 height [ right + 1] 的，而 height [ right + 1 ] 会更新 max_right，所以间接的得出 max_left 一定小于 max_right。

反之，我们就从右到左更。

Java

public int trap(int[] height) {
int sum = 0;
int max_left = 0;
int max_right = 0;
int left = 1;
int right = height.length - 2; // 加右指针进去
for (int i = 1; i < height.length - 1; i++) {
//从左到右更
if (height[left - 1] < height[right + 1]) {
max_left = Math.max(max_left, height[left - 1]);
int min = max_left;
if (min > height[left]) {
sum = sum + (min - height[left]);
}
left++;
//从右到左更
} else {
max_right = Math.max(max_right, height[right + 1]);
int min = max_right;
if (min > height[right]) {
sum = sum + (min - height[right]);
}
right--;
}
}
return sum;
}
时间复杂度： O(n)。

空间复杂度： O(1)。
