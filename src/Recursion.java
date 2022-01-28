import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Sum Digits: " + sumDigits(367));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Fibonacci (5): " + fibonacci(5));
        System.out.println("Sum List: " + sumList(List.of(4, 5, 6, 7)));
        System.out.println("Palindrome?: " + isPalindrome("racecar"));
        System.out.println("Power: " + power(3, 3));
        BinaryTree.TreeNode node = new BinaryTree.TreeNode(7, null, null);
        node.left = new BinaryTree.TreeNode(3, null, null);
        node.right = new BinaryTree.TreeNode(11, null, null);
        node.right.left = new BinaryTree.TreeNode(9, null, null);
        node.right.right = new BinaryTree.TreeNode(12, null, null);
        System.out.println("Num Leaves: " + numLeaves(node));
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(Math.floorDiv(n, 10));
    }

    /**
     * Returns the factorial of n.
     * @param n the value.
     * @return n!
     */
    public static int factorial(int n) {
        // TODO: Write this recursively.
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    /**
     * Returns the nth fibonacci number.
     * @param n the value.
     * @return F_n
     */
    public static int fibonacci(int n) {
        // TODO: Write this recursively.
        return n == 0 || n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Returns the sum of the values in an ArrayList.
     * @param list the array list.
     * @return the sum.
     */
    public static int sumList(List list) {
        // TODO: Write this recursively.
        return list.isEmpty() ? 0 : (int) list.get(0) + sumList(list.subList(1, list.size()));
    }

    public static boolean isPalindrome(String s) {
        // TODO: Write this recursively.
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static int power(int base, int power) {
        // TODO: Write this recursively.
        if (power == 0) {
            return 1;
        }
        return base * power(base, power - 1);
    }

    public static int numLeaves(BinaryTree.TreeNode myTree) {
        // TODO: Write this recursively.
        if (myTree == null) {
            return 0;
        }
        if (myTree.left == null && myTree.right == null) {
            return 1;
        }
        int numLeft = numLeaves(myTree.left);
        int numRight = numLeaves(myTree.right);
        return numLeft + numRight;
    }

}
