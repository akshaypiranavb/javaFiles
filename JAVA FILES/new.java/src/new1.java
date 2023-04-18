import java.util.*;
class Mark
{
    public float average;
    public void avg()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter average : ");
        average = in.nextFloat();
    }


}
class Grade extends Mark
{
    public void grade()
    {
        if (average > 90)
        {
            System.out.println("O grade");
        }

    }
}
class Bonus extends Mark
{
    public void bs()
    {
        if (average > 90)
            average = average + 10;
    }
}
class Output
{
    public static void main(String[] args)
    {
        Grade g = new Grade();
        Bonus b = new Bonus();
        g.avg();
        g.grade();
        b.bs();
    }
}