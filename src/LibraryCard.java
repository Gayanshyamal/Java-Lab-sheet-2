public class LibraryCard {
    Student owner;
    int numberOfBooksCheckOut;

    public LibraryCard() {

        owner = null;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public int getNumberOfBooksCheckOut() {
        return numberOfBooksCheckOut;
    }

    public void setNumberOfBooksCheckOut(int numberOfBooksCheckOut) {
        this.numberOfBooksCheckOut = numberOfBooksCheckOut;
    }

    public void borrowBooks(int count){
        numberOfBooksCheckOut = numberOfBooksCheckOut + count ;
    }
}
