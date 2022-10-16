#include <iostream>
using namespace std;

int main()
{
    int st = 3, sp = 3, st2 = 10;
    for(int i = st; i <= 5; i++)
    {
        for(int j = sp; j >= 1; j--)
        {
            cout << " ";
        }
        for(int k = 1; k <= st; k++)
        {
            cout << "a ";
        }
        for(int l = sp; l > 1; l--)
        {
            cout << "  ";
        }
        for(int m = 1; m <= st; m++)
        {
            cout << "a ";
        }
        cout << "\n";
        sp--;
        st++;
    }
   for(int i = 1; i <= 5; i++)
   {
       for(int j = 1; j <=i; j++)
       {
           cout << "  ";
       }
       for(int k = 1; k < st2; k++)
       {
           cout << "a ";
       }
       cout << "\n";
       st2 -= 2;
   }

    return 0;
}


// OUTPUT:
//   a a a     a a a
//  a a a a   a a a a
// a a a a a a a a a a
//  a a a a a a a a a
//    a a a a a a a
//      a a a a a
//        a a a
//          a
          
