"""
 PROJEK KALKULATOR SEDERHANA NAUFAL

"""

print('SELAMAT DATANG DI KALKULATOR NAUFAL PINTAR')
print('=' * 30)

# input user
angka1 = float(input('Masukan bilangan pertama : '))
angka2 = float(input('Masukan Bilangan Kedua   : '))

print('=' * 30)

# pilih operasi
print(' 1. Penjumlahan')
print(' 2. Pengurangan')
print(' 3. Perkalian  ')
print(' 4. Pembagian  ')

print("=" * 30)

# user input pilihan
pilihan = input('Masukan pilihan(1/2/3/4) : ')

# if condition 1
if pilihan == '1':
    print(' Kamu memilih Penjumlahan')
elif pilihan == '2':
    print(' Kamu memilih Pengurangan')
elif pilihan == '3':
    print(' Kamu memilih Perkalian')
elif pilihan == '4':
    print(' Kamu memilih Pembagian')
else:
    print('Pilihan Tidak Valid')

print('=' * 30)

# if condition 2
if pilihan == '1':
    hasil = angka1 + angka2
    print(f'maka hasil dari {angka1} ditambah(+) {angka2} adalah {hasil}')
elif pilihan == '2':
    hasil = angka1 - angka2
    print(f'maka hasil dari {angka1} dikurang(-) {angka2} adalah {hasil}')
elif pilihan == '3':
    hasil = angka1 * angka2
    print(f'maka hasil dari {angka1} dikali(*) {angka2} adalah {hasil}')
elif pilihan == '4':
    hasil = angka1 / angka2
    print(f'maka hasil dari {angka1} dibagi(/) {angka2} adalah {hasil}')
else:
    print('Maaf Tidak Valid')

print('Terimakasih Sudah Menggunakan KALKULATOR NAUFAL PINTAR ^o^')
