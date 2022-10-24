# include <iostream>
# include <cstring>
using namespace std;

class myClass
{
	private:
		int id;
		string name;
	public:
		myClass(){
		}
		void setData(){
			cout << "Enter id: ";
			cin >> id;
			cout << "Enter Name: ";
			cin >> name;
		}
		void display(){
			cout << "ID: " << id << "\nName: " << name << endl;
		}
};

class Exception
{
	public:
		Exception(){
			
		}
		void display()
		{
			cout << "\n GOT AN ERROR!\n\n";
		}
};
