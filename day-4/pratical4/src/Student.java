public class Student {
    private String name;
    private String email;
    private char gender;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if((gender == 'M') || (gender == 'F')){
            this.gender = gender;
        }else {
            this.gender = 'M';
            System.out.println("Input invalid. Default gender set as M");


        }

    }
}
