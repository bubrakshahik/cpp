#!/bin/bash
path=$(pwd)
backup_window_size="printf '\e[8;24;80t'"
#ipaddr="$(curl ifconfig.me)"
#ipaddr2="$(curl icanhazip.com)"
host="$(uname -n)"
version="1.0 b"  

DarkGray='\033[1;30m'
LightRed='\033[1;31m'
Green='\033[0;32m'
LightGreen='\033[1;32m'
Orange='\033[0;33m'
Blue='\033[0;34m'
LightBlue='\033[1;34m'
Purple='\033[0;35m'
LightPurple='\033[1;35m'
Cyan='\033[0;36m'
LightCyan='\033[1;36m'
LightGray='\033[0;37m'
White='\033[1;37m'
Yellow='\033[1;33m'
Black='\033[0;30m'
RED='\033[0;31m'
NC='\033[0m' # No Color

#FONT

RESTORE="\e[39"
BOLD="\e[1m"
NORMAL="\e[0m"

echo -e "
${Blue}$BOLD
 ____   ____ ___  ____  ____ ___ ___  
/ ___| / ___/ _ \|  _ \|  _ \_ _/ _ \ 
\___ \| |  | | | | |_) | |_) | | | | |
 ___) | |__| |_| |  _ <|  __/| | |_| |
|____/ \____\___/|_| \_\_|  |___\___/ 

$BOLD Bubrak-Shahik ${Green} $BOLD ( ѕ¢σяρισ-♏ 👹)${NC}
${Blue}
 __ ____   _ 
(_ |_ || ||_)
__)|_ ||_||  "

echo -e $BOLD
read -p "USER NAME: " user


if [[ $user == "bubrak" ]]
then
	sleep .5
	echo -e "$Green Correct!${NC}"
	echo -e ${Blue}$BOLD
	read -s -p "Password: " passwd

if [[ $passwd == "shahik" ]]

then
sleep .5
echo -e "$Green Correct${NC}"
clear

echo -e "
${Blue}$BOLD
 ____   ____ ___  ____  ____ ___ ___  
/ ___| / ___/ _ \|  _ \|  _ \_ _/ _ \ 
\___ \| |  | | | | |_) | |_) | | | | |
 ___) | |__| |_| |  _ <|  __/| | |_| |
|____/ \____\___/|_| \_\_|  |___\___/ 

$BOLD Bubrak-Shahik ${Green} $BOLD ( ѕ¢σяρισ-♏ 👹)${NC}
${Blue}
 __ ____   _ 
(_ |_ || ||_)
__)|_ ||_||"

echo -e "${Green}${BOLD}	        VERSION: 1.0 b"				
echo -e "  

${RED}$BOLD Initial Package Installer (RUN AS ROOT)  

${Orange}Choose An OPTION:${NC}

${Yellow}1) Update and Upgrade Packages 
2) Install Checkra1n JailBreak Tool
3) Install Team Viewer
4) Install Sub Lime
5) Instal Visual Studio (It will ask Password 3 times)
6) Install Compiz Video Recorder
0) Exit${NC}
"

x=0

while [ $x = 0 ]

echo -e "${Blue}"

read -p "Enter A Value:" Value

echo -e "${NC}"

do
	case "$Value" in 
	1)
    sudo apt update && sudo apt upgrade -y
	sudo apt dist-update
	sudo apt dist-upgrade
	sudo apt-get update && sudo apt-get upgrade
	sudo apt --fix-missing install
	sudo apt --fix-broken install	
	sudo apt install python
	sudo apt install python-pip
	sudo apt install python
	sudo apt install python2-pip
	sudo apt install python3
	sudo apt install python3-pip
	sudo apt install python-client
	sudo apt install python3.7
	sudo apt install python3.7-pip
	sudo apt install SSH
	sudo pip2 install requests
	sudo pip2 install mechanize
	sudo apt install wget
	sudo apt install git
	sudo apt Install figlet
	sudo apt Install curl
	sudo apt Install php
	sudo apt install toilet
	sudo apt install cowsay
	sudo apt install lolcat
 	sudo apt install jq


	x=0
	exit
	;;
	2)	
	echo "deb https://assets.checkra.in/debian /" | sudo tee -a /etc/apt/sources.list
	sudo apt-key adv --fetch-keys https://assets.checkra.in/debian/archive.key
	sudo apt update
	sudo apt-get install libirecovery3
	sudo apt-get install checkra1n
	x=0
	exit
	;;
	3)
	wget https://download.teamviewer.com/download/linux/teamviewer_amd64.deb
	sudo apt install ./teamviewer_amd64.deb
	x=0
	exit
	;;
	4)
	sudo apt update	
	sudo apt install apt-transport-https ca-certificates curl software-properties-common
	curl -fsSL https://download.sublimetext.com/sublimehq-pub.gpg | sudo apt-key add -
	sudo add-apt-repository "deb https://download.sublimetext.com/ apt/stable/"
	sudo apt update
	sudo apt install sublime-text
	x=0
	exit	
	;;
	5)
	sudo apt update	&& sudo apt upgrade -y
	sudo apt install snapd
	systemctl enable --now snapd apparmor #it will ask 3 time password	
	sudo snap install --classic code
	curl https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gp
	sudo install -o root -g root -m 644 packages.microsoft.gpg /etc/apt/trusted.gpg.d/
	sudo sh -c 'echo "deb [arch=amd64 signed-by=/etc/apt/trusted.gpg.d/packages.microsoft.gpg] https://packages.microsoft.com/repos/vscode stable main" > /etc/apt/sources.list.d/vscode.list'
	sudo apt-get install apt-transport-https
	sudo apt-get update
	sudo apt-get install code
	x=0	
	exit	
	;;
	6)
 	sudo apt-get install compizconfig-settings-manager compiz-plugins-extra
 	x=0
 	exit
 	;;
	0)
	exit
	;;
	*)
	echo -e "${RED}CHOOSE A VALID OPTION${NC}"
	x=0
	
	esac
done

else 
	echo -e ${RED}$BOLD"WRONG!!!!!"
	exit
fi

else
	echo -e ${RED}$BOLD"WRONG!!!!!"
	exit

fi
