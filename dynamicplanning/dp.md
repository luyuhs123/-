##动态规划中01背包和完全背包的区别
###1.在于完全背包是可以重复使用的，而普通01背包，就只有一个物品用完就没了
###2.遍历顺序不同，01背包若只使用一个数组，应该从后往前遍历，若从前往后，会导致后面的背包重复装载前面的物品
###3.完全背包则是从前往后，因为物品数量是无限的所以可以重复装

##背包问题一般求的是在一定背包容量下最大价值是多少
### 经典问题：分割等和子集