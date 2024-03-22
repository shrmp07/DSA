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
