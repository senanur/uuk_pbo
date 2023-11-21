"""
UUK PBO
date : 21/11/2023
"""

print('======================================')
print('Haloo,This is Calculator by Syahla')
print('Welcome to my Calculator `(*>﹏<*)′')
print('=======================================')



num1 = float(input('Masukkan Bilangan Pertama  :'))
num2 = float(input('Masukkan Bilangan Kedua    :'))
print()


print('pilihan Operasi')
print('1. Penjumlahan ')
print('2. Pengurangan ')
print('3. Perkalian   ')
print('4. Pembagian   ')
print()

pilihan = input('Masukkan pilihan (1/2/3/4) : ')

if pilihan == '1':
    print('Hasil Dari', num1, '+', num2, '=', round(num1 + num2, 2))
elif pilihan == '2':
    print('Hasil Dari', num1, '-', num2, '=', round(num1 - num2, 2))
elif pilihan == '3':
    print('Hasil Dari', num1, '*', num2, '=', round(num1 * num2, 2))
elif pilihan == '4':
    print('Hasil Dari', num1, '/', num2, '=', round(num1 / num2, 2))
else:
    print('Maaf, pilihan operasi mu  tidak tersedia')

print('============================================')

print('Thank youu !!! (✿◡‿◡)')









