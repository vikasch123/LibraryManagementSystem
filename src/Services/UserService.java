package Services;

import models.User;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private List<User> users=new ArrayList<User>();
    Scanner sc=new Scanner(System.in);




    public void addUser()
    {
        System.out.println("Enter Username: ");
        String userName=sc.nextLine();
        System.out.println("Enter Password: ");
        String password=sc.nextLine();
        users.add(new User(userName,password));
        System.out.println("User Added");
    }




}
