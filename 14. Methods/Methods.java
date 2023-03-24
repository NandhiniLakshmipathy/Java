
class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if (cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

class Methods
{
    public static void main(String[] args) {
        
        int cost = 1;

        Computer obj = new Computer();
        obj.playMusic();
        String r = obj.getMeAPen(cost);

        System.out.println(r);
    }
}