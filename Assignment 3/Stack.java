public class Stack
{
   private Stats[] stats;
   private int top;
   private int size;

   public Stack()
   {
       top = -1;
       size = 10;
       stats = new Stats[10];
   }

   public Stack(int num)
   {
       top = -1;
       size = num;
       stats = new Stats[num];
   }

   public boolean push(Stats newNode)
   {
       if (top == size - 1)
       {
           return false;
       } else {
           top = top + 1;
           stats[top] = newNode.copy();
           return true;
       }
   }

   public Stats pop()
   {
       int topLoc;
       if(top == -1)
       {
       return null;
       } else {
           topLoc = top;
           top = top -1;
           return stats[topLoc];
       }
   }

   public void showAll()
   {
       for(int i = top; i >=0; i--)
       {
           System.out.println(stats[i].toString());
       }
   }
}