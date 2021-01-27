package project;

public class project {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int value = 4;

        System.out.println("[-------------------------]");
        System.out.println("[      Array Pattern      ]");
        System.out.println("[-------------------------]");

        System.out.println("How many rows/columns do you want your array to have? (Mist be at least 3):");


        
        int newarraysize = value+1;
       


        int [][] pattern = new int[newarraysize][newarraysize];



        int number = 1;

        for (int i = 0; i <= newarraysize -1; i++){

            for(int j = 0; j <= newarraysize - 1; j++)
            {
                pattern[i][j] = number;
                number++;
                System.out.printf("%3d", pattern[i][j]);
            }
            System.out.println("");
        }
    }    
}