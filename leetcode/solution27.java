public class solution27 {
    
        public int removeElement(int[] nums, int val) {
            int k = 0; // k will track the number of elements not equal to 'val'
            
            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // If current element is not equal to 'val', move it to the front
                if (nums[i] != val) {
                    nums[k] = nums[i]; // Move the element to the k-th position
                    k++; // Increment the count of valid elements
                }
            }
            
            // After this loop, k will be the new length of the array excluding 'val' values
            return k; // Return the count of elements that are not equal to 'val'
        }
    
        public static void main(String[] args) {
            solution27 solution = new solution27();
            
            // Test case 1
            int[] nums1 = {3, 2, 2, 3};
            int val1 = 3;
            int k1 = solution.removeElement(nums1, val1);
            System.out.println("k = " + k1 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, k1)));
            
            // Test case 2
            int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
            int val2 = 2;
            int k2 = solution.removeElement(nums2, val2);
            System.out.println("k = " + k2 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, k2)));
        }
    }
    

