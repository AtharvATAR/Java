import java.util.*;
class Cricket_Score
{
    public static void main(String[]args)
    {
        int Score_T2_F, Score_T1_F = 0, temp = 0, tempa = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Cricket Score Board");
        
        System.out.println("Enter in the number of overs: ");
        int numO = input.nextInt();
        
        System.out.println("Who's batting is first(team 1 / team 2): ");
        String bat = input.nextLine().toLowerCase().trim();
        if(bat == "team1")
        {
            for(int L = 1; L <= numO; L++)
            {
        
            System.out.println("Please enter number of runs scored by team 1 in this over, send 0 if lost: ");
            Score_T1_F = input.nextInt();
            temp =+ Score_T1_F;
            if(Score_T1_F == 0)
            {
                break;
            }
            else
            {
                tempa = Score_T1_F + temp;
                
            }
        }
    }
    System.out.println("Team 1 Score: " + tempa);
        
    }
}

/*System.out.println("Please enter number of runs scored by team 2 in this over: ");
            int Score_T2 = input.nextInt();
            Score_T2_F =+ Score_T2;
*/
//System.out.println("Team 2 Score: " + Score_T2_F);