123. 买卖股票的最佳时机 III



int maxProfit(vector<int>& prices) {
// 因为只能交易 2 次，所以定义 2 组 buy 和 sell
int fstbuy = INT_MIN, fstsell = 0;
int secbuy = INT_MIN, secsell = 0;
for (auto& p : prices)
{
fstbuy = max(fstbuy, -p);			// 第一次买 -p
fstsell = max(fstsell, fstbuy + p);	// 第一次卖 fstbut + p
secbuy = max(secbuy, fstsell - p);	// 第一次卖了后现在买 fstsell - p
secsell = max(secsell, secbuy + p);	// 第二次买了后现在卖 secbuy + p
}
return secsell;
}

121. 买卖股票的最佳时机


int maxProfit(vector<int>& prices) {
int buy = INT_MIN, sell = 0;

    for (auto& p : prices)
    {
        buy = max(buy, -p);         // max(不买，买了)
        sell = max(sell, buy + p);  // max(不卖，卖了)
    }
    return sell;
}

122. 买卖股票的最佳时机 II



int maxProfit(vector<int>& prices) {
int buy = INT_MIN, sell = 0;
// 因为需要多次买卖，所以每天都要尝试是否能获得更多利润
for (auto& p : prices)
{
int buynow = max(buy, sell - p);
int sellnow = max(sell, buy + p);
buy = buynow;
sell = sellnow;
}
return sell;
}
188. 买卖股票的最佳时机 IV



int maxProfit(int k, vector<int>& prices) {
// 因为只能交易 k 次，所以定义 k 组 buy 和 sell
vector<int> buy(k + 1, INT_MIN), sell(k + 1, 0);
for (auto& p : prices)
{
for (int i = 1; i <= k; ++i)
{
buy[i] = max(buy[i], sell[i - 1] - p);  // 卖了买
sell[i] = max(sell[i], buy[i] + p);     // 买了卖
}
}
return sell[k];
}
714. 买卖股票的最佳时机含手续费



int maxProfit(vector<int>& prices, int fee) {
int buy = INT_MIN, sell = 0;
// 在买入或卖出时减去手续费即可
for (auto& p : prices)
{
int buynow = max(buy, sell - p - fee);
int sellnow = max(sell, buy + p);
buy = buynow;
sell = sellnow;
}

    return sell;
}
309. 最佳买卖股票时机含冷冻期



int maxProfit(vector<int>& prices) {
int buy = -prices[0], sell = 0, lock = 0;
// 因为有冷冻期，所以定义变量 lock 表示无法交易的时候
for (auto& p : prices)
{
int buynow = max(buy, lock - p);
int sellnow = max(sell, buy + p);
lock = sell;
buy = buynow;
sell = sellnow;
}
return sell;
}