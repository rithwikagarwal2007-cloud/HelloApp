public class helloappuc4 {

    public static void main(String[] args) {

        String message;

        // Check if any command-line arguments were provided
        if (args.length > 0) {

            StringBuilder names = new StringBuilder();

            // Loop through all arguments
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                // Add comma and space between names
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            message = "Hello, " + names.toString() + "!";
        } 
        else {
            // Default message when no arguments are given
            message = "Hello, World!";
        }

        // Display greeting
        System.out.println(message);
    }
}