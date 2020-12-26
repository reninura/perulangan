package com.company;


        public class looping {

            public static void main (String[] args){

                //Case 1
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 5; j++)
                    {
                        if (j==0 || j==2 || j==4) {
                            System.out.print("X ");
                        } else {
                            System.out.print("O ");
                        }
                    }
                    System.out.println();
                }

                System.out.print("\n");

                //Case 2
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 5; j++)
                    {
                        if (j==0 || j==2 || j==4) {
                            System.out.print("X ");
                        } else {
                            System.out.print("O ");
                        }
                    }
                    System.out.println();
                }

                System.out.print("\n");

                //Case 3
                for(int i = 0; i < 5; i++)  {
                    for(int j = 0; j < 5; j++){
                        System.out.print(i+1+" ");
                        if ( (i+j) == 4){
                            break;
                        }
                    }
                    System.out.println();
                }

                System.out.print("\n");

                //Case 4
                for(int i = 0; i < 5; i++)  {
                    for(int j = 0; j < 5; j++){
                        System.out.print(j+1+" ");
                        if ( (i+j) == 4){
                            break;
                        }
                    }
                    System.out.println();
                }

                System.out.print("\n");

                //Case 5
                int n = 10;
                for (int i = 1; i <= n; i++)
                {
                    for (int j = 1; j < i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int k = i; k <= n; k++) { System.out.print(k+" "); }
                    System.out.println();
                }
            }
        }


