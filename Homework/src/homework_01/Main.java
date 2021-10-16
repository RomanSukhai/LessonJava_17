package homework_01;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        Collection collection = new Collection(a);
        Iterator iterator = collection.createdForward();
        while ( iterator.hasNext()){
            System.out.println( iterator.next());
        }
        System.out.println("______________________________________________________");

        Integer[] b = {1,2,3,4,5,6,7,8,3,2,224,244,22,23,56,87,345};
        Collection collection2 = new Collection(b);
        Iterator iterator2 = collection2.createdBackword();
        while ( iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("______________________________________________________");
        Iterator iterator3 = collection2.createdAnonimus();
        while ( iterator3.hasNext()){
            boolean flag = iterator3.next()%2==0;
            if (flag){
                System.out.println(iterator3.next());
            }

        }
        System.out.println("______________________________________________________");
        Iterator iterator4 = collection2.createdclass();
        while ( iterator4.hasNext()){
            System.out.println(iterator4.next());
        }
        System.out.println("______________________________________________________");
        Iterator iterator5 = collection2.createdCountNumber();
        while ( iterator5.hasNext()){
            System.out.println(iterator5.next());
        }



    }
}
