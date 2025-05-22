import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    
        public static void main(String[] args) {
            List<User> users = List.of(new User(name:"Maria", age 21), new User(name:"João", age 32), new User   (name: "Eduado", age 40), new User(name"Ana", age 19));
            //users.forEach(System.out::println);
            printStringValue(Record::toString, users);
    }
        private static void printStringValue(Function<User, String> callback, List<User> users) {
            users.forEach(u -> System.out.println(callback.apply(u)));
        }
}
