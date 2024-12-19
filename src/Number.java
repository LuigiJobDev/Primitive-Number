public class Number {
    String text = "Number: ";
    int myNum = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'L';
    boolean myBool = true;
    String myText = "Hello";

    public void printNumber() {
        System.out.println(text);
        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum );
        System.out.println("Character: " + myLetter );
        System.out.println("Boolean: " + myBool );
        System.out.println("String: " + myText );
    }
}