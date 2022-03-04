public class Main
{
    public static void main(String[] args)
    {
        Stack nouveau = new Stack(3);

        Stats a;
        Stats a1 = new Stats("Corey Kluber", "19", "223", "2.97", "58");
        Stats a2 = new Stats("Shane Bieber", "22", "236", "3.12", "47");
        Stats a3 = new Stats("Aaron Civale", "17", "187", "3.62", "52");

        nouveau.push(a1);
        nouveau.push(a2);
        nouveau.push(a3);
        
        System.out.println("All 3 pitchers");
        nouveau.showAll();

        System.out.println("Top of stack is removed. Goodbye Aaron Civale");
        a = nouveau.pop();

        nouveau.showAll();

        System.out.println("Top of stack is removed. Goodbye Shane Bieber");
        a = nouveau.pop();

        nouveau.showAll();

        System.out.println("Welcome back Shane Bieber");
        nouveau.push(a2);

        nouveau.showAll();

    }
}
