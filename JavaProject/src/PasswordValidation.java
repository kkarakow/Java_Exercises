public class PasswordValidation {

    public PasswordValidation() {
    }

    public boolean password(String pass) {
        int count = 0;
        int special = 1;
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
                    special +=1;
                }
                else if (special ==1) {
                    specialflag = true;
                }
                else {
                    specialflag = false;
                }
            }
            if (upperflag && digitflag && specialflag) {
                System.out.println("Logged In.");
                return true;
            } else {
                System.out.println("Invalid Password.");
                if (!upperflag) {
                    System.out.println("Please add atleast one uppercase character.");
                }
                if (!specialflag) {
                    System.out.println("Please add only one special character.");
                }
                if (!digitflag) {
                    System.out.println("Please add only 2 or 3 digits.");
                }
                return false;
            }

        } else {
            System.out.println("Incorrect password");
            return false;
        }
    }
}
