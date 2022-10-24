# include <iostream>
using namespace std;

template <class T>
class Vector
{
	private:
		int size;
		T *pPtr;
	public:
		Vector<T>(int = 20);
		Vector<T>(const Vector<T> &);
		int getSize() const;
		const Vector<T> & operator = (const Vector<T> &);
		virtual ~Vector<T>();
		T &operator [](int);	
};

template <class T>
Vector<T>::Vector(int s)
{
	size = s;
	if(size != 0)
	{
		pPtr = new T[size];
	}
	else
	{
		pPtr = 0;
	}
}

template <class T>
Vector<T>::Vector(const Vector<T> &copy)
{
	// copy constructor
	size = copy.getSize();
	if(size != 0)
	{
		pPtr = new T[size];
		for(int i = 0; i < size; i++)
		{
			pPtr[i] = copy.pPtr[i];
		}
		
	}
	else
	{
		pPtr = 0;
	}
		
}

template <class T>
int Vector<T>::getSize() const
{
	// get Size
	return size;
}

template <class T>
const Vector<T> & Vector<T>::operator = (const Vector<T> &rhs) 
{
	// operator
	if(this != &rhs)
	{						 
		delete [] pPtr; 
		size  = rhs.size;
		if(size != 0)
		{
			pPtr = new T[size];
			for(int i = 0; i < size; i++)
			{
				pPtr[i] = rhs.pPtr[i];
			}
		}
		else
		{
			pPtr = 0;
		}
	}
	return *this;
}

template <class T>
Vector<T>::~Vector<T>()
{
	// destructor
	cout << "\nDESTROYED";
	delete [] pPtr;
	pPtr = NULL;
}

template <class T>
T & Vector<T>::operator [](int index)
{
	// operator
	if(index < 0 || index >= size)
	{
		cout << "Error: Index Out of Range\n";
		exit(1);
	}
	return pPtr[index];
}

class Weapon
{
	public:
		string name;
		print(){
			cout << "Name: " << name;
		}
		
};


main()
{
	
	Vector<int>n_Array;
	Vector<char>c_Array;
	
	Vector<Weapon>w_Array;
	
	for(int i = 0; i < 20; i++)
	{
		w_Array[i].name = "BS";
		c_Array[i] = 'B';
		n_Array[i] = i + 1 * 5;
		cout << w_Array[i].name << " - " << i << endl;
	}
}
