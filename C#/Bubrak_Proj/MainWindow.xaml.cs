using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace MC200405504
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        public static string mynextidtonextform;
        private void username_LostFocus(object sender, RoutedEventArgs e)
        {
            if (string.IsNullOrEmpty(username.Text))
            {
                username.Visibility = System.Windows.Visibility.Collapsed;
                watermarkusername.Visibility = System.Windows.Visibility.Visible;
            }
        }

        private void watermarkusername_GotFocus(object sender, RoutedEventArgs e)
        {

            watermarkusername.Visibility = System.Windows.Visibility.Collapsed;
            username.Visibility = System.Windows.Visibility.Visible;
            username.Focus();
        }

        private void Password_LostFocus(object sender, RoutedEventArgs f)
        {
            if (string.IsNullOrEmpty(username.Text))
            {
                username.Visibility = System.Windows.Visibility.Collapsed;
                watermarPassword.Visibility = System.Windows.Visibility.Visible;
            }
        }

        private void watermarPassword_GotFocus(object sender, RoutedEventArgs e)
        {

            watermarPassword.Visibility = System.Windows.Visibility.Collapsed;
            username.Visibility = System.Windows.Visibility.Visible;
            username.Focus();
        }

        private void login_Btn(object sender, RoutedEventArgs e)
        {
            mynextidtonextform = username.Text;
            string pass = Password.Text;
            string Mystdid = "MC200405504";
            string passlastthreedig = "504";
            if (mynextidtonextform.Length.Equals(0))
            {
                MessageBox.Show("username Required", "Warning", MessageBoxButton.OK, MessageBoxImage.Hand);

                return;
            }
            if (pass.Length.Equals(0))
            { 
                MessageBox.Show("Password Rrequired", "Info", MessageBoxButton.OK, MessageBoxImage.Error);
                return;
            }
            else
            {
                if (Mystdid.ToLower() == mynextidtonextform.ToLower() && passlastthreedig == pass)
                {


                    Dashboard showwindow = new Dashboard();
                    showwindow.Show();

                    this.Close();
                }
                else
                {
                    MessageBox.Show("Invalid Username and Password", "Info", MessageBoxButton.OK, MessageBoxImage.Warning);
                }

            }
        }

        private void close_Btn(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}

