public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] x) {
		int y = 0;
		for (int a = 0; a < x.length; a++) {
			for (int b = 0; b < x[a].length; b++) {
				y = y + x[a][b];
			}
		}
		return y;
	}

	public static int sumRow(int[][] x, int row) {
		int sum = 0;
		for (int a = 0; a < x[row].length; a++) {
			sum = sum + x[row][a];
		}
		return sum;
	}
	

	public static int sumColumn(int[][] x, int column)  {
       int sum = 0;
       for (int a = 0; a < x.length; a++) {
               sum = sum + x[a][column];
           }
       return sum;
   }



}