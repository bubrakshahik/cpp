# include "myClass.h"

class myData
{
	private:
		int id;
		string name;
	public:	
		myData(){
			cout << "Enter the id: ";
			cin >> id;
			cout << "Enter the name: ";
			cin >> name;
		}
		void dis_class(){
			cout << "id: " << id << "\n";
			cout << "Name: " << name << "\n";
		}
};
template <class T>
void swapi(T &a, T &b)
{
	try
	{
		myClass e;
		T temp;
		temp = a;
		a = b;
		b = temp;
		throw Exception();	
	} catch (Exception e)
	{
		e.display();
	}
	
}


int main()
{
	
	int semaphore = 1;
	
	if(semaphore < 1)
	{
		cout << semaphore << "\n";
	}
	
	enum {
		bubrak = 1,
		shahik = 2
	};
	
	enum week {
		Sunday = 6,
		Monday = 0,
		Tuesday = 1,
		Wednesday = 2,
		Thursday = 3,
		Friday = 4,
		Saturday = 5,
	};
	
	string Sunday_Saturday;

	week today;  // week today = Sunday;
	today = Sunday;
	
	week yesterday = Saturday;
	
	string i = "hello I", j = "darling J";
	swapi(i, j);
	

	cout << "i: " << i << endl;
	cout << "j: " << j << endl;
	
	cout << "Yesterday: " << yesterday << endl;
	cout << "Today: " << today << endl;		
	
	Sunday_Saturday = yesterday  == 5 ? "Saturday." : "Not Saturday.";
	cout << "DAY IS " << Sunday_Saturday << endl;
	
	Sunday_Saturday = yesterday  == 5 ? "Sunday." : "Not Sunday.";
	cout << "DAY IS " << Sunday_Saturday << endl;
	
	cout << "Bubrak: " << bubrak << endl;
	cout << "Shahik: " << shahik << endl;
	
	
	myData dataObj, dataObj2;
	swapi(dataObj, dataObj2);
	dataObj.dis_class();
	dataObj2.dis_class();
	
	
	myClass obj;
	
	obj.setData();
	obj.display();
	
	return 0;
}
