def match(first, second):
    l = r = 0
    last_wild = None
    while l < len(first) and r < len(second):
        if first[l] == '?' or first[l] == '*':
            last_wild = first[l]
        if not last_wild:
            if first[l] != second[r]:
                return False
            l += 1
            r += 1
        elif last_wild == '?':
            l += 1
            r += 1
        else: # last_wild == '*'
            l += 1
            while first[l] != second[r] and r < len(second):
                r += 1
        last_wild = None
    if l != len(first) or r != len(second):
        return False
    else:
        return True
