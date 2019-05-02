# -*- coding: utf-8 -*-

tabla_codificacion = {
    'a': '11', 
    'b': '12', 
    'c': '13', 
    'd': '14', 
    'e': '15', 
    'f': '16', 
    'g': '17', 
    'h': '18', 
    'i': '19', 
    'j': '20', 
    'k': '31', 
    'l': '32', 
    'm': '33', 
    'n': '34',
    'ñ': '35',
    'o': '36', 
    'p': '37', 
    'q': '38', 
    'r': '39', 
    's': '40', 
    't': '61', 
    'u': '62', 
    'v': '63', 
    'w': '64', 
    'x': '65', 
    'y': '66', 
    'z': '67', 
    '1': '*',
    '2': '/',
    '3': '\\',
    '4': '+',
    '5': '-',
    '6': '<',
    '7': '>',
    '8': '#',
    '9': '"',
    '0': '!',
    ' ': 'U',
    
}


def codificar_caracter(caracter):

    return tabla_codificacion[caracter]


def decodificar_caracter(codigo):

    for clave, valor in tabla_codificacion.items():
        if valor == codigo:
            return clave
    return ''


cadena = raw_input('Ingrese la cadena ')

primer_caracter = cadena[0:1]

if primer_caracter == '_':

    codigo = cadena[1:len(cadena)]


    palabra = ''

    index = 0

    while index < len(codigo):
        caracter = codigo[index:index + 1]

        if caracter.isdigit():
            caracter = codigo[index:index + 2]
            index += 2
        else:
            index += 1

        palabra += decodificar_caracter(caracter)

    print('La palabra decodificada es {}'.format(palabra))

else:
    palabra = cadena


    codigo = ''

    for letra in palabra:

        codigo += codificar_caracter(letra)

    print('El código resultante es {}'.format(codigo))
