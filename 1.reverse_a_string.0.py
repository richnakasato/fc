def reverse_string(a_string):
    outstring = ''
    for i in range(len(a_string)-1, -1, -1):
        outstring += a_string[i]
    return outstring
