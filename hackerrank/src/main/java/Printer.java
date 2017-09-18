public class Printer<T> {

    public void printArray (T[] ar) {
        for (T obj : ar) {
            System.out.println(obj);
        }
    }
}
