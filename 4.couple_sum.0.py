def couple_sum(numbers, target):
    memo = dict()
    for i,v in enumerate(numbers):
        if memo[v] not in memo:
            memo[v] = i
        if target-v in memo:
            return [memo[target-v]+1, i+1]
    return None


def main():
    pass


if __name__ == "__main__":
    main()

