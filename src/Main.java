import Services.BookService;
import Services.UserService;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    User user = new User("John", "Doe");
    UserService obj= new UserService();
    obj.addUser();
    BookService obj2 = new BookService();
    obj2.addBook();




    }
}
//