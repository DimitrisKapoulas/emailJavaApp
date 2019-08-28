package emailApp;

public class emailApp {
    public static void main(String[] args){

        email em1 = new email("John","Smith");
        em1.setAlternateEmail("js@gmail.com");
        System.out.println(em1.getAlternateEmail());
    }
}
