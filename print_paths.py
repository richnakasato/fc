import copy

def print_paths(board):
    r, c = len(board), len(board[0])
    paths_board = [[list() for cols in range(c)] for rows in range(r)]
    start = (0, 0)
    curr = end = (len(board)-1, len(board[0])-1)
    print_paths_helper(board, paths_board, start, end, curr, None)
    print(paths_board)

def valid_pos(board, pos):
    if 0 <= pos[0] < len(board) and 0 <= pos[1] < len(board[0]):
        return True
    else:
        return False

def print_paths_helper(board, paths_board, start, end, curr, prev):
    if prev == None:
        path = board[curr[0]][curr[1]]
        paths_board[curr[0]][curr[1]] = [path]
    else:
        paths = copy.deepcopy(paths_board[prev[0]][prev[1]])
        new_paths = list()
        for path in paths:
            new_paths.append(board[curr[0]][curr[1]] + path)
        paths_board[curr[0]][curr[1]].append(new_paths)
    up = (curr[0]-1, curr[1])
    if valid_pos(board, up):
        print_paths_helper(board, paths_board, start, end, up, curr)
    left = (curr[0], curr[1]-1)
    if valid_pos(board, left):
        print_paths_helper(board, paths_board, start, end, left, curr)


def main():
    board = [['A', 'B'],
             ['C', 'D']]
    print(print_paths(board))

if __name__ == "__main__":
    main()

