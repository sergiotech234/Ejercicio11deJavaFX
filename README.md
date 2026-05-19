# Formulario de Registro con Validación en Java

## Descripción

Este proyecto consiste en desarrollar una aplicación en **Java** con una interfaz gráfica que permite recoger información de un usuario mediante un formulario. El formulario incluye campos para **nombre**, **correo electrónico** y **contraseña**, validando que ninguno de ellos quede vacío antes de procesar la información.

El objetivo del ejercicio es practicar la creación de formularios, la validación de datos y la interacción con componentes gráficos utilizando **Swing**.

## Objetivos

- Crear un formulario con múltiples campos de entrada.
- Permitir introducir nombre, correo electrónico y contraseña.
- Validar que todos los campos estén completos.
- Mostrar mensajes de error cuando falte información.
- Mejorar la interacción entre usuario y aplicación.

## Estructura del proyecto

```text
Proyecto/
│
├── src/
│   └── Main.java
│
└── README.md
```

## Ejemplo de uso

Formulario:

```text
Nombre:        [____________]

Correo:        [____________]

Contraseña:    [____________]

            [ Registrar ]
```

Si algún campo está vacío:

```text
Error: Debe completar todos los campos.
```

Si todos los datos son válidos:

```text
Registro completado correctamente.
```
