class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }

        int[] nums3 = new int [m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }

        int i = 0, j = 0;

        while (i < m && j < n) {
            if (nums3[i] < nums2[j]) {
                nums1[i + j] = nums3[i++];
            } else {
                nums1[i + j] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[i + j] = nums3[i++];
        }

        while (j < n) {
            nums1[i + j] = nums2[j++];
        }


    }
}