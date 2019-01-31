public class lab3enums
{
    public static void main (String[]args)
    {
        Paintcolors [] colcos = Paintcolors.values();
        System.out.println("costs of paints: ");
        for(Paintcolors h: colcos)
        System.out.println(h);
    }
}