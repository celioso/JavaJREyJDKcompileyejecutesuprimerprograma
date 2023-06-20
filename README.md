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

#### Descargas JDK https://www.oracle.com/in/java/technologies/downloads/#jdk20-windows

## Haz lo que hicimos: Instalando el JDK
El JDK (Java Development Kit) es un conjunto de herramientas y bibliotecas de software que permite el desarrollo de aplicaciones Java.
En la preparación del entorno, instalaremos el JDK para comenzar a desarrollar nuestros primeros programas en Java.
A pesar de que en los cursos estaremos trabajando con la versión 8 de Java puedes instalar el JDK más reciente para no tener problemas de compatibilidad y no tener problemas com la instalación de las versiones más recientes de el IDE Eclipse, recordando que aunque tengas la versión más reciente de Java puedes continuar ejecutando tus programas en la versión 8 para acompañar lo realizado en el curso basta configurar todo en el Build Path de la aplicación.

## Linux
En la terminal, ejecutamos el siguiente comando para actualizar la lista de paquetes disponibles para descargar en los repositorios del sistema:

`sudo apt update`

![Sudo ](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/linux1.png "Sudo ")

Una vez hecho esto, instalaremos la versión 17 del JDK mediante el siguiente comando:
`sudo apt install openjdk-17-jdk`

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/linux2.png)

De esta manera, el sistema descargará e instalará el paquete OpenJDK 17 JDK, lo que permitirá al usuario comenzar a desarrollar aplicaciones Java en Linux. Después de finalizar este proceso de instalación, ahora necesitamos configurar la variable de entorno JAVA_HOME, que se utiliza para indicar la ruta de instalación del JDK. Esto es necesario para utilizar los recursos del JDK, como javac.

Para ello, ejecutamos el comando sudo update-alternatives --config java, que mostrará la ruta donde se instaló el JDK.

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/linux3.png)

Ahora, copiamos esta ruta hasta /bin, por ejemplo: /usr/lib/jvm/java-17-openjdk-amd64/bin, y en tu terminal escribe el comando: export JAVA_HOME= seguido de la ruta que copiaste de la instalación del JDK, sin dejar espacios.

Por ejemplo:

`export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64/bin`

Presionamos la tecla "enter" y listo, el JDK está instalado y configurado. Para probarlo, escribe los siguientes comandos en la terminal:

```java
javac -version
java -version
```
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/linux5.png)

## Mac
1. Para instalar en Mac, puedes acceder al sitio web de Oracle(Java Downloads | Oracle) o buscar en el navegador "Java Download Oracle" y acceder al primer enlace.

1.  Ahora, necesitamos elegir la versión de Java. En este curso utilizaremos Java 17 LTS, que es la versión de soporte a largo plazo más reciente para la plataforma Java SE.
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/1e3.png)
1. Selecciona Mac como sistema operativo y realiza la descarga.
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/2.png)

## Windows
1. Para instalar en Windows, puedes acceder al sitio web de Oracle(Java [Java Downloads](https://www.oracle.com/java/technologies/downloads/#jdk17-windows "Java Downloads") | [Oracle](https://www.oracle.com/java/technologies/downloads/#jdk17-windows "Oracle")) o buscar en el navegador "Java Download Oracle" y acceder al primer enlace.

2. Ahora, necesitamos elegir la versión de Java. En este curso utilizaremos Java 17 LTS, que es la versión de soporte a largo plazo más reciente para la plataforma Java SE.
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/1e3.png)

3.  Selecciona Windows como sistema operativo y realiza la descarga.

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/4.png)

4. Selecciona Windows como sistema operativo y realiza la descarga.
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/5.png)

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/6.png)
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/7.png)

5. Después de la instalación, vamos a probar nuestro Java. Para hacer esto, utilizaremos la ventana de comandos. Prueba los siguientes comandos y verifica si todo ha salidcomo se esperaba
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/8.png)

Configuración de la **variable PATH** en **Windows**:

1. Ve al panel de control y busca "Sistema", luego haz clic en "Configuración avanzada del sistema".
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/img1.png)

2. En la pestaña "Avanzado", haz clic en "Variables de entorno".
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/img2.png)

3. Ahora se abrirá una nueva ventana en la parte inferior de la pantalla, selecciona la variable de entorno llamada "Path" y haz clic en "Editar".
![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/img3.png)

4. En esta nueva ventana, haz clic en el botón "Nuevo" y en la línea que se ha seleccionado, coloca la ruta hacia el directorio "bin" dentro de la carpeta "jdk", que se encuentra dentro de la carpeta "Java".

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+JDK/img4.png)

5. Una vez hecho esto, cierra la ventana de comandos y ábrela nuevamente. Prueba los siguientes comandos:

`java -version`
`javac -version`

## Para saber más: JVM vs JRE vs JDK
El mundo Java está lleno de siglas de 3 o 4 letras comenzando con la letra `J`. Ya debes conocer las dos más famosas, JRE y JDK. El primero es el ambiente de ejecución, el segundo son las herramientas de desarrollo junto con el ambiente de ejecución. Simplificando, podemos decir que:

`JDK = JRE + Herramientas de desarrollo`

Existe una tercera sigla, JVM (Java Virtual Machine), que también hemos usado durante el curso. La responsabilidad de la Java Virtual Machine es ejecutar el Bytecode, entonces ¿Cuál es la diferencia entre el JRE y la JVM si ambos ejecutan Bytecode?

La respuesta es simple: El JRE (Nuestro ambiente de ejecución) contiene la JVM, pero también posee varias librerías incluidas. Es decir, para ejecutar una aplicación Java no solo es necesario tener la JVM, también necesitamos de otras librerías.

Entonces, podemos simplificar:
`JRE = JVM + Librerías`
Es importante resaltar que no se puede descargar la JVM individualmente. Siempre tendremos que descargar el JRE que tiene la JVM y el conjunto de librerías.

#### Para saber más: ¿Cómo funcionan las versiones en Java?

Java es un lenguaje de programación que se actualiza periódicamente por Oracle, la empresa responsable de su desarrollo. Cada nueva versión de Java trae consigo nuevas características, mejoras de rendimiento, correcciones de errores y actualizaciones de seguridad. Estas versiones se numeran, siguiendo un patrón específico.

Cuando se lanza una nueva versión, puede incluir nuevas bibliotecas, clases, métodos y otros recursos que los desarrolladores pueden utilizar para crear aplicaciones Java más eficientes y con menos errores.

Aquí hay algunos ejemplos de algunas de las principales versiones de Java y sus características:

Java 8: Introdujo la programación funcional, incluyendo la interfaz java.util.function, que permite el uso de expresiones lambda. Además, se agregó una nueva API de fecha y hora que proporciona una forma más simple y segura de manejar fechas y horas.

Java 11: Introdujo el sistema de módulos de Java, que ayuda a simplificar la creación y mantenimiento de aplicaciones complejas. Además, se agregó la clase HttpClient, que admite comunicaciones HTTP/2.

Java 15: Agregó características como la palabra clave sealed, que permite que las clases restrinjan qué otras clases pueden extenderlas o implementarlas, y también agregó mejoras a la API Records, que ayuda a simplificar la creación de clases de datos inmutables.

Java 17: introduce nuevas características y mejoras, como patrones de coincidencia que mejoran la sintaxis al trabajar con estructuras de datos complejas. Además, se mejoran el rendimiento del recolector de basura para reducir la latencia en las aplicaciones Java. También se agregan funcionalidades a los registros, que son clases inmutables y compactas utilizadas para representar datos, incluyendo la capacidad de definir registros locales dentro de métodos. Otra adición importante son las nuevas clases y métodos en el paquete java.util para trabajar con estructuras de datos persistentes, lo que permite realizar cambios en los datos sin modificar las estructuras originales. Por último, se agrega soporte para CGroups en la API de Java, lo que permite una mejor administración de recursos en entornos de contenedores.

Al actualizar a una nueva versión de Java, es importante tener en cuenta la compatibilidad con versiones anteriores. A veces, se eliminan o modifican características o funcionalidades en una nueva versión, lo que puede afectar el código existente. Por esta razón, es importante probar su código al actualizar a una nueva versión de Java.

Además, es posible que coexistan diferentes versiones de Java en un sistema, lo que permite que las aplicaciones se ejecuten en versiones específicas de la JVM (Java Virtual Machine) para garantizar la compatibilidad con el código existente.

Visita nuestro artículo y conoce otras características de las diferentes versiones de Java.

[https://www.aluracursos.com/blog/caracteristica-destacables-java8-delante](https://www.aluracursos.com/blog/caracteristica-destacables-java8-delante)
### Lo que aprendimos
En esta clase escribiste tu primer código Java y aprendimos:

- Cuál es la diferencia entre JRE y JDK.
- Cómo compilar el código fuente de Java desde la línea de comandos (`javac`).
- Cómo ejecutar Bytecode en la línea de comando (`java`).
- Un programa Java debe escribirse dentro de una clase (`class`).
- Cada instrucción Java debe terminar con `;`.
- Para abrir y cerrar un bloque usaremos las llaves `{}`.
- Un programa Java tiene una entrada que es una función (método) `main`.
- Para imprimir algo en la consola, usamos la declaración `System.out.println ()`.