/** Heading  **********************************************/
/*	Your name: Sarah M
		Class block: G				Date Started: Sep 8th
		Lab Number: 00
		Title: Making a lab I guess
		Purpose: Challenge problems
*/

public class Lab_00{

  public Lab_00(){
    // Treat this as you main method.
    exampleA();
    exampleB();
    exampleC();
    exampleD();
    exampleE();
  }
  // Write additional methods here
 
  public void exampleA(){
    int row, col;
    System.out.print("Hello world!\n");
    System.out.print("\n");
    for(row = 0; row <5; row++)
    {
      for (col=row; col>=0; col--)
        System.out.print("*");
      System.out.print("\n");
    }
    System.out.print("\nGoodBye world!");
    System.out.print("\n");
  }

  public void exampleB(){
    int row, col;
    System.out.print("\n");
    for(row = 7; row >= 0; row--)
    {
      for (col=row; col>0; col--)
        System.out.print("*");

      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public void exampleC(){
    int row, col;
    System.out.print("\n");
    for(row = 7; row >= 0; row--)
    {
      for (col=row; col>0; col--)
        System.out.print(" ");

      for (col=row; col<7; col++)
        System.out.print("*");

      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public void exampleD(){
    int row, col;
    System.out.print("\n");
    for(row = 7; row > 0; row--)
    {
      for (col=row; col>0; col--)
        System.out.print(" ");

      for (col=row; col<7; col++)
        System.out.print("*");

      for (col=row-1; col<7; col++)
        System.out.print("*");
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public void exampleE(){
    int row, col;
    System.out.print("\n");
    for(row=6; row>=0; row--){
      for (col=6; col>=0; col--){
        if ((row==0)||(row==6)||(col==0)||(col==6)||(col==row)||(col==6-row)){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }
}