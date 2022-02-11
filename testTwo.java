import java.util.Scanner;

public class testTwo {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        listingTwo person1 = new listingTwo(" ", 0);
        listingTwo person2 = new listingTwo(" ", 0);
        listingTwo person3 = new listingTwo(" ", 0);



        System.out.println("What's the name of the first person?");
        person1.setName(scanner.nextLine());
        System.out.println("What's the age of the first person?");
        person1.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("What's the name of the second person?");
        person2.setName(scanner.nextLine());
        System.out.println("What's the age of the second person?");
        person2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("What's the name of the third person?");
        person3.setName(scanner.nextLine());
        System.out.println("What's the age of the third person?");
        person3.setAge(Integer.parseInt(scanner.nextLine()));

        String person1Name = person1.getName();
        String person2Name = person2.getName();
        String person3Name = person3.getName();

        int person1Age = person1.getAge();
        int person2Age = person2.getAge();
        int person3Age = person3.getAge();

        String[] names = {person3Name, person2Name, person1Name};
        int[] ages = {person3Age, person2Age, person1Age};


       for(int i = 0; i < names.length; i++){
           System.out.println(names[i]);
       }

       for(int i = 0; i < ages.length; i++){
           System.out.println(ages[i]);
       }



        

    }

}
