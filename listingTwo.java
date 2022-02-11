public class listingTwo {
    String name = " ";
    int age = 0;

    public listingTwo() {

    }

    public listingTwo(String name, int age) {

    }

    public String toString() {
        return name;
    }

    public void input() {
        String[] names = {"Bob", "Rick", "Becky"};
        int[] ages = {10, 22, 8};
    }

    public void setName(String nameInput) {
        name = nameInput;
    } 

    public void setAge(int ageInput) {
        age = ageInput;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
