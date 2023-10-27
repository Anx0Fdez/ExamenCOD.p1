# EXAMEN DAM PARTE 1

### Comandos Utilizados:

1. Hacemos el clonado del repositorio de GIT:
~~~
git clone https://github.com/damiancastelao/examenDAM.git
~~~

2. Realizamos cambios sobre el README.md

3. Hacemos un commit del README modificado en nuestro nuevo repositorio de GITHUB:
~~~
"BORRAMOS EL .git del la carpeta clonada"

git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Anx0Fdez/ExamenCOD.p1.git
git push -u origin main
~~~

4. Para hacer mas commit apartir de este paso se repetiria lo siguiente:
~~~
git add README.md
git commit -m "nombre"
git push -u origin main
~~~

5. Para subir el programa al repositorio de GITHUB en un primer lugar tenemos que tener el programa dentro de la carpeta que hemos clonado. Para posteriormente realizarle un commit a los archivos .java de su interior.
~~~
git add Boletin5.java consumo.java
git commit -m "boletin.v1"
git push -u origin main
~~~
 ***"TODO ESTO DESDE LA CONSOLA DE COMADOS USANDO COMANDOS COMO:"***
 ~~~
- ls (listar documentos que tenemos en determinada carpeta)
- mkdir (creación de nueva carpeta)
- cd (cambiar de fichero en el que nos encontramos)
- cd .. (volver hacia atrás)
- pwd (saber en qué fichero nos encontramos)
 ~~~

6. Finalmente realizamos un commit final al boletin y al README.md para subir al repositorio todos los archivos actualizados.

#### ***Anxo Fernadez Rodriguez DAM1***