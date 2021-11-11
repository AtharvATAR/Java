public class stringnoProject {
    public static void main(String args[]) {
        String string;
        string = "hello my name is Aarav Gupta";
        int c = 0, w = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                w++;
            } else {
                c++;
            }
        }
        w++;
        System.out.println("No of characters = " + c + " and words = " + w);
    }
}