import random

def chocolate_adder(left, right):
    if left < right:
        return 0, 1
    if left > right:
        return 1, 0
    return 0, 0

def distribute_chocolate(points):
    chocos = list()
    ppl_count = len(points)
    if ppl_count < 2:
        return ppl_count
    if ppl_count > 1:
        chocos = [1] * ppl_count
        done = False
        while not done:
            done = True
            for idx in range(ppl_count-1):
                lp, rp = chocolate_adder(points[idx], points[idx+1])
                lc, rc = chocolate_adder(chocos[idx], chocos[idx+1])
                if (lp != 0 or rp != 0) and ((lp, rp) != (lc, rc)):
                    done = False
                    chocos[idx] += lp
                    chocos[idx+1] += rp
    return sum(chocos)


def main():
    points1 = []
    print(distribute_chocolate(points1))
    points2 = [2, 3, 3, 2, 1, 5, 2]
    print(distribute_chocolate(points2))
    points3 = [2]
    print(distribute_chocolate(points3))
    points4 = [1, 5, 7, 1]
    print(distribute_chocolate(points4))
    points5 = [3, 2, 1]
    print(distribute_chocolate(points5))

if __name__ == "__main__":
    main()

