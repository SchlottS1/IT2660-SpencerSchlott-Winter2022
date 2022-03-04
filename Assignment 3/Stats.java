public class Stats 
{
    private String name;
    private String Wins;
    private String Ks;
    private String ERA;
    private String Walks;
    
    public Stats()
    {
        name = "";
        Wins = "";
        Ks = "";
        ERA = "";
        Walks = "";
    }

    public Stats(String n, String wi, String k, String e, String Wa)
    {
        name = n;
        Wins = wi;
        Ks = k;
        ERA = e;
        Walks = Wa;
    }

    public String toString()
    {
        return ("Name: " + name + "\n" +
                "Wins: " + Wins + "\n" +
                "Strikeouts: " + Ks +"\n" +
                "Walks: " + Walks + "\n" +
                "ERA: " + ERA + "\n");
    }

    public Stats copy()
    { 
        Stats copy = new Stats(name, Wins, Ks, ERA, Walks);
        return copy;
    }
}
