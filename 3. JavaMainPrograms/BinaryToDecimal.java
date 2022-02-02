class BinaryToDecimal {
    static int binaryToDecimal(int n) {
        int num = n;
        int decimalNum = 0;

        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            decimalNum += last_digit * base;

            base = base * 2;
        }

        return decimalNum;
    }

    public static void main(String[] args) {
        int num = 10101001;
        System.out.println(binaryToDecimal(num));
    }
}