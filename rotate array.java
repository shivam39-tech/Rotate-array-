public class Main {
    public static void main(String[] args) {
        ArrayRotator rotator = new ArrayRotator();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        rotator.rotate(nums, k);
        System.out.println(Arrays.toString(nums)); // Output: [4, 5, 1, 2, 3]
    }
}
