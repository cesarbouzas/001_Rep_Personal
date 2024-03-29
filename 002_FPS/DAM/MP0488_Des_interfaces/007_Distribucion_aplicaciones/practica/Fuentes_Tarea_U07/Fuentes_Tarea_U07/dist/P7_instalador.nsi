!include "MUI2.nsh"

Name "Intslador de la P7 Cesar Bouzas";Titulo del instalador
OutFile "P7_DI.exe";Fichero que vamos a generar y utilizar como instalador
Unicode True
InstallDir "$PROGRAMFILES\P7_DI";Carpeta donde se intslará la aplicación por defecto
InstallDirRegKey HKCU "Software\P7_DI" "";definimos la clave de registro
RequestExecutionLevel user ;Privilegios para el instalaador .Admite user o admin
!define MUI_ABORTWARNIG

;Definimos las paginas o ventanas
!insertmacro MUI_PAGE_COMPONENTS
!insertmacro MUI_PAGE_DIRECTORY
!insertmacro MUI_PAGE_INSTFILES
!insertmacro MUI_UNPAGE_CONFIRM
!insertmacro MUI_UNPAGE_INSTFILES

;Configuramos el idioma del instalador
!insertmacro MUI_LANGUAGE "Spanish"

;Definimos el  componente que se va a poder señalar para instalar
Section "Fichero jar" SecDummy
SetOutPath "$INSTDIR"
File Fuentes_Tarea_U07.jar
SetOutPath $INSTDIR\lib ;Creamos la carpeta lib en el directorio donde se va a instalar la aplicacion
File lib\swing-layout-1.0.4.jar ;copiamos el contenido
WriteRegStr HKCU "Software\P7_DI" "" $INSTDIR
WriteUninstaller "$INSTDIR\Uninstall.exe";Definimos la opcion de desintalar
SectionEnd

;Descripciones que apareceran junto al componente cundo se selecciones

LangString DESC_SecDummy ${LANG_SPANISH} "Instalacion del fihero Fuentes_Tater_U07.jar"
!insertmacro MUI_FUNCTION_DESCRIPTION_BEGIN
	!insertmacro MUI_DESCRIPTION_TEXT ${SecDummy} $(DESC_SecDummy)
!insertmacro MUI_FUNCTION_DESCRIPTION_END

Section "Desistalar"
 Delete "$INSTDIR\Uninstall.exe"
 RMDir "$INSTDIR"
 DeleteRegKey /ifempty HKCU "Software\P7_DI"
 SectionEnd