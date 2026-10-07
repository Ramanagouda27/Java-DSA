package PavanSir.Strings;

public class IntroSting {
    public static void main(String[] args) {
        String a = "Ram Patil";
        System.out.println(a);

        // to break the strings into array of characters
        //to print we have to use the method called toCharArray()
        for(char i : a.toCharArray()){
            System.out.println(i);
        }
    }
}
