public class Bicycle {

    private String ownerName;
    private int id;
    private String contactNo;

    //No argument constructor
    public Bicycle(){
        ownerName = "None";
        id = 1000;
        contactNo = "Unknown";
    }

    //parameterized constructor
    public Bicycle(int id) {
        this.id = id;
    }

    public Bicycle(String ownerName, int id, String contactNo) {
        this.ownerName = ownerName;
        this.id = id;
        this.contactNo = contactNo;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String Name) {
        ownerName = Name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
