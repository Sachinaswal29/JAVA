class jagged {
    public static void main(String args[]) {
        int arr[][] = new int[3][];
        int[] a = { 3, 4 };
        int[] b = { 8, 9, 7 };
        int[] c = { 6 };
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
