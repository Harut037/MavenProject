package org.example.exceptions;

public class Email {

    private String email;

    public String getEmail() {
        return email;
    }

    /**
     * This method setting valid emails.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
        try {
            if (getEmail().charAt(getEmail().length() - 1) != 'u'){
                throw new IllegalArgumentException();
            } else if (getEmail().charAt(getEmail().length() - 2) != 'r') {
                throw new IllegalArgumentException();
            }else if (getEmail().charAt(getEmail().length() - 3) != '.') {
                throw new IllegalArgumentException();
            }else if (getEmail().charAt(getEmail().length() - 4) != 'l') {
                throw new IllegalArgumentException();
            }else if (getEmail().charAt(getEmail().length() - 5) != 'i') {
                throw new IllegalArgumentException();
            }else if (getEmail().charAt(getEmail().length() - 6) != 'a') {
                throw new IllegalArgumentException();
            }else if (getEmail().charAt(getEmail().length() - 7) != 'm') {
                throw new IllegalArgumentException();
            }else if (getEmail().charAt(getEmail().length() - 8) != '@') {
                throw new IllegalArgumentException();
            }
            System.out.println("\n\nYour email is " + getEmail());
        }catch (IllegalArgumentException e){
            System.out.print("\n\nThe email invalid, must be completed with (@mail.ru).");
        }

    }
}
