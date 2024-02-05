package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array<String> a = new Array<>();
        a.add("Vova");
        a.add("Vova");
        a.add("Misha");

        a.printElements();

        a.remove("Vova");
        a.printElements();

    }
}