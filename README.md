# Práctica de Pilas y Colas 

- **Título:** Ejercicios Logica con Pilas y Colas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Derlis Yupangui
- **Fecha:** 05/06/2025
- **Profesor:** Ing. Pablo Torres

---

## Descripción del Proyecto

Este proyecto contiene la implementación de dos ejercicios sobre estructuras de datos lineales (pilas y colas), desarrollados como parte de la práctica de laboratorio.

---

## Estructura del Proyecto
src\
│ ├── Ejercicio_01_sign\
│ │ └── SignValidator.java\
│ ├── Ejercicio_02_sorting\
│ │ └── StackSorter.java

---

# Ejercicios Implementados

### Ejercicio 01: Validación de Signos 
**Clase:** `SignValidator`\
**Método:** `esValido(String s)`  

Implementa un validador de expresiones que contienen paréntesis `()`, corchetes `[]` y llaves `{}` usando una pila. El algoritmo verifica:
- Que cada símbolo de apertura tenga su correspondiente cierre
- Que los símbolos estén correctamente anidados
- Que no sobren símbolos sin cerrar

**Ejemplos:**
```java
validator.esValido("([]){}");  // true
validator.esValido("([)]");    // false
validator.esValido("{[]}");    // true
```

---

### Ejercicio 02: Ordenar un Stack 
**Clase:** `StackSorter`\
**Método:** `orderarStack(Stack<Integer> pila)`

Implementa un algoritmo para ordenar un stack de números enteros en orden ascendente (los elementos más pequeños quedan en el tope), usando únicamente estructuras de pila adicionales.

**Ejemplo:**
``` java
Input: (tope) 5->1->4->2
Output: (tope) 1->2->4->5
```

---

## Instrucciones de Uso
- Clonar el repositorio 
```
https://github.com/SebastianY2007/icc-u2-EstructurasGenericas
```
- Importar el proyecto en tu IDE Java favorito
- Para probar manualmente, ejecutar las clases Main en cada paquete

---

## Conclusiones
**Esta práctica permitió:** 

- Aplicar los conceptos teóricos de pilas en problemas reales
- Desarrollar habilidades de programación con estructuras de datos
- Implementar algoritmos eficientes para manipulación de stacks
- Seguir buenas prácticas de organización de proyectos Java