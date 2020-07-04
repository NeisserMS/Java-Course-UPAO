numHombres = int(input("Ingrese la cantidad de Hombres: "))
numMujeres = int(input("Ingrese la cantidad de Mujeres: "))
total_alumnos = 0
porcentaje_hombres = 0
porcentaje_mujeres = 0
total_alumnos = numHombres + numMujeres
porcentaje_hombres = numHombres*100/total_alumnos
porcentaje_mujeres = numMujeres*100/total_alumnos
print("Porcentaje de Hombres: ", porcentaje_hombres)
print("Porcentaje de Mujeres: ", porcentaje_mujeres)

