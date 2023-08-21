public class ArrayPractice102D
{
    static void practice10()
    {
            int [][] arr = new int [2][3];
            arr[0][0]=2;
            arr[0][1]=3;
            arr[0][2]=10;
            arr[1][0]=20;
            arr[1][1]=30;
            arr[1][2]=40;
            for (int i=0;i< arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

    public static void main(String[] args) {
        practice10();
    }
}
