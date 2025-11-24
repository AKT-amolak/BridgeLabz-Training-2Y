import java.util.List;

public void printList(List<? extends Number> list) {
    for (Number num : list) {
        System.out.println(num);
    }
}
