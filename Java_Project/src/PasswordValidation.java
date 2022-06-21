public class PasswordValidation {
    // Step 2 - Password Validation
    /**
     *
     * @author Ishwin Singh Bajaj
     */
    public static boolean password(String pass) {
        int count = 0;
        int special = 0;
        if (pass.length() >= 10) {
            boolean upperflag = false;
            boolean digitflag = false;
            boolean specialflag = false;
            for (int i = 0; i < pass.length(); i++) {
                if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                    upperflag = true;
                    break;
                }
            }
            for (int z = 0; z < pass.length(); z++) {
                if (Character.isDigit(pass.charAt(z))) {
                    count += 1;
                }
            }
            if (count == 2 || count == 3) {
                digitflag = true;
            } else {
                digitflag = false;
            }
            for (int w = 0; w < pass.length(); w++) {
                if (!(Character.isDigit(pass.charAt(w)) || Character.isLetter(pass.charAt(w)))) {
                    special += 1;
                }
            }
            if (special == 1) {
                specialflag = true;
            } else {
                specialflag = false;
            }
            if (upperflag && digitflag && specialflag) {
                System.out.println("Logged In.");
                return true;
            } else {
                System.out.println("Invalid Password.");
                if (!upperflag) {
                    System.out.println("Please add an uppercase character.");
                }
                if (!specialflag) {
                    System.out.println("Please add one special character.");
                }
                if (!digitflag) {
                    System.out.println("Please add a digit.");
                }
                return false;
            }

        } else {
            System.out.println("Incorrect password");
            return false;
        }
    }
}
