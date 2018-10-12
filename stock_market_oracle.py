def max_profit(prices):
    profit = 0
    for i in range(1,len(prices)):
        val = prices[i] - prices[i-1]
        if val > 0:
            profit+=val
    return profit

def main():
    arr = [1,8,2,8,9]
    print(max_profit(arr))

if __name__ == "__main__":
    main()
