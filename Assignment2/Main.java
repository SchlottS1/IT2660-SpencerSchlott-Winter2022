
public class Main{

    public static void main(String[] args) {

        dynamicArray test = new dynamicArray();
       test.addNumber(5); //add element to array
       test.printNumbers();
       test.addNumber(7);//add another element to array
       test.printNumbers();
       test.addNumber(1, 8);//add element at index position of 1
       test.printNumbers();
       test.removeNumber();//remove the right most number (7)
       test.printNumbers();
       test.addNumber(9);//add another element
       test.printNumbers();
       test.addNumber(10);//add another element
       test.printNumbers();
       test.removeNumber(2);//remove a number from the specified index position
       test.printNumbers();

       /*Note that I used shrinkArray for all
       of my function in the dynamicarray class
       I preferred that just because I then
       don't have a bunch of extra zeros at the
       end of the array, but if you remove
       the shrinkArray function from all the 
       function you'll see the zeros again.
*/


        

    }

   
}



