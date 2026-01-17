class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int start = 0;
        int end = m;

        while (start <= end) {
            int part1 = (start + end)/2;
            int part2 = (m + n + 1)/2 - part1;

            int maxLeft1=(part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int minRight1=(part1 == m) ? Integer.MAX_VALUE : nums1[part1];

            int maxLeft2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int minRight2 = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                end = part1 - 1;
            } else {
                start = part1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not valid for median.");
    }

    public static void main(String[] args) {
        int nums1[] = {1, 3};
        int nums2[] = {3, 4};
        System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
    }
}
