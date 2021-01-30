package by.boris.structuralPatterns.adapter;
import java.util.Arrays;
import java.util.List;
/** Клиент который хочет печатать на принтере не одну страницу а сразу много (List) страниц.
    Для этого будет использовать адаптер.*/
public class MainClient {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("text-1", "text-2", "text-3");

        Adapter adapter = new Adapter();
        adapter.printList(list);
    }
}
