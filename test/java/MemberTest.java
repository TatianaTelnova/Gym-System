import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberTest {
    static List<Member> people = new ArrayList<>();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int index = 0, input;
        do {
            System.out.println("Choose one of this commands:");
            System.out.println("create - 1, delete - 2, addInfo - 3, cancel - 4, display - 5, stop - 6");
            input = in.nextInt();
            switch (input) {
                case 1:
                    people.add(index, new Member(index + 100));
                    System.out.println("Member with ID " + people.get(index).ID + " is created");
                    index++;
                    break;
                case 2:
                    System.out.println("Enter ID:");
                    index = in.nextInt();
                    for (int i = 0; i < people.size(); i++) {
                        if (people.get(i).ID == index) {
                            people.remove(i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter ID:");
                    index = in.nextInt();
                    for (int i = 0; i < people.size(); i++) {
                        if (people.get(i).ID == index) {
                            do {
                                System.out.println("Enter type of information:");
                                System.out.println("name - 1, month - 2, activity - 3, phone number - 4, back - 5");
                                input = in.nextInt();
                                switch (input) {
                                    case 1:
                                        System.out.println("Enter name:");
                                        people.get(i).addName(in.next());
                                        break;
                                    case 2:
                                        System.out.println("Enter month:");
                                        people.get(i).addMonth(in.nextInt());
                                        break;
                                    case 3:
                                        System.out.println("Enter activity:");
                                        people.get(i).addActivity(in.next());
                                        break;
                                    case 4:
                                        System.out.println("Enter phone number:");
                                        people.get(i).addPhone(in.next());
                                        break;
                                }
                            } while (input != 5);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter ID:");
                    index = in.nextInt();
                    for (int i = 0; i < people.size(); i++) {
                        if (people.get(i).ID == index) {
                            people.get(i).cancel();
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < people.size(); i++) {
                        people.get(i).display();
                    }
                    break;
            }
        } while (input != 6);
    }
}