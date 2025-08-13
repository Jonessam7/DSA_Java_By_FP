package August12_DSA02;

public class TwoDArray {
		public static void main(String[] args) {
			int[][] arr = new int[4][4];
			arr[0][0] = 1;
			arr[0][1] = 2;
			arr[0][2] = 3;
			arr[0][3] = 4;

			arr[1][0] = 5;
			arr[1][1] = 6;
			arr[1][2] = 7;
			arr[1][3] = 8;

			arr[2][0] = 9;
			arr[2][1] = 10;
			arr[2][2] = 11;
			arr[2][3] = 12;

			arr[3][0] = 13;
			arr[3][1] = 14;
			arr[3][2] = 15;
			arr[3][3] = 16;


			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
