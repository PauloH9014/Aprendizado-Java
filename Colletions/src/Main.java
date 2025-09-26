import List.ArrayList.UserArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void ListUsers(){
        UserArrayList newUsers = new UserArrayList("");
        newUsers.listUser();

        System.out.println(newUsers);
    }


    public static void main(String[] args) {
    Main newRun = new Main();

    newRun.ListUsers();
    }
}