# JavaJREyJDKcompileyejecutesuprimerprograma
curso de alura 
## frist command in java
firth exercise
Crate one archive with the name and extention .java `HolaMundo.java`, with commad `touch Hola mundo`.
the archive should contain the following code.
```java
public class HolaMundo {
  public status void main(String[] args) {
    System. out. println("¡Hola Mundo!");
  }
}
```

for see the contained of the archive, used the command `cat HolaMundo.java`
used te command `javac HolaMundo.java` with convert my archive in Byte Codes.
when accessing the folder with the command `ls`, shows the files, the new one has the extetion `.class`
for ejecuted the program used the command `java HolaMundo`, this translates in into a lenguage what it can computer understand

for view the archive used the command `vim Hola Mundo.class`, It is not understood, for that we pass it to hexadecimal with the command
in the vim `:%!xxd`.

view the JDK used te command `javap -c HolaMundo`
## lo que aprendimoslo que aprendimos

En la clase introductoria ya hemos aprendido varios temas fundamentales sobre Java.

Hablamos sobre las principales características de Java como:
	 - Orientado a objetos.
	 - Parecido a C++.
	 - Muchas librerías y una gran comunidad.
Además de eso, aprendimos:

	- La diferencia entre código fuente y Bytecode.
	- Para ejecutar el Bytecode necesitamos tener la máquina virtual de Java.
	- El Bytecode es independiente del sistema operativo.
Vimos también los principales componentes de la plataforma Java, que son:

	- Java Virtual Machine (JVM).
	- Lenguaje Java.
	- Librerias Java (API).
En la próxima clase vamos a escribir nuestro primer código en Java.
