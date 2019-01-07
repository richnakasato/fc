def can_move(board, unseen, cur_pos):
    r,c = cur_pos
    max_r,max_c = len(board), len(board[0])
    if 0 <= r < max_r and 0 <= c < max_c and unseen[r][c]:
        return True
    else:
        return False


def helper(board, unseen, cur_pos, remainder, results):
    if not remainder:
        result.append(True)
    r,c = cur_pos
    if remainder and board[r][c] == remainder[0]:
        unseen[r][c] = False
        new_remainder = remainder[1:]
        up = (r-1,c)
        if can_move(board, unseen, up):
            helper(board, unseen, up, new_remainder, results)
        down = (r+1,c)
        if can_move(board, unseen, down):
            helper(board, unseen, down, new_remainder, results)
        left = (r,c-1)
        if can_move(board, unseen, left):
            helper(board, unseen, left, new_remainder, results)
        right = (r,c+1)
        if can_move(board, unseen, right):
            helper(board, unseen, right, new_remainder, results)


def solution(board, word):
    results = list()
    rows = range(len(board))
    cols = range(len(baord[0]))
    for row in rows:
        for col in cols:
            if board[row][col] == word[0]:
                unseen = [[True for c in cols] for r in rows]
                start = (row,col)
                helper(board, unseen, start, word, results)
    return any(results)

