class Main {
	static int lis(int nums[])
    {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
	public static void main(String args[]) {
		// Your code goes here
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println(lis(arr));
	}
}
