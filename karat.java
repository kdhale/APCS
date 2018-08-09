import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {

  public static List<String> getLongestSequence(List<String> userA, List<String> userB) {
    int a = 0, b = 0, ai = 0, bi = 0; // a & b maintain current index of users, while ai and bi are iterators
    
    ArrayList<String> longlist = new ArrayList<String>(); // list constantly holding longest list
    ArrayList<String> changelist = new ArrayList<String>(); // list constantly updating with new lists
    
    while (a < userA.size()) // nested loop 
    {
      while(b < userB.size())
      {
        while(ai < userA.size() && bi < userB.size() && userA.get(ai).equals(userB.get(bi))) // if aindex == bindex, make longest list, also must stay within index of both
        {
            changelist.add(userB.get(bi));
            bi++;
            ai++;
        }
          
       if(changelist.size() > longlist.size()) // if new list (changelist) is longer than longest, update long
       {
         longlist.clear(); // delete contents
          for(int i = 0; i < changelist.size(); i++)
          {
            longlist.add(changelist.get(i)); // copy over contents
          } 
       }
       changelist.clear(); // reset the changelist so can run again
       b++; // increment top level counter
       bi = b; // reseting iterators to values of parents
       ai = a; 
      }
      a++; 
      b = 0; // have to restart nested loop to accurately find all possible lists
      bi = 0;
      ai = a;
    }
    return longlist; // finally, return longest list
  }


  // START TEST CASES
  //
  // You can add test cases below. Each test case should be an instance of Test
  // constructed with:
  //
  // Test(String name, List<String> userA, List<String> userB, List<String> expectedOutput);
  //

  private static final List<Test> tests = Arrays.asList(
    new Test(
      // name
      "sample input #1",
      // userA
      Arrays.asList("/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html"),
      // userB
      Arrays.asList("/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html"),
      // expectedOutput
      Arrays.asList("/four.html", "/six.html", "/seven.html")
    ), 
    new Test(
      // name
      "sample input #2",
      // userA
      Arrays.asList("/one.html", "/two.html", "/three.html", "/four.html", "/six.html"),
      // userB
      Arrays.asList("/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html"),
      // expectedOutput
      Arrays.asList("/two.html", "/three.html", "/four.html", "/six.html")
    ), 
    new Test(
      // name
      "sample input #3",
      // userA
      Arrays.asList("/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html"),
      // userB
      Arrays.asList("/three.html", "/eight.html"),
      // expectedOutput
      Arrays.asList()
    ), 
    new Test(
      // name
      "sample input #4",
      // userA
      Arrays.asList("/one.html", "/two.html", "/three.html", "/four.html", "/six.html"),
      // userB
      Arrays.asList("/three.html", "/eight.html"),
      // expectedOutput
      Arrays.asList("/three.html")
    )
  );


  // END TEST CASES
  // DO NOT MODIFY BELOW THIS LINE

  private static class Test {

    public String name;
    public List<String> userA;
    public List<String> userB;
    public List<String> expectedOutput;

    public Test(String name, List<String> userA, List<String> userB, List<String> expectedOutput) {
      this.name = name;
      this.userA = userA;
      this.userB = userB;
      this.expectedOutput = expectedOutput;
    }
  }

  private static boolean equalOutputs(List<String> a, List<String> b) {
    return a.equals(b);
  }

  public static void main(String[] args) {
    int passed = 0;
    for (Test test : tests) {
      try {
        System.out.printf("==> Testing %s...\n", test.name);
        List<String> actualOutput = getLongestSequence(test.userA, test.userB);
        if (equalOutputs(actualOutput, test.expectedOutput)) {
          System.out.println("PASS");
          passed++;
        } else {
          System.out.println("FAIL");
          System.out.printf("Expected output: %s\n", test.expectedOutput);
          System.out.printf("Actual output: %s\n", actualOutput);
        }
      } catch (Exception e) {
        System.out.println("FAIL");
        System.out.println(e);
      }
    }
    System.out.printf("==> Passed %d of %d tests\n", passed, tests.size());
  }
}
