class RankList {
    public static void main(String[] args) {

        int[] a = {4, 3, 7, 2, 6, 1};

        int minRank = a[0];
        int count = 0;

        for(int i = 1; i < a.length; i++) {

            if(arr[i] < minRank) {
                count++;
                minRank = arr[i];
            }
        }

        System.out.println("Number of ranks cut in the list: "+count);
    }
}
