public class Member {
    int ID;
    String name;
    int month;
    String activity;
    String phone;

    //constructor
    public Member(int ID) {
        this.ID = ID;
        this.name = "Undefined";
        this.month = 0;
        this.activity = "Undefined";
        this.phone = "***";
    }

    void addName(String newName) {
        name = newName;
    }

    void addMonth(int newMonth) {
        month = newMonth;
    }

    void addActivity(String newAct) {
        activity = newAct;
    }

    void addPhone(String newPhone) {
        phone = newPhone;
    }

    void cancel() {
        month = 0;
    }

    void display() {
        System.out.println("Member " + ID + ", name " + name + ", phone number " + phone + ", activity " + activity + ", subscription valid for " + month + " month");
    }
}
