# Proyecto de Automatización E2E - SauceDemo

Proyecto de automatización de pruebas end-to-end para la aplicación SauceDemo utilizando Serenity BDD, Cucumber y Selenium WebDriver.

## Tecnologías Utilizadas

- **Java 17**
- **Gradle** - Gestión de dependencias y construcción
- **Serenity BDD 3.3.0** - Framework de automatización
- **Cucumber** - BDD (Behavior Driven Development)
- **Selenium WebDriver** - Automatización de navegadores
- **JUnit 4** - Framework de pruebas
- **Firefox** - Navegador para ejecución de pruebas

## Estructura del Proyecto

```
src/
├── main/java/
│   ├── task/           # Clases de pasos de automatización
│   └── ui/             # Page Objects y localizadores
└── test/
    ├── java/
    │   ├── runners/    # Runners de Cucumber
    │   ├── stepdefinitions/ # Definiciones de pasos
    │   └── hooks/      # Hooks de configuración
    └── resources/
        ├── features/   # Archivos .feature de Cucumber
        ├── serenity.conf    # Configuración de Serenity
        └── serenity.properties # Propiedades adicionales
```

## Configuración

### Prerrequisitos
- Java 17 o superior
- Firefox instalado
- Gradle (incluido wrapper)

### Instalación
1. Descargar e instalar Java SE Development Kit 17.0.9
[Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. Descargar el binario de Gradle 
[Gradle 7.5](https://gradle.org/next-steps/?version=7.5&format=bin)
3. Descomprimir y crear una carpeta llamada Gradle en 'Archivos de programa'
4. Setear la variable de entorno JAVA_HOME = 'C:\Program Files\Java\jdk-17'
5. Setear la variable de entorno de sistma GRADLE_HOME = 'C:\Program Files\Gradle\gradle-7.5\gradle-7.5'
6. Editar la variable del sistema 'PATH' y agregar %GRADLE_HOME%\bin y %JAVA_HOME%\bin
7. Para poder navegar por la solucion de manera comoda se recomienda usar InteliJ IDEA
8. Instalar los plugins para IntelliJ: Cucumber for JAVA, Gherkin, Lombok y SonarQube for IDE.
9. Clonar el repositorio o descomprimir el .zip en la ruta E2E-BID\Proyectos\neoris-2e2
10. Ejecutar: `./gradlew build`

## Ejecución de Pruebas

### Ejecutar todas las pruebas
```bash
./gradlew test
```

### Ejecutar pruebas específicas
```bash
./gradlew test --tests "RunnerWebSauceDemo"
```

### Generar reportes
```bash
./gradlew test aggregate
```

Los reportes se generan en: `target/site/serenity/index.html`

## Escenarios de Prueba

### Feature: Compra
- **Escenario**: Realizar compra de 2 artículos
- **Datos de prueba**: Múltiples combinaciones de productos y datos de usuario
- **Validaciones**: Login, agregar productos, checkout y confirmación

## Configuración del Navegador

El proyecto está configurado para usar Firefox con las siguientes opciones:
- Modo no headless (ventana visible)
- Descarga automática del driver
- Configuraciones de seguridad optimizadas

## Estructura de Clases

### Mapeo de componentes
- `LoginPage` - Elementos de la página de login
- `ProductsPage` - Elementos de la página de productos  
- `CarPage` - Elementos del carrito y checkout

### Step Definitions
- `LoginSteps` - Pasos relacionados con autenticación
- `ProductsSteps` - Pasos para manejo de productos y compras

## Reportes

Serenity BDD genera reportes detallados que incluyen:
- Screenshots automáticos
- Logs de ejecución
- Métricas de cobertura
- Resultados por escenario
