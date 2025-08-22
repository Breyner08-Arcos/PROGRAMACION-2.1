# Taller de Nivelación PROGRAMACION II
## Parte Teorica

### GIT

1. **¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?**

Un repositorio en Git es como una carpeta de tu proyecto que, además de guardar los archivos, también recuerda todos los cambios que se han hecho a lo largo del tiempo. La diferencia con una carpeta normal es que en esta puedes ver versiones anteriores, recuperar archivos borrados, trabajar en equipo sin pisar el trabajo de otros y combinar cambios fácilmente.

2. **¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?**

Git maneja tres espacios donde viven tus archivos: el Working Directory, la Staging Area y el Repository. El Working Directory es la carpeta de trabajo en tu computadora, donde editas, creas y borras archivos; aquí tienes una copia de los archivos en el estado actual. La Staging Area, también llamada Index, es una zona de preparación para el commit donde decides qué cambios específicos entrarán en la próxima confirmación, usando comandos como git add. El Repository, que vive dentro de la carpeta oculta .git/, es la base de datos de Git que guarda todos los commits, ramas, tags y el historial completo del proyecto.

3. **¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag)**

Internamente, Git representa los cambios usando un sistema de objetos inmutables identificados por un hash (SHA-1 o SHA-256). Un objeto blob contiene el contenido de un archivo tal cual, sin su nombre. Un objeto tree representa un directorio, lista nombres de archivos y referencias a blobs u otros trees. Un objeto commit apunta a un tree que refleja el estado del proyecto en un momento dado, guardando información como autor, fecha, mensaje y referencia al commit padre. Un tag es una etiqueta que apunta a un commit específico, útil para marcar versiones o hitos importantes.

4. **¿Cómo se crea un commit y qué información almacena un objeto commit?**

Para crear un commit, primero editas archivos en el Working Directory. Luego seleccionas los cambios con git add, que los lleva al Staging Area. Finalmente, al ejecutar git commit, Git crea un objeto commit que apunta al tree actual y almacena el hash del commit padre (o padres si es un merge), el hash del tree, los datos del autor y committer (nombre, correo, fecha) y el mensaje del commit que describe los cambios.

5. **¿Cuál es la diferencia entre git pull y git fetch?**

La diferencia entre git pull y git fetch es que git fetch descarga commits, ramas y objetos del repositorio remoto pero no los fusiona con tu rama actual, mientras que git pull realiza un fetch y, además, intenta fusionar o rebasear esos cambios con tu rama actual. En otras palabras, fetch trae las novedades sin aplicarlas y pull trae las novedades y las integra de inmediato en tu trabajo.

6. **¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?**
Un branch en Git es una línea de desarrollo independiente que permite trabajar en nuevas características, correcciones o pruebas sin afectar la rama principal. Internamente, Git gestiona las ramas como punteros que apuntan a un commit específico dentro del historial. Cada vez que realizas un nuevo commit en una rama, el puntero se mueve automáticamente hacia el commit más reciente.