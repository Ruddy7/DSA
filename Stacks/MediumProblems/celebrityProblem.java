package Stacks.MediumProblems;

//Using 2 pointers to solve Celebrity Problem

public class celebrityProblem {
    public static int celebrity(int[][] mat) {
        int n = mat.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (mat[j][i] == 1)
                j--;
            else
                i++;
        }

        int c = i;
        for (i = 0; i < n; i++) {
            if (i == c)
                continue;
            if (mat[c][i] == 1 || mat[i][c] == 0)
                return -1;
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 } };
        System.out.println(celebrity(mat));
    }
}
