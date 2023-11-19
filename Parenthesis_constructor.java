import java.io.*;

class Parenthesis_constructor {
    class Test {
        int id;
        String name;

        Test(int num, String str) {
            id = num;
            name = str;
        }

        void display() {
            System.out.println(id + " " + name);
        }
    }

    public static void main(String[] args) {
        Parenthesis_constructor hello = new Parenthesis_constructor();
        Test testObj = hello.new Test(1001, "ABC");
        testObj.display();
    }
}


