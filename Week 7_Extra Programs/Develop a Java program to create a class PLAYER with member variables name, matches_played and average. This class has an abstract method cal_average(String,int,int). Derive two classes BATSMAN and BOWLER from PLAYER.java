
abstract class Player
{
    String name;
    int n;
    double avg=0.0;
    abstract void calcavg(String name,int n,int runs);
}
class Batsmen extends Player
{
    int runsscored;
    void calcavg(String name,int n,int runs )
    {
        this.name=name;
        this.n=n;
        runsscored=runs;
        avg=runsscored/(n+0.0);
        System.out.println("THE BATSMAN"+name+"HAS AN AVERAGE OF="+avg);
    }
}
class Bowler extends Player
{
    int runsgiven;
    void calcavg(String name,int n,int runs )
    {
        this.name=name;
        this.n=n;
        runsgiven=runs;
        avg=runsgiven/(n+0.0);
        System.out.println("THE BOWLER"+name+"HAS AN AVERAGE OF="+avg);
    }
}
class playermain
{
    public static void main(String args[])
    {
        Batsmen b=new Batsmen();
        b.calcavg("nithin",5,500);
        b.calcavg("nin",5,500);
        Bowler b1=new Bowler();
        b1.calcavg("suvar",5,800);
        b1.calcavg("nan",3,300);
    }
}
