class Kalkulator:
    def perjumlahan(self, a, b):
        return a + b

    def pengurangan(self, a, b):
        return a - b

    def perkalian(self, a, b):
        return a * b

    def pembagian(self, a, b):
        if b == 0:
            return "Tidak bisa pembagian dengan nol"
        else:
            return a / b

Kalkulator = Kalkulator()

while True:
    print("Pilih Operasi:")
    print("1. Perjumlahan")
    print("2. Pengurangan")
    print("3. Perkalian")
    print("4. Pembagian")
    print("5. Keluar")

    pilih = input("Masukkan Pilihan (1/2/3/4/5): ")

    if pilih in ('1', '2', '3', '4'):
        num1 = float(input("Masukkan bilangan pertama: "))
        num2 = float(input("Masukkan bilangan kedua: "))

        if pilih == '1':
            print(num1, "+", num2, "=", Kalkulator.perjumlahan(num1, num2))

        elif pilih == '2':
            print(num1, "-", num2, "=", Kalkulator.pengurangan(num1, num2))

        elif pilih == '3':
            print(num1, "*", num2, "=", Kalkulator.perkalian(num1, num2))

        elif pilih == '4':
            print(num1, "/", num2, "=", Kalkulator.pembagian(num1, num2))

    elif pilih == '5':
        print("Program akan di close...")
        break

    else:
        print("Input Salah")