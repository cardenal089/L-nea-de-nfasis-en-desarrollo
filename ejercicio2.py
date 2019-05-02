# -*- coding: utf-8 -*-

import csv
import datetime

ahora = datetime.datetime.now()
personas_0_18 = 0
personas_18_30 = 0
personas_mayores_30 = 0

print('')
print('USUARIOS')


with open('ejercicio2.csv') as archivo:

 
    reader = csv.reader(archivo)

    for fila in reader:

        nombre = fila[1]

        fecha_nacimiento = datetime.datetime.strptime(fila[2], '%d-%m-%Y')

        edad_dias = (ahora - fecha_nacimiento).days

        edad = int(edad_dias // 365.2425)

        print('{} edad: {} años'.format(nombre, edad))

        if edad in range(0, 18):
            personas_0_18 += 1

        if edad in range(18, 30):
            personas_18_30 += 1

        if edad > 30:
            personas_mayores_30 += 1

print('')
print('RESUMEN')
print('{} usuarios tienen entre 0 y 18 años'.format(personas_0_18))
print('{} usuarios tienen entre 18 y 30 años'.format(personas_18_30))
print('{} usuarios tienen son mayores de 30 años'.format(personas_mayores_30))
