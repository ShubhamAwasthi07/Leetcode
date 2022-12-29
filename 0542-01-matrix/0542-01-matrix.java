class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length;
		int n = mat[0].length;
		int inf = m + n;
		int first;
		int second;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					continue;
				}
				first = inf;
				second = inf;
				if (i > 0) {
					first = mat[i - 1][j];
				}
				if (j > 0) {
					second = mat[i][j - 1];
				}
				mat[i][j] = Math.min(first, second) + 1;
			}
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (mat[i][j] == 0) {
					continue;
				}
				first = inf;
				second = inf;
				if (i < m - 1) {
					first = mat[i + 1][j];
				}
				if (j < n - 1) {
					second = mat[i][j + 1];
				}
				mat[i][j] = Math.min(Math.min(first, second) + 1, mat[i][j]);
			}
		}
		return mat;
    }
}