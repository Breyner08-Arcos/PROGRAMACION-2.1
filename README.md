# Taller de Nivelación PROGRAMACION II
## Parte Teorica

### GIT

1. *¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?*

Un repositorio en Git es como una carpeta de tu proyecto que, además de guardar los archivos, también recuerda todos los cambios que se han hecho a lo largo del tiempo. La diferencia con una carpeta normal es que en esta puedes ver versiones anteriores, recuperar archivos borrados, trabajar en equipo sin pisar el trabajo de otros y combinar cambios fácilmente.

2. *¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?*

Git maneja tres espacios donde viven tus archivos: el Working Directory, la Staging Area y el Repository. El Working Directory es la carpeta de trabajo en tu computadora, donde editas, creas y borras archivos; aquí tienes una copia de los archivos en el estado actual. La Staging Area, también llamada Index, es una zona de preparación para el commit donde decides qué cambios específicos entrarán en la próxima confirmación, usando comandos como git add. El Repository, que vive dentro de la carpeta oculta .git/, es la base de datos de Git que guarda todos los commits, ramas, tags y el historial completo del proyecto.

3. *¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag)*

Internamente, Git representa los cambios usando un sistema de objetos inmutables identificados por un hash (SHA-1 o SHA-256). Un objeto blob contiene el contenido de un archivo tal cual, sin su nombre. Un objeto tree representa un directorio, lista nombres de archivos y referencias a blobs u otros trees. Un objeto commit apunta a un tree que refleja el estado del proyecto en un momento dado, guardando información como autor, fecha, mensaje y referencia al commit padre. Un tag es una etiqueta que apunta a un commit específico, útil para marcar versiones o hitos importantes.

4. *¿Cómo se crea un commit y qué información almacena un objeto commit?*

Para crear un commit, primero editas archivos en el Working Directory. Luego seleccionas los cambios con git add, que los lleva al Staging Area. Finalmente, al ejecutar git commit, Git crea un objeto commit que apunta al tree actual y almacena el hash del commit padre (o padres si es un merge), el hash del tree, los datos del autor y committer (nombre, correo, fecha) y el mensaje del commit que describe los cambios.

5. *¿Cuál es la diferencia entre git pull y git fetch?*

La diferencia entre git pull y git fetch es que git fetch descarga commits, ramas y objetos del repositorio remoto pero no los fusiona con tu rama actual, mientras que git pull realiza un fetch y, además, intenta fusionar o rebasear esos cambios con tu rama actual. En otras palabras, fetch trae las novedades sin aplicarlas y pull trae las novedades y las integra de inmediato en tu trabajo.

6. *¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?*

Un branch en Git es una línea de desarrollo independiente que permite trabajar en nuevas características, correcciones o pruebas sin afectar la rama principal. Internamente, Git gestiona las ramas como punteros que apuntan a un commit específico dentro del historial. Cada vez que realizas un nuevo commit en una rama, el puntero se mueve automáticamente hacia el commit más reciente.

7. *¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?*

Un merge en Git se realiza cuando se quiere combinar el trabajo de una rama con otra. Esto se hace con el comando git merge nombre_rama. Los conflictos surgen cuando dos ramas modifican las mismas líneas de un archivo o cambian un mismo recurso de manera incompatible. Para resolverlos, se deben editar manualmente los archivos en conflicto, elegir qué cambios conservar o combinarlos, y luego hacer un commit que registre la resolución.

8. *¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?*

El área de staging (o index) es una zona intermedia donde se preparan los archivos antes de hacer un commit. Cuando usas git add, le indicas a Git qué cambios quieres incluir en el siguiente commit. Si omites este paso, los cambios no se registrarán en el commit y quedarán solo en tu directorio de trabajo, sin formar parte del historial.

9. *¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?*

El archivo .gitignore es una lista de patrones que le indica a Git qué archivos o carpetas debe ignorar. Esto se usa para evitar que archivos temporales, de configuración local o de dependencias se agreguen al repositorio. De esta forma, se mantiene limpio el historial y se evita compartir información innecesaria o sensible.

10. *¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?*

El comando git commit --amend modifica el último commit realizado, permitiendo corregir su mensaje o incluir cambios que se olvidaron. En cambio, un nuevo commit crea un registro adicional en la historia del repositorio. La diferencia clave es que --amend reemplaza el commit anterior, mientras que un commit nuevo lo añade al historial.

11. *¿Cómo se utiliza git stash y en qué escenarios es útil?*

El comando git stash guarda temporalmente los cambios no confirmados y devuelve el directorio de trabajo al último commit limpio. Es útil cuando necesitas cambiar de rama rápidamente o actualizar tu proyecto, pero no quieres perder tu trabajo en progreso. Luego puedes recuperar esos cambios con git stash pop o revisarlos con git stash list.

12. *¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?*

Git ofrece varios mecanismos para deshacer cambios. git reset mueve el puntero de la rama a un commit anterior y puede modificar el área de staging y el directorio de trabajo. git revert crea un nuevo commit que deshace los cambios de un commit específico sin alterar el historial. git checkout se usa para descartar cambios en archivos individuales o para moverse entre ramas y commits.

13. *¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?*

En Git, los remotos son referencias a repositorios externos. Por convención, origin se refiere al repositorio principal desde el que clonaste, mientras que upstream suele usarse para el repositorio original del cual tu proyecto es un fork. Para gestionar forks, normalmente configuras ambos remotos: git remote add upstream URL para el original y git remote -v para verificar. Luego puedes usar git fetch upstream y git merge upstream/main para mantener actualizado tu fork.

14.  *¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?* 

Puedes inspeccionar el historial de commits con git log, que muestra la lista de commits en orden cronológico inverso. Con git diff puedes comparar los cambios entre commits, ramas o con el directorio de trabajo. Finalmente, git show permite ver la información detallada de un commit específico, incluyendo su mensaje y las modificaciones en los archivos.

## Programación