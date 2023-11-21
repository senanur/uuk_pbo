
a = float(input("Masukkan nilai pertama: "))
b = float(input("Masukkan nilai kedua: "))

def tambah(a, b):
        return a + b

def kurang(a, b):
        return a - b

def kali(a, b):
        return a * b

def bagi(a, b):
        return a / b

while True:
    print("\nPilih operasi matematika:")
    print("1. Tambah")
    print("2. Kurang")
    print("3. Kali")
    print("4. Bagi")
    print("5. Keluar")

    operasi = input("Masukkan nomor operasi yang ingin Anda pilih: ")

    if operasi == '1':
        print("\nHasil:", tambah(a, b))
    elif operasi == '2':
        print("\nHasil:", kurang(a, b))
    elif operasi == '3':
        print("\nHasil:", kali(a, b))
    elif operasi == '4':
        print("\nHasil:", bagi(a, b))
    elif operasi == '5':
        print("keluar dari program...")
        break
    else:
        print("\nOperasi yang dipilih tidak valid")
    