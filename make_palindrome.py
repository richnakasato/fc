def make_palindrome(input):
    left = 0
    right = len(input) - 1
    is_pal = True
    stack = list()
    while left < len(input) - 1:
        if input[left] != input[right]:
            is_pal = False
        stack.append(input[left])
        left += 1
        right -= 1
    if is_pal:
        return input
    else:
        if input[left] == stack[-1]:
            stack.pop()
        while len(stack):
            input += stack.pop()
        return input
