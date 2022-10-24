# include <iostream>
using namespace std;

template <typename T, typename U>
T s_earch(T start, T beyond, const U x)
{
	while(start != beyond && *start != x )
	{
		start++;	
	}
	return start;
}

main()
{
	int ar[5];
	ar[0] = 35;
	ar[1] = 36;
	ar[2] = 34;
	ar[3] = 32;
	ar[4] = 30;
	
	int *fd = s_earch(ar, ar + 5, 87);
	
	cout << *fd;
}
