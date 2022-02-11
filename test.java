public class test {
    public static void main(String[] args) {
        Listing listNoParam = new Listing();
        System.out.println(listNoParam); //no parameter constructor works
        Listing list = new Listing("billy", 12); // two parameters constructor works
        list.setName("Billy"); //setname works
        list.setNumber(12); //setnumber works
        String name = list.getName(); //getname works
        int age = list.getNumber(); //getnumber works
        System.out.println(name + "'s age is " + age);  
        System.out.println(name.toString()); //toString() works     
    
    }
}
