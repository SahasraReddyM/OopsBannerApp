public class BannerUC4 {

    public static void main(String[] args) {

        // Step 1: Create String array to hold banner lines
        String[] banner = {

                String.join("", "***************"),
                String.join("", "*             *"),
                String.join("", "*   WELCOME   *"),
                String.join("", "*      TO     *"),
                String.join("", "*   JAVA UC4  *"),
                String.join("", "*             *"),
                String.join("", "***************")

        };

        // Step 2: Use enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}