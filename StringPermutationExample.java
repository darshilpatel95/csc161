public class Exercise18_29 {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("abc");
        permute(input, 0, input.length());
        System.out.println("\n");
    }
    static void exchange(StringBuilder input, int i, int j) {
        String temp;
        temp = input.substring(i, i + 1);
        input.replace(i, i + 1, input.substring(j, j + 1));
        input.replace(j, j + 1, temp);
    }
    static void permute(StringBuilder input, int i, int length) {
        if (i == length - 1) {
            System.out.print(input.toString() + ",");
        } else {
            for (int j = i; j < length; ++j) {
                exchange(input, i, j);
                permute(input, i + 1, length);
                exchange(input, i, j);
            }
        }
    }
}