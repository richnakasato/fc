def better_fibonacci(n):
    if n < 2:
        return n
    fib_n2 = 0
    fib_n1 = 1
    fib_n0 = 0
    for i in range(2, n+1):
        fib_n0 = fib_n2 = fib_n1
        fib_n2 = fib_n1
        fib_n1 = fib_n0
    return fib_n0
