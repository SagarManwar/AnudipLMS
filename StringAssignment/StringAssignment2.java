package Assigments.StringAssignment;
public class StringAssignment2 {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");

        // 1. Adds the string "- This is a sample program" to the existing string and display it.
        stringBuffer.append("- This is a sample program");
        System.out.println("After appending: " + stringBuffer);

        // 2. Inserts the string "Object" into the existing string at the 21st position and display it.
        stringBuffer.insert(21, "Object");
        System.out.println("After inserting 'Object': " + stringBuffer);

        // 3. Reverses the entire string and displays it.
        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);

        // 4. Replaces the word "Buffer" with "Builder" and display it.
        int bufferIndex = stringBuffer.indexOf("Buffer");
        stringBuffer.replace(bufferIndex, bufferIndex + "Buffer".length(), "Builder");
        System.out.println("After replacing 'Buffer' with 'Builder': " + stringBuffer);
    }
}
