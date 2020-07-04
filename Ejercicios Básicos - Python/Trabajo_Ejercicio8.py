
precio_segundo = 0.25
horas = float(input("Ingrese la cantidad de horas: "))
minutos = float(input("Ingrese la cantidad de minutos: "))
segundos = float(input("Ingrese la cantidad de segundos: "))

total_segundos = horas*3600 + minutos*60 + segundos
                        
costo_total = total_segundos*precio_segundo

print("Los segundos son ", total_segundos, "y el costo total es ", costo_total)
