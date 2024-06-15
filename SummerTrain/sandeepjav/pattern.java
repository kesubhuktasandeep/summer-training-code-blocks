public class pattern {
    public static void main(String[] args) {
        int n = 5;
        // for(int i=0;i<10;i++){
        //     System.out.println("Read.");
        //     if(i<5)
        //     System.out.println(i);
        //     else
        //        continue;
        //     System.out.println("not Read.");
        //    for(int i=1;i<=5;i++){
        //       System.out.print("*");
        //    }
            //   for(int i=1; i<=5 ; i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            //   }
            for (i=1; i<=n; i++){
                for (j=1; j<=2*(n - i); j++) {
                    System.out.print("");
                }
                for (j=i; j>=1; j--) {
                    System.out.print(j + " ");
                }
                for (j=2; j<= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

                }

            }
        }
    }

