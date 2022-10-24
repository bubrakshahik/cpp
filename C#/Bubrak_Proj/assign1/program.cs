 using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;
using System.Windows.Forms;
namespace ConsoleApplication1
{
    
  

    interface  GPA
    {                                            
        void getInput();
        void calculate();
    }
       

    class Student : GPA
    {
        public int subject;
        public double gpa, credit;
        public void getInput()
        {
        
        
            Console.WriteLine("Enter the number of subject");
            subject = int.Parse(Console.ReadLine());
            if (subject == 0)
            {
                subject += 3;
            }
            else if(subject==1)
            {
                subject+=2;
            }
            else if (subject == 2)
            {
                subject += 1;
            }
            for (int i = 1; i <= subject;i++ )
            {
                Console.WriteLine("Enter the GPA of Subject : {0} ",+i);
                gpa += Double.Parse(Console.ReadLine());
                credit += 3;
            }

            Console.WriteLine("Total Credit hours={0} ",+credit);
        }

        public void calculate()
        {
            
            
            gpa/=subject;
            gpa = Math.Round(gpa, 1);
            MessageBox.Show("CGPA:  "  + gpa,"CGPA",MessageBoxButtons.OK,MessageBoxIcon.Information);

        }

    }
   public class Program:Form
    {
      Student obj = new Student();
        public Program()
        {
            string id;
            Console.WriteLine("Enter your VUID");
            id = Console.ReadLine();
            obj.getInput();
            

            Button Clickme = new Button();
            Clickme.Parent = this;
            Clickme.Text = "Calculate ";
            Clickme.Location = new Point((ClientSize.Width - Clickme.Width) / 2, (ClientSize.Height - Clickme.Height) / 2);
             
             

            Clickme.Click += new EventHandler(BS123456789);

        }
        public void BS123456789(object sender, EventArgs ea)
        {
            obj.calculate();

          
        }
        static void Main(string[] args)
        {

            
            Application.Run(new Program());
            Console.ReadKey();
        }
    }
}
