def distributeChocolate(points):
    n_stu = len(points)
    choco = [1] * n_stu
    for i in range(n_stu-1):
        if points[i] < points[i+1]:
            choco[i+1] += abs(choco[i] - choco[i+1]) + 1
    for i in range(n_stu-1, 0, -1):
        if points[i] < points[i-1] and choco[i] >= choco[i-1]:
            choco[i-1] += abs(choco[i] - choco[i-1]) + 1
    return sum(choco)


def main():
    pass

if __name__ == "__main__":
    main()

