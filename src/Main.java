import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 100000;

        // ArrayList 성능 테스트
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.ensureCapacity(5000);
        long startTime = System.nanoTime();
        for(int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList 추가 시간: " + (endTime - startTime) / 1_000_000 + " ms");

        // LinkedList 성능 테스트
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for(int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 추가 시간: " + (endTime - startTime) / 1_000_000 + " ms");

        // ArrayList 조회 시간
        startTime = System.nanoTime();
        for(int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 조회 시간: " + (endTime - startTime) / 1_000_000 + " ms");

        // LinkedList 조회 시간
        startTime = System.nanoTime();
        for(int i = 0; i < size; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 조회 시간: " + (endTime - startTime) / 1_000_000 + " ms");

        // ArrayList 삭제 시간 (중간 삭제)
        startTime = System.nanoTime();
        for(int i = size - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 삭제 시간: " + (endTime - startTime) / 1_000_000 + " ms");

        // LinkedList 삭제 시간 (중간 삭제)
        startTime = System.nanoTime();
        for(int i = size - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 삭제 시간: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
