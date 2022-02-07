import io.reactivex.rxjava3.core.Observable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Observable.just(1,2,3,4,5).subscribe(System.out::println);
    }
}
