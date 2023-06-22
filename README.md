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
### Instala el IDE de Eclipse

Así como vimos en los videos, ahora descargaremos el IDE de Eclipse, para eso, sigue los pasos a continuación:

Atención: Es importante destacar que para instalar la versión más reciente de Eclipse en este caso Eclipse 4.27 (2023-03) es necesario tener instalada la versión 17 de Java, si en tu caso tienes la versión 8 de Java te recomendamos instalar Eclipse 4.16 (2020-06) que puedes encontrarlo en este [link](http:/https://www.eclipse.org/downloads/packages// "link") y de esta manera evitar errores de compatibilidad.

1. En primer lugar, ve al sitio web de [Eclipse](https://www.eclipse.org/ "Eclipse") y haz clic en el botón Download.

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+Eclipse/Eclipse-1.png)

2. Cuando hacemos clic, el sitio nos redirige a otra página, haz clic en el botón Download debajo de Get Eclipse.

3. El sitio nos llevará a la descarga de acuerdo con tu sistema operativo, así que ahora haz clic en Download y espera para finalizar.

4. Desde aquí, procede a la instalación de acuerdo con tu sistema operativo.

### Windows
Para instalar el IDE de Eclipse en Windows, sigue estos pasos:

4.1. Ejecuta el archivo que acabas de descargar y espera al instalador.

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+Eclipse/4.png)

4.2. El instalador de Eclipse nos dará varias opciones, para este curso, debemos elegir la opción Eclipse IDE for Java Developers.

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+Eclipse/5.png)


4.3. En esta nueva parte, haz clic en Install y espera. Cuando se complete la instalación, haz clic en el Launch para abrir Eclipse automáticamente.

![](https://caelum-online-public.s3.amazonaws.com/1736-java/Imagens+Eclipse/6.png)

### Linux
Para instalar el IDE de Eclipse en Linux, sigue estos pasos:

4.1. Extrae los archivos y ejecuta el archivo "eclipse-inst"

4.2. El instalador de Eclipse nos dará varias opciones, para este curso, debemos elegir la opción Eclipse IDE for Java Developers.

4.3. En esta nueva parte, haz clic en Install y espera. Cuando finalice la instalación, haz clic en el Launch para abrir Eclipse automáticamente.

### Mac
4.1. Extrae los archivos y ejecuta el instalador (eclipse).

4.2. El instalador de Eclipse nos dará varias opciones, para este curso, debemos elegir la opción Eclipse IDE for Java Developers.

4.3. En esta nueva parte, haz clic en Install y espera. Cuando finalice la instalación, haz clic en el Launch para abrir Eclipse automáticamente.

### Ejecutar nuestro programa en Eclipse

Ha llegado el momento de ejecutar nuestro código en Eclipse, sigue los pasos a continuación:

1. Cuando iniciamos Eclipse, nos pedirá que seleccionemos un " workspace ", que es donde se almacenarán tus proyectos. Si deseas personalizar esto, haz clic en Examinar ... y selecciona tu carpeta. En este curso utilizaremos la carpeta del workspace en sí.

2. Cierra la página de Welcome y comenzaremos Eclipse de la forma en que normalmente lo encontramos.

3. Haz clic en File y coloca el cursor en la línea new y verás que Eclipse nos dará algunas opciones. Elige Java project.

4.  En esta nueva ventana, nombraremos nuestro proyecto, elegiremos el nombre sintaxe-basica, recuerda verificar la versión de Java utilizada.

5.  Observa que tenemos un nuevo proyecto en View Package Explorer, guardaremos nuestro proyecto en esta carpeta src que se creó.

6.  En el directorio src, haz clic derecho, coloca el cursor en new y elige class.

7.  En esta nueva ventana, crearemos la clase con el nombre Programa, no te preocupes por las diversas opciones que nos ofrezca Eclipse. Haz clic en finish y tendremos nuestra clase de programa.

8. Antes de colocar System.out.println, escribe el método main. Ten la seguridad de que entenderemos mejor el método main durante el curso. Nuestro código se verá así:

```java
public class Programa {

    public static void main(String[] args){
        System.out.println("Hola mundo");
    }

}
```

9. Ten en cuenta que, durante la escritura, Eclipse intenta inferir algunas cosas, además de cerrar las comillas automáticamente.

10. Para ejecutar nuestro código, en la parte superior de Eclipse, haz clic en Run, luego en Run As y elige Java Application.

### utilizando el tipo double

Practiquemos un poco el uso de la variable de tipo doble:

1. Crea una clase "TestPuntoFlotante" y estructura tu método main.

2. Declara una variable salario con el valor de 1250.70, de la siguiente manera:

`double salario = 1250.70;`

Si el salario fuera del tipo int, recibiríamos un error, ya que tenemos decimales.

3. Imprime la variable de salario y verifica si el valor es correcto. Nuestro código debería verse así:
```java
    public class TestPuntoFlotante {
    
        public static void main(String[] args){
    
            double salario = 1250.70;
    
            System.out.println(salario);
        }
    
    }
```

4. Usa el + para concatenar la variable de salario con un texto:

`System.out.println ("mi salario es" + salario);`

5. Recuerda que no podemos colocar un valor de tipo flotante dentro de una variable de tipo int, prueba:

```java
public class TestPuntoFlotante {

    public static void main(String[] args){

        double salario = 1250.70;

        System.out.println(salario);

        int valor = 12.5;             //no compila.

        int valor2 = 0.0;             //no compila.

        double test = 125.50;        // compila

        int valor3 = test;           //no compila.

    }

}
```

Java está muy tipado, observa que incluso con el valor 0.0 nuestro código no se compilará, ¡así que ten cuidado con eso!

6. Prueba también un cálculo de división:

```java
int division = 5/2;
System.out.println (division);
```

Nuestra salida será la 2.

Es importante tener en cuenta que cuando hacemos una división inexacta, pero estamos dividiendo números enteros, Java siempre truncará el resultado. En este ejemplo, la salida siempre será 2.

Si la variable de división fuera de tipo double, tendríamos el mismo problema, la única diferencia sería que nuestra salida tendría un lugar decimal: 2.0

7. Para resolver el problema, coloca uno de los valores de división con algún lugar decimal, además de cambiar el tipo de variable a doble:

```java
double division = 5.0 / 2;
System.out.println (division);

Ahora obtendremos el resultado esperado: 2.5
```
### algunas conversiones en Java

Ahora practiquemos algunas conversiones en Java, para eso, sigue los pasos a continuación:

1. Crea una clase y escribe tu método principal, en el curso elegimos el nombre "TestConversion".

2. Escribe el siguiente código:

```java
public class TestConversion {

    public static void main(String[] args){
        double salario = 1270.50;
        int valor = salario;
    }

}
```

Este código no se compila, ya que estamos tratando de asignar una variable double dentro de una variable int, que no es posible en el lenguaje Java.

Sin embargo, recuerda que lo inverso es válido, es decir, podemos asignar un valor de tipo int dentro de una variable de tipo double.

3) Hay una manera de compilar este código. Para eso usaremos lo que llamamos casting, entonces, modifica tu código y agrega (`int`) antes de la variable de `salario`:

```java
public class TestConversion {

    public static void main(String[] args){
        double salario = 1270.50;
        int valor = (int) salario;
    }
}
```

Cuando hacemos el casting, le pedimos a Java que encuentre una manera de transformar el valor en el lado derecho de (int), en nuestro caso, la variable de salario, en su totalidad. De esa manera, Java transformará el double en int.

4. " Imprime " la variable de valor en la consola, para esto, agrega:

`System.out.println (valor);`

La salida será 1270.

Básicamente, para las variables primitivas, el casting no es más que hacer que esta conversión se realice cuando no se realiza automáticamente.

5) Por el momento, nuestra variable salario es del tipo double, ¿es esta la mejor opción? Prueba lo siguiente:

Escribe 3 variables de tipo double como se hace a continuación, la última variable (total) recibirá la suma de las otras dos, ten en cuenta:

```java
public class TestConversion {

    public static void main(String[] args){

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
```

Imaginamos que nuestra salida sería 0.3, pero obtenemos un número completamente diferente.

Debido a esta inconsistencia, el double no sería la mejor opción para guardar salarios. Hay otras mejores alternativas que veremos en otros cursos.

6. También probaremos el tipo float, para esto escribe la variable puntoflotante tipo float:

```java
public class TestConversion {

    public static void main(String[] args){

        float puntoFlotante = 3.14;   // aqui!

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
```

Por lo tanto, tendremos un error, ya que, para Java, 3.14 es un double. Este es el mismo problema que tuvimos al intentar almacenar un double dentro de un int. En el tipo double podemos almacenar 64 bits, en el float y en el int solo 32 bits. Esto puede provocar la pérdida de información, para que este código funcione, podemos hacer el casting, colocar (float) delante de 3.14, pero lo haremos de otra manera.

7. Dile a Java que el valor 3.14 es float, por lo tanto, pon f al final del número, nuestro código se verá así:

```java
public class TestConversion {

    public static void main(String[] args){

        float puntoFlotante = 3.14f;

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
```

### Type Casting

Como se ve en los videos, cuando intentamos poner un valor entero en una variable de tipo double, Java no muestra un error. Sin embargo, cuando intentamos poner un doble en una variable del tipo entero, tenemos un error de compilación.

Esta propiedad se produce porque Java convierte implícitamente de un tipo más pequeño a tipos "más grandes". De entero a double, por ejemplo.

Lo contrario no es cierto porque hay pérdida de datos cuando se realiza la conversión. Resultando en un " type mismatch" que muestra que esta instrucción es de tipos incompatibles.

Para realizar una conversión donde puede haber pérdida de información, es necesario hacer un type casting. Vea las instrucciones a continuación.

`int edad = (int) 30.0;`

En el caso anterior, es explícito que se realizará la conversión de doublé a entero. Vea cómo funciona el cast implícito y explícito en la tabla a continuación.

![cast implicito](https://cdn1.gnarususercontent.com.br/6/499608/71e5f633-2a96-4fa1-924d-15e6e86ab956.png "cast implisita")

Para comparar cada tipo primitivo más claramente, la siguiente tabla muestra el tamaño de cada uno.

![Tamaño dos tipos](https://www.alura.com.br/apostila-java-orientacao-objetos/assets/images/variaveis-primitivas-controle-fluxo/tamanho_tipos.png "Tamaño dos tipos")

### practicando char y String
Esta vez, practicaremos un poco el uso de los tipos **char** y **String**.

1. Crea una clase y estructura de tu método main, en la clase usamos el nombre **"TestCaracteres"**

2. Crea una variable de tipo **char**, como hicimos a continuación:

```java
public class TestCaracteres {

    public static void main(String[] args) {
        char letra = 'a';
    }
}
```

3. Imprime la variable en la consola:

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);
    }
}
```

Nuestra salida será: a

4. Como se menciona en el video, el tipo char contiene solo un carácter de la tabla Unicode, por eso, cuando pasamos un valor numérico, mostramos el carácter correspondiente al número en la tabla Unicode. Escribe el siguiente código y observa:

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;  // Compila!
        System.out.println(valor);
    }
}
```
El resultado de nuestro segundo System.out.println será: **A**

5. Para una segunda prueba, escribe lo siguiente:

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;           // Compila!
        System.out.println(valor);

        valor = valor + 1;         // No compila!
        System.out.println(valor);
    }
}
```

Nuestro código no compila, cuando escribimos esta suma, Java transforma automáticamente el resultado al tipo más grande, que en este caso es **int**, ya que el número 1 es un número entero.

6. Haz un casting para que este código se compile, para eso debemos escribir:

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);     // Compila!
        System.out.println(valor);
    }
}
```

Ten en cuenta que envolvemos la suma con paréntesis, por lo que le decimos a Java que queremos convertir el resultado de esa suma en **char**.

7. Ahora crea una variable de tipo String, observa que este tipo es diferente de los que habíamos usado hasta ahora, además, escribimos con la letra mayúscula inicial.

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         // Compila!
        System.out.println(valor);

        String palabra = "Alura cursos online de tecnología";
    }
}
```
Para **String**, debemos usar comillas dobles.

8. Imprime el **String** en la consola. Nuestro código se verá así:

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         
        System.out.println(valor);

        String palabra = "Alura  cursos online de tecnología";
        System.out.println(palabra);
    }
}
```

9. Concatena el **String** con el número **2020** de la siguiente manera:

```java
public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         // Compila!
        System.out.println(valor);

        String palabra = "Alura cursos online de tecnología";
        System.out.println(palabra);

        palabra = palabra + 2020;
        System.out.println(palabra);
    }
}
```

Ten en cuenta que el número 2020 aparece al final de la oración, esto se debe a que Java convierte automáticamente el número a **String**, de manera diferente a lo que sucedió con los tipos primitivos que vimos anteriormente.

### el condicional if

Ha llegado el momento de practicar nuestro condicional if:

1. Crea una clase y configura tu método main (usa el atajo Ctrl + Espacio). En esta clase elegimos el nombre **"TestCondicional"**.

2) Escribe **"Sysout"** y usa el atajo "Ctrl + Espacio", observa que Eclipse escribe `System.out.println (x);` automáticamente. Nuestro código es actualmente:

```java
public class TestCondicional {

    public static void main(String[] args) {
        System.out.println("probando condicionales");
    }
}
```

3. Crea la variable edad, de tipo entero e inicialízala con el valor 20:

```java
public class TestCondicional {

    public static void main (String [] args) {
        System.out.println("probando condicionales");
        int edad = 20;
    }
}
```

4. Escribe un código que pruebe si la variable edad es mayor o igual que 18, si es verdadero, mostraremos un mensaje, si es falso, mostraremos otro mensaje. Nuestro código debería verse así:

```java
public class TestCondicional {

    public static void main(String[] args) {
        System.out.println("probando condicionales");

        int edad = 20;

        if (edad >= 18) {
            System.out.println("Tienes más de 18 años");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Lamentablemente no puedes ingresar");
        }
    }
}
```

5. Crea una variable *cantidadPersonas* con el valor 3.

6. Agrega un **if** más después del else en el código para probar si esa persona está acompañada o no, de esta manera:

```java
public class TestCondicional {

    public static void main(String[] args) {

        System.out.println("probando condicionales");

        int edad = 20;
        int cantidadPersonas = 3;

        if (edad >= 18) {
            System.out.println("Tienes más de 18 años");
            System.out.println("Bienvenido ");
        } else {
            if (cantidadPersonas >= 2) {
                System.out.println("No tienes 18 años, pero puedes ingresar, porque estás acompañado");
            } else {
                System.out.println("Lamentablemente no puedes ingresar");
            }
        }

    }
}
```

Si lo deseas, rompe la línea de `System.out.println ()` para facilitar la lectura, dejándola así:

```java
System.out.println ("no tienes 18 años, pero puedes ingresar" 
    + "porque estás acompañado");
```