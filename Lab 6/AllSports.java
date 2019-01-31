/*name: Edirin Okpikpi
  Student Id: 3078829
  Lab : 6
  */
public class AllSports implements Football
{
  public void homeTeamScored()
  {
      System.out.println("homeTeamScored = 4");
  }
  public void visitingTeamscored()
  {
      System.out.println("visitingTeamscored = 2");
  }
  public void endOfQuarter(){
    System.out.println("endOfQuarter=25mins");
    }
  
  public void HomeTeamName(){
    System.out.println("HomeTeamName = AirChiefs");
    }
    
  public void VisitingTeamName(){
    System.out.println("VisitingTeamName = Brigades");
    }
    
  public static void main(String arg[])
  {
      AllSports first = new AllSports();
      
      first.homeTeamScored();
      first.visitingTeamscored();
      first.endOfQuarter();
      first.HomeTeamName();
      first.VisitingTeamName();
  }
}




