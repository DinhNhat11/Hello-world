public class Lab2 {
    public static void main(String[] args) {
        int SEED = 301524;
        int score = 0;
        String seedStr = Integer.toString(SEED);

        for (int i = 0; i < seedStr.length(); i++) {
            char digit = seedStr.charAt(i);
            int numericValue = Character.getNumericValue(digit);

            if (numericValue == 1) {
                method1();
            } else if (numericValue == 2) {
                method2();
            }

            else if (numericValue == 3) {
                method3();
            }

            else {
                System.out.println("Unknown location " + numericValue);
            }
        }

    }

    public static void method1() {
        System.out.print("You are standing at the end of a road before a small brick building.");
    }

    public static int method2(int n) {
        System.out.print("You are in a maze of " + n + " twisty little passages, all alike");
        return -n / 2;
    }

    public static int method3(boolean a) {
        if (a == true) {
            System.out.print("You are on the edge of the breath-taking view.");
            return 3;
        } else {
            System.out.print("It is pitch black. You are likely ot be eaten by a grue.");
            return -3;
        }
    }

    public static int method4(int width, int depth) {
        System.out.print("You are in a north/south canon about" + width + "feet acroos and" + depth + " feet deep");
        return width * depth / 100;
    }
}
