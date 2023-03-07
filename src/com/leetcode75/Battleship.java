package com.leetcode75;

public class Battleship {
	static public int countBattleships(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'X') {
					if (i + 1 < board.length && j + 1 < board[0].length) {
						if (i == 0) {
							count++;
						} else if (board[i - 1][j] != 'X') {
							count++;
						}
					}

				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'X' } };
		System.out.println(countBattleships(board));
	}
}
