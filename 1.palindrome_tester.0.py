def is_palindrome(input_string):
    #TODO: error handle
    left = 0
    right = len(input_string) - 1
    while left <= right:
        if input_string[left] != input_string[right]:
            return False
        else:
            left += 1
            right -= 1
    return True


def main():
    test1 = "madam"
    test2 = "racecar"
    test3 = "race car"
    test4 = ''
    test5 = 'aabb'
    print(is_palindrome(test1))
    print(is_palindrome(test2))
    print(is_palindrome(test3))
    print(is_palindrome(test4))
    print(is_palindrome(test5))

if __name__ == "__main__":
    main()

