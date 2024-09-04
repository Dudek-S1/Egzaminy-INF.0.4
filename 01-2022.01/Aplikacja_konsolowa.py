class Sortowanie:
    def __init__(self,value):
        self.value = value
    
    def znajdz_max(self):

        najwieksza_liczba=self.value[0]
        print(najwieksza_liczba)
        for x in self.value:
            print(x)

    def sortuj(self):
        print(self.value)

sor = Sortowanie([1,2,1,4,6,7,3,6])
sor.znajdz_max()