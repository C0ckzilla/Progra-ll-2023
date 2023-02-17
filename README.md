# Progra-ll-2023

Realizar una función en C que devuelve el número de velas completas que se pueden quemar. Considere el siguiente caso:

1.- Al encender una vela está se consume, pero siempre deja un residuo, el residuo de la vela lo vamos a utilizar para construir otra vela. De manera que es posible utilizar los residuos de la vela para construir una vela nueva.

2.- Ejemplo. Se tienen 4 velas y se encienden las 4 velas.
3.- Por cada 2 residuos de las velas se puede. construir una vela nueva

Caso de estudio

- Se tienen 4 velas iniciales
- Al terminar de consumirse quedan 4 residuos
- Con esos 4 residuos se construyen 2 velas adicionales
- Con los residuos de las 2 velas adicionales se construye 1 nueva vela

Al final se tienen 4 + 2  + 1 = 7 velas completas y medio residuo de la última vela

Update para mayor facilidad: La función solo debe de regresar el número de velas completas

Función velas(velasCompletas, Residuos) -> velasFinales
velas(4,2) el resultado debe ser 7


HACERLO EN C TAMBIEN

