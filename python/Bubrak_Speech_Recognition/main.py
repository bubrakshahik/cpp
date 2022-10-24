import calendar

import speech_recognition as sr


year = 2022
month = 10

print(calendar.month(year, month))


listner = sr.Recognizer()
command = ""
while(command != "quit"):
    try:
        with sr.Microphone() as source:
            print("listening.....")
            voice = listner.listen(source)
            command = listner.recognize_google(voice)
            
            if command == "hello":
                ("printScorpio: " + command)
                print("System Reply: hy Scar!")
            else:
                print(command)
    except:
        pass

