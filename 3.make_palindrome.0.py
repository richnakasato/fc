from collections import deque

def make_palindrome(input):
    lhs, rhs = 0, len(input) - 1
    append = False
    queue = deque()
    while lhs <= rhs:
        queue.appendleft(input[lhs])
        if input[lhs] == input[rhs]:
            lhs += 1
            rhs -= 1
        else:
            lhs += 1
            append = True
    if append:
        input = input + ''.join(queue)[1:]
    return input
