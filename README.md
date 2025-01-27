Ejercicios de Programación en Java

Descripción

Este repositorio contiene diversos ejercicios relacionados con conceptos de programación en Java, centrándose en la programación orientada a objetos, colecciones y buenas prácticas. Los ejercicios están organizados en diferentes niveles, cada uno diseñado para reforzar habilidades prácticas aplicando conceptos teóricos.

Lenguaje de Programación usado en todos ellos: Java

Entorno de Desarrollo utilizado ha sido el IDE: IntelliJ

No se han usado herramientas de construcción adicionales sino que son proyectos en Java independientes.

___________________________________________________________________
___________________________________________________________________

Descripción de los Ejercicios

Nivel 1

Ejercicio 1: Gestión de Ventas

Objetivo:
Implementar una clase de ventas que maneje excepciones personalizadas.

Requisitos:

Crear una clase Producto con los atributos nombre y precio.

Crear una clase Venta con:

Una colección de productos.

Un atributo precioTotal para almacenar el total de la venta.

Implementar el método calcularTotal(), que debe lanzar una excepción personalizada VentaBuidaException si no hay productos en la colección.

La excepción personalizada VentaBuidaException debe ser hija de Exception y mostrar el mensaje "Para hacer una venta primero tienes que añadir productos".

Capturar la excepción con el método getMessage() para mostrar el mensaje.

Escribir el código necesario para generar y capturar una excepción de tipo IndexOutOfBoundsException.

-----------------------------------------------------

Nivel 2

Ejercicio 1: Validación de Entradas

Objetivo:
Controlar excepciones durante la introducción de datos por teclado usando la clase Scanner.

Requisitos:

Crear una clase Entrada que contenga un objeto Scanner.

Implementar métodos estáticos para leer distintos tipos de datos desde el teclado:

Métodos que capturan la excepción InputMismatchException:

public static byte leerByte(String mensaje);

public static int leerInt(String mensaje);

public static float leerFloat(String mensaje);

public static double leerDouble(String mensaje);

Métodos que capturan una excepción personalizada de la clase Exception:

public static char leerChar(String mensaje);

public static String leerString(String mensaje);

public static boolean leerSiNo(String mensaje); (donde "s" devuelve true y "n" devuelve false).

Si el usuario introduce un formato incorrecto, debe mostrarse un mensaje de error y repetirse la solicitud hasta que se introduzca correctamente.

____________________________________________
____________________________________________

Cómo Ejecutar los Ejercicios

Clonar el repositorio.

Abrir el proyecto en cualquier IDE compatible con Java, recomiendo IntelliJ al haber sido el utilizado.

Compilar y ejecutar utilizando la herramienta de construcción preferida pero se han creado directamente como proyectos independientes de Java.

Seguir los resultados de salida en la consola para verificar el correcto funcionamiento

Siguiendo las Buenas Prácticas se ha intentado que haya:

Aplicación de principios SOLID.

Gestión adecuada de excepciones.

Validaciones robustas de entrada de datos.

Documentación mediante comentarios.
