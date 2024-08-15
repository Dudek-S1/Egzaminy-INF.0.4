import random
tab=[]

#**********************************************
#nazwa funkcji: <wypelnij_Tablice>
#opis funkcji: <Funkcja wypełnia tablice sześćdziesięcioma losowymi liczbami z zakresu od 1 do 100>
#parametry: <brak>
#zwracany typ i opis: <brak>
#autor: <0123456789>
#***********************************************
def wypelnij_Tablice():
    for x in range(60):
        tab.append(random.randrange(1,100))

#**********************************************
#nazwa funkcji: <przeszukaj_Tablice>
#opis funkcji: <Funkcja dodaje wartownika do listy. Przeszukuje tablice. W zależności od rezulatu wyświetla komunikat. Wyświetla wyszystkie liczby w tablicy>
#parametry: <zmienna>
#zwracany typ i opis: <brak>
#autor: <0123456789>
#***********************************************
def przeszukaj_Tablice(szukanaLiczba):
    tab.append(szukanaLiczba)  # dodanie wartownika na końcu listy
    i = 0
    while tab[i] != szukanaLiczba:
        i += 1
    
    tab.pop()  # usunięcie wartownika

    if i == len(tab):
        print("Nie ma takiej liczby w zbiorze")
    else:
        print("Liczba znajduje się pod indexem " + str(i))

    # Wyświetlanie tablicy
    for liczba in tab:
        print(str(liczba) + ",", end=" ")

wypelnij_Tablice()
a = int(input("Wprowadź szukaną liczbę:"))

przeszukaj_Tablice(a)



