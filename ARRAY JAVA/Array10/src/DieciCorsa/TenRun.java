package DieciCorsa;

public class TenRun {
    public static int[] tenRun(int[] v)
    {
        int[] answer = new int[v.length];
        int tmp = 0;
        int variable = 0;
        for(int i = 0; i < v.length; i++)
        {

            if(v[i] % 10 == 0)
            {
                answer[i] = v[i];
                variable = v[i];
            }
            else
            {
                if(variable != 0)
                {
                    answer[i] = variable;
                }
                else
                {
                    tmp = v[i];
                    answer[i] = tmp;
                }

            }
        }
        return answer;
    }
}
