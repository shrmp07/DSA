/* for the outer loop, count the number of lines(rows)
 * for inner loop, focus on columns, and connect them somehow to rows
 * print them inside outer for loop
 * observe symmetry (optional)
 */

/* -----pattern 1-----

    * * * *
    * * * *
    * * * *
    * * * *
    
*/
/* code */


class Main {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
        System.out.print('*');
    }
    System.out.println();
}
    }
}

/*pattern 2*/
/*
*
**
***
****
*****
*/

class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

/*pattern 3*/
/*
1
12
123
1234
12345
*/

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


